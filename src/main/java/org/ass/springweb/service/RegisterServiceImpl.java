package org.ass.springweb.service;

import org.ass.springweb.dto.LoginDto;
import org.ass.springweb.dto.RegisterDto;
import org.ass.springweb.entity.Register;
import org.ass.springweb.repository.RegisterRepository;
import org.ass.springweb.util.EDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterServiceImpl implements RegisterService {
	@Autowired
	private RegisterRepository registerRepository;

	@Override
	public void processSaveUser(RegisterDto registerDto) {
		Register register = new Register();
		register.setName(registerDto.getName());
		register.setEmail(registerDto.getEmail());
		register.setContactNumber(registerDto.getContactNumber());
		register.setPassword(EDUtil.encode(registerDto.getPassword()));
		register.setCountry(registerDto.getCountry());
		register.setPinCode(registerDto.getPincode());
		registerRepository.save(register);
	}

	public boolean isAutherised(LoginDto loginDto) {
		Register register = registerRepository.finalByEmail(loginDto.getEmail());
		if (register == null)
			return false;
		String decodedPassword = EDUtil.decode(register.getPassword());
		System.out.println(decodedPassword);
		if (decodedPassword == null)
			return false;
		return decodedPassword.equals(loginDto.getPassword()) ? true : false;
	}
}

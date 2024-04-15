package org.ass.springweb.service;

import org.ass.springweb.dto.LoginDto;
import org.ass.springweb.dto.RegisterDto;

public interface RegisterService {
	public void processSaveUser(RegisterDto registerDto);

	public boolean isAutherised(LoginDto loginDto);
}

package org.ass.springweb.config;

import java.util.Properties;
import javax.sql.DataSource;
import org.hibernate.cfg.Environment;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
@Configuration
public class MysqlDbConfiguration {
	@Bean
public LocalSessionFactoryBean getSessionFactory()
{
	LocalSessionFactoryBean sessionFactory=new LocalSessionFactoryBean();
	sessionFactory.setDataSource(getDataSource());
	sessionFactory.setPackagesToScan("org.ass.springweb.entity");
	sessionFactory.setHibernateProperties(getHibernateProperties());
	return sessionFactory;
	
}
	@Bean
	public DataSource getDataSource()
	{
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setUrl("jdbc:mysql://localhost:3306/DataBase");
		dataSource.setUsername("root@gmail.com");
		dataSource.setPassword("root@123");
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		return dataSource;
	}
	public static Properties getHibernateProperties()
	{
		Properties properties=new Properties();
		properties.setProperty(Environment.HBM2DDL_AUTO, "update");
		properties.setProperty(Environment.SHOW_SQL, "true");
		return properties;
		
	}
}

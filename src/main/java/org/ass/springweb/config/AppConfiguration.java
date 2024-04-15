package org.ass.springweb.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan("org.ass.springweb")
public class AppConfiguration {
public AppConfiguration()
{
	System.out.println(this.getClass().getSimpleName());
}
}

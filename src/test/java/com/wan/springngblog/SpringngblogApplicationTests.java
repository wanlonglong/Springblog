package com.wan.springngblog;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootTest
class SpringngblogApplicationTests {


	public PasswordEncoder passwordEncoder;
	public PasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder();
	}

	@Test
	void contextLoads() {

		String s = passwordEncoder().encode("test");


		System.out.println(s);

 	}

}

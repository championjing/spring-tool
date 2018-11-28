package cn.coderstyle.tool.config;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ABC {

	@Value("${abc}")
	private String str;
	
	@Value("${cd}")
	private String strcd;
	
	@PostConstruct
	public void test() {
		System.out.println("str:"+str);
		System.out.println("strcd:"+strcd);
	}
}

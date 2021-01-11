package com.zw.cn;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

/**
 * @author Wei Zhao
 * @desc 描述
 * @crete time 2021/1/8/0008 19:54
 */
@Scope(proxyMode = ScopedProxyMode.NO, scopeName = "singleton")
public class AnnotationTest {

	@Bean(name = "Main")
	public static void main(String[] args) {
		System.out.println("AnnotationTest");
	}

}

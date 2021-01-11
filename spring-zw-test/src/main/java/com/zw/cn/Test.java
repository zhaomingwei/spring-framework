package com.zw.cn;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Wei Zhao
 * @desc 描述
 * @crete time 2021/1/6/0006 20:03
 */
public class Test {

	public static void main(String[] args) {

		System.out.println(1);

		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AnnotationTest.class);

		System.out.println(2);

		System.out.println(ac.getBean("annotationTest"));
		System.out.println(ac.getBean("annotationTest"));
		System.out.println(ac.getBean("annotationTest"));

//		String[] beanDefinitionNames = ac.getBeanDefinitionNames();
//		for (String beanName : beanDefinitionNames) {
//			if("annotationTest".equals(beanName)){
//				System.out.println(beanName);
//			}
//		}

//		ac.close();
	}

}

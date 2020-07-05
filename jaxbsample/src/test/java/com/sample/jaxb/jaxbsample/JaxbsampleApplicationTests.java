package com.sample.jaxb.jaxbsample;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.event.annotation.BeforeTestClass;
import org.springframework.test.context.event.annotation.BeforeTestExecution;
import org.springframework.test.context.event.annotation.BeforeTestMethod;

@SpringBootTest
class JaxbsampleApplicationTests {

	@Autowired
	JaxbsampleApplication jaxb;
	int size;

	@Test
	void contextLoads() {
	}

	@BeforeTestClass
	void marbefore() {
		System.out.println("**********************");
	}

	@BeforeTestMethod
	void marbefore1() {
		System.out.println("***11111111111*******************");
	}

	@BeforeTestExecution
	void marbefore2() {
		System.out.println("*2222222222*********************");
	}

	/*
	 * @Test public void unmarshallingSample() {
	 * System.out.println(">>>>>>>>>>>>>>>>>>>>>>>"+jaxb.unmarshallingSample());
	 * assertEquals(20, jaxb.unmarshallingSample());
	 * 
	 * 
	 * assertEquals(2, jaxb.unmarshallingSample(), "Test ss"); return size;
	 * 
	 * 
	 * 
	 * }
	 */

}

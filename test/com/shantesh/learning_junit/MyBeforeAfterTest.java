package com.shantesh.learning_junit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyBeforeAfterTest {
	@BeforeAll
	static void settUPP(){
		System.out.println("this is before all");
	}

	@BeforeEach
	void settttttUp(){
		System.out.println("this is before each");
	}
	
	@Test
	void test1() {
		System.out.println("this is test1");
	}
	@Test
	void test2() {
		System.out.println("this is test2");
	}
	@Test
	void test3() {
		System.out.println("this is test3");
	}

	@AfterEach
	void aftereach(){
		System.out.println("this is after each");
	}
	
	@AfterAll
	static void afterall(){
		System.out.println("this is after all");
	}
	
}

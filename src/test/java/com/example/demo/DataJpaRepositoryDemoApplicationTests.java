package com.example.demo;

import com.example.demo.Controller.Controllerdemo;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DataJpaRepositoryDemoApplicationTests {

	@Test
	void contextLoads() {
	}
	@Test
	public void testRealme() {
		Controllerdemo controller = new Controllerdemo();
		String result = controller.realme();
		assertEquals("hey-This method is only for testing", result);
		//test class created
	}

}

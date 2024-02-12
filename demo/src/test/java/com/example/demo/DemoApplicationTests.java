package com.example.demo;

import com.example.demo.pages.HomePage;
import com.example.demo.starter.BasePage;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests extends BasePage{

    @Autowired
    public HomePage homePage;

	@Autowired
	public BasePage basePage;


	@Test
	void contextLoads() throws InterruptedException {
		basePage.start();
		homePage.enterUsername("admin");
		homePage.enterPassword("admin123");
		homePage.clickLogin();
	}

}

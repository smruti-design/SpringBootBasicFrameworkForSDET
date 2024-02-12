package com.example.demo.starter;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

@Component
public class BasePage {

    @Autowired
    public WebDriver webDriver;

    @Value("${url}")
    public String url;


    @BeforeMethod
    public void start() throws InterruptedException {
        webDriver.get(url);
        Thread.sleep(5000);
    }
}

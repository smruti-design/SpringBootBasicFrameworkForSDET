package com.example.demo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HomePage {

    @Autowired
    public WebDriver webDriver;


    private final By username = By.xpath("//*[@name='username']");
    private final By password = By.xpath("//input[@name='password' and @placeholder='Password']");
    private final By login = By.xpath("//button[@type='submit']");

    public void enterUsername(String name) {
        webDriver.findElement(username).sendKeys(name);
    }

    public void enterPassword(String pass) {
        webDriver.findElement(password).sendKeys(pass);
    }

    public void clickLogin() {
        webDriver.findElement(login).click();
    }


}

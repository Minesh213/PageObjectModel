package com.demo.nopcommerce;

import com.demo.nopcommerce.Base.BasePage;
import com.demo.nopcommerce.Pages.RegisterPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Properties;

public class RegisterTest {
    WebDriver driver;
    BasePage basePage;
    Properties prop;
    RegisterPage registerPage;

    @BeforeMethod
    public void openBrowser() {
        basePage = new BasePage();
        prop = basePage.initialiseProperties();
        String webEngine = prop.getProperty("browser");
        driver = basePage.initialiseDriver(webEngine);
        driver.get(prop.getProperty("url"));
        registerPage = new RegisterPage(driver);

    }

    @Test
    public void registertest() {
        registerPage.Clickonregisterlink();
        registerPage.doregister(prop.getProperty("first"), prop.getProperty("last") );
        registerPage.dobirthdate(prop.getProperty("date"),prop.getProperty("month"),prop.getProperty("Year"), prop.getProperty("account") );
        registerPage.docompanyname(prop.getProperty("cmny"));
        registerPage.Clickonnewsletter();
        registerPage.dopassword(prop.getProperty("pswd"),prop.getProperty("conpswd"));
        registerPage.ClickRegister();
    }


}

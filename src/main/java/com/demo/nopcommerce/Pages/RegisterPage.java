package com.demo.nopcommerce.Pages;

import com.demo.nopcommerce.Utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
    WebDriver driver;
    Utils utils;
    By Registerlink = By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a");
    By FirstName =By.id("FirstName");
    By LastName=By.id("LastName");
    By Date=By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[1]");
    By Month=By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[2]");
    By Year =By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[3]");
    By Email= By.id("Email");
    By Company= By.id("Company");
    By news= By.id("Newsletter");

    By password=By.id("Password");
    By confirmPassword=By.id("ConfirmPassword");
    By register=By.id("register-button");
    public RegisterPage(WebDriver driver) {
        this.driver = driver;
        utils = new Utils(driver);
    }

    public void Clickonregisterlink() {
        utils.doClick(Registerlink);
        utils.doClick(By.id("gender-male"));

    }
    public  void doregister(String first,String last){
        utils.doSendkey(FirstName,first);
        utils.doSendkey(LastName,last);
    }
    public void  dobirthdate(String date, String month, String year,String account){
        utils.doSendkey(Date,date);
        utils.doSendkey(Month,month);
        utils.doSendkey(Year,year);
        utils.doSendkey(Email,account);


    }
    public void docompanyname(String cmny){
        utils.doSendkey(Company,cmny);
    }
    public void Clickonnewsletter(){
        utils.doClick(news);
    }
    public void dopassword(String pswd,String conpswd){
        utils.doSendkey(password,pswd);
        utils.doSendkey(confirmPassword,conpswd);

    }
    public void ClickRegister(){
        utils.doClick(register);
    }




}
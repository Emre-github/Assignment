package com.gittigidiyor.pages;
import com.gittigidiyor.utilities.BrowserUtils;
import com.gittigidiyor.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class LoginPage extends BasePage{

    public LoginPage(){
        PageFactory.initElements(Driver.get(), this);
    }
    @FindBy(xpath = "//*[text()='Giriş Yap']")
    public WebElement login;

    @FindBy(xpath = "//a[@data-cy='header-login-button']")
    public WebElement secondLogin;

    @FindBy(id="L-UserNameField")
    public WebElement userName;


    @FindBy(xpath = "//input[@name='sifre']")
    public WebElement password;

    @FindBy(id = "gg-login-enter")
    public WebElement submit;

    public void login(String userNameStr, String passwordStr) {

        userName.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        BrowserUtils.waitFor(2);
        submit.click();
        // verification that we logged

    }
}

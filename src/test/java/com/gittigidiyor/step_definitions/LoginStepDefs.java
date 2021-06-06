package com.gittigidiyor.step_definitions;


import com.gittigidiyor.pages.LoginPage;
import com.gittigidiyor.utilities.ConfigurationReader;
import com.gittigidiyor.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class LoginStepDefs {
LoginPage loginPage=new LoginPage();
    @Given("the user is on the home page")
    public void the_user_is_on_the_home_page() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
    }

    @When("the user navigates to login page")
    public void the_user_navigates_to_login_page() {
        WebElement login=loginPage.login;
        login.click();
        WebElement giris=loginPage.secondLogin;
        giris.click();


    }

    @When("the user enters username and password")
    public void the_user_enters_and_username_and_password() {
        String username = ConfigurationReader.get("username");
        String password = ConfigurationReader.get("password");
        loginPage.login(username,password);

    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {
        String expected="Hesabım";
        String hesabım="//*[text()='Hesabım']";
        String actual=Driver.get().findElement(By.xpath(hesabım)).getText();

        Assert.assertTrue(" ",actual.contains(expected));


    }





}

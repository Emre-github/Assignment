package com.gittigidiyor.step_definitions;

import com.gittigidiyor.pages.BasketPage;
import com.gittigidiyor.utilities.BrowserUtils;
import com.gittigidiyor.utilities.Driver;
import io.cucumber.java.en.*;
import com.gittigidiyor.pages.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AddingToBasketStepDefs {

BasketPage basketPage=new BasketPage();
    @Given("the user enters name of the item in search box")
    public void the_user_enters_name_of_the_item_in_search_box() {
        WebElement searchBox=basketPage.search;
        searchBox.click();
        searchBox.sendKeys("bilgisayar");
        WebElement bulbutton=basketPage.bulButton;
        bulbutton.click();
        BrowserUtils.waitFor(2);


    }

    @When("the user navigates to item's second page")
    public void the_user_navigates_to_item_s_second_page() {
        WebElement secondPage=basketPage.secondpage;
        secondPage.click();
        BrowserUtils.waitFor(2);
    }

    @When("the user selects an item from second page of the item's page")
    public void the_user_selects_an_item_from_second_page_of_the_item_s_page() {
        WebElement choosenItem=basketPage.choosenItem;
        choosenItem.click();
        BrowserUtils.waitFor(2);
    }

    @When("the user keeps the information of the item in txt file")
    public void the_user_keeps_the_information_of_the_item_in_txt_file() {
        String infoOfItem=Driver.get().findElement((By) basketPage.choosenItemInfo).getText();
        String priceOfItem=Driver.get().findElement((By) basketPage.priceChoosenItem).getText();
        try {
            File file = new File("fileInfoOfChosenItem");
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
                bw.write((infoOfItem));
                bw.write((priceOfItem));

            bw.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Then("the user adds the item to the basket")
    public void the_user_adds_the_item_to_the_basket() {
       WebElement addingBasket=basketPage.addingBasket;
       addingBasket.click();
       String priceOnItemPage=Driver.get().findElement((By) basketPage.priceChoosenItem).getText();
       String priceInBasket=Driver.get().findElement((By) basketPage.priceBasket).getText();
       Assert.assertEquals(priceOnItemPage,priceInBasket);
    }





    @Given("the user has already added an item to the basket")
    public void the_user_has_already_added_an_item_to_the_basket() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("the user increases the quantity of the item as {int}")
    public void the_user_increases_the_quantity_of_the_item_as(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("the user deletes items from the basket")
    public void the_user_deletes_items_from_the_basket() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the basket should be empty")
    public void the_basket_should_be_empty() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}

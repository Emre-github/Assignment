package com.gittigidiyor.step_definitions;

import com.gittigidiyor.pages.BasketPage;
import com.gittigidiyor.utilities.BrowserUtils;
import com.gittigidiyor.utilities.Driver;
import io.cucumber.java.en.*;
import com.gittigidiyor.pages.BasePage;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

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
        String secondPageExpected="Bilgisayar - GittiGidiyor - 2/100";
        String actualSecondPage=Driver.get().getTitle();
        Assert.assertEquals(actualSecondPage,secondPageExpected);

    }

    @When("the user selects an item from second page of the item's page")
    public void the_user_selects_an_item_from_second_page_of_the_item_s_page() {
        WebElement choosenItem=basketPage.choosenItem;
        choosenItem.click();
        BrowserUtils.waitFor(2);
    }

    @When("the user keeps the information of the item in txt file")
    public void the_user_keeps_the_information_of_the_item_in_txt_file() throws IOException {
        //Driver.get().findElement()
        //String infoOfItem=Driver.get().findElement(basketPage.choosenItemInfo).getText();
        //String priceOfItem=Driver.get().findElement((By) basketPage.priceChoosenItem).getText();
        //BrowserUtils.getElementsText((By) basketPage.choosenItemInfo);
        //BrowserUtils.getElementsText((By) basketPage.priceChoosenItem);
       // File file1 = new File("itemInfo.txt");
        //FileWriter fw = new FileWriter(file1);
        //WebElement choosenItemInfo=Driver.get().findElement((By) basketPage.choosenItemInfo);
        //String itemInfo=choosenItemInfo.getText();
        //System.out.println(itemInfo);
        //fw.write(String.valueOf(itemInfo));
        //List<WebElement> list={choosenItemInfo,basketPage.priceChoosenItem};
        //BrowserUtils.getElementsText();
    }

    @Then("the user adds the item to the basket")
    public void the_user_adds_the_item_to_the_basket() {
        //String popup="//*[@class='wis-clsbtn-99131']";
        //Driver.get().findElement(By.xpath(popup)).click();
        WebElement addingBasket=basketPage.addingBasket;
        addingBasket.click();
        WebElement basket=basketPage.basket;
        basket.click();
    }






}

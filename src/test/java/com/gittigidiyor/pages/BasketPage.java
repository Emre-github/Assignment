package com.gittigidiyor.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasketPage extends BasePage{

    @FindBy(xpath = "//input[@type='text']")
    public WebElement search;

    @FindBy(xpath = "//*[text()='BUL']")
    public WebElement bulButton;

    @FindBy(xpath = "(//*[@href='/arama/?k=bilgisayar&sf=2'])[1]")
    public WebElement secondpage;

    @FindBy(xpath = "//*[@src='https://mcdn01.gittigidiyor.net/69537/tn30/695373966_tn30_0.jpg?162297']")
    public WebElement choosenItem;

    @FindBy(xpath = "//*[@id='sp-title']")
    public WebElement choosenItemInfo;

    @FindBy(id = "sp-price-lowPrice")
    public WebElement priceChoosenItem;

    @FindBy(xpath = "//*[@class='gg-d-8 detail-price']")
    public WebElement priceBasket;
    @FindBy(xpath = "//*[@id='add-to-basket']")
    public WebElement addingBasket;

    @FindBy(xpath = "//*[@class='amount']")
    public WebElement amountitem;


}

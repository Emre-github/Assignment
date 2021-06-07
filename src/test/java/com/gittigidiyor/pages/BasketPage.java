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

    @FindBy(xpath = "(//*[contains(text(),'Dell Inspiron')])[2]")
    public WebElement choosenItem;

    @FindBy(xpath = "//*[@id='sp-title']")
    public WebElement choosenItemInfo;

    @FindBy(id = "sp-price-lowPrice")
    public WebElement priceChoosenItem;

    @FindBy(xpath = "//*[@class='gg-d-8 detail-price']")
    public WebElement priceBasket;
    @FindBy(xpath = "//*[@id='add-to-basket']")
    public WebElement addingBasket;

    @FindBy(className = "basket-title")
    public WebElement basket;

    @FindBy(xpath = "//*[@class='amount']")
    public WebElement amountitem;

    @FindBy(css = ".gg-icon.gg-icon-bin-medium")
    public  WebElement delete;

    @FindBy(xpath = "//div[text()='Ürün Toplamı (0 Adet)']")
    public WebElement numberOfItems;

}

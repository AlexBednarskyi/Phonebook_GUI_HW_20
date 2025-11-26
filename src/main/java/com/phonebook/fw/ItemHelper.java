package com.phonebook.fw;

import com.phonebook.core.BaseHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ItemHelper extends BaseHelper {

    public ItemHelper(WebDriver driver) {
        super(driver);
    }

    public void addSecondItemToCart() {
        click(By.xpath("(//button[contains(.,'Add to cart')])[2]"));
    }

    public void openShoppingCart() {
        click(By.cssSelector("[href='/cart']"));
    }

    public boolean isItemWithNamePresent(String name) {
        return isElementPresent(By.xpath("//td[contains(.,'" + name + "')]"));
    }
}

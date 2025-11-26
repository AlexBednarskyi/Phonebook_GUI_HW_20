package com.phonebook.tests;

import com.phonebook.core.TestBase;
import com.phonebook.data.UserData;
import com.phonebook.models.User;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ItemTests extends TestBase {

    @BeforeMethod
    public void ensurePreconditions() {
        if (!app.getUser().isSignOutButtonPresent()) {
            app.getUser().login(new User()
                    .setEmail(UserData.email)
                    .setPassword(UserData.password));
        }
    }

    @Test
    public void addItemToCartTest() {
        app.getItem().addSecondItemToCart();
        app.getItem().openShoppingCart();

        Assert.assertTrue(app.getItem().isItemWithNamePresent("EXPECTED ITEM NAME"));
    }
}

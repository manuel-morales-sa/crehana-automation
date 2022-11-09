package com.crehana.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://www.crehana.com/co/")
public class HomePage extends PageObject {
    public static final Target LOGIN = Target.the("login").
            located(By.id("login_mainMenu"));

}

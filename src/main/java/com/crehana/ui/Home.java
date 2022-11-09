package com.crehana.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Home {
    public static final Target LOGIN = Target.the("login").
            located(By.id("login_mainMenu"));

}

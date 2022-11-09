package com.crehana.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features ="src/test/resources/features/login_users.feature",
glue = "com.crehana.steps",
snippets = CucumberOptions.SnippetType.CAMELCASE)
public class LoginUserRunners {
}

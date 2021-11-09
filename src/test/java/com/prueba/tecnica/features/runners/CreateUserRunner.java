package com.prueba.tecnica.features.runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/create/CreateUser.feature",
                 glue = "com.prueba.tecnica.features.step_definitions" )

public class CreateUserRunner { }

package com.nttdata.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features ="D://NTTDATA//ExamenAndroid//untitled//src//test//resources//features",
        glue ="com.nttdata.stepsdefinitions",
        tags ="@testProductos"
)

public class CucumberTestSuite {
}

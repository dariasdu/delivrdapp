package com.bancolombia.certificacion.delivrdapp.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/delivrdapp.feature",
glue="com.bancolombia.certificacion.delivrdapp.stepdefinitions",
snippets=SnippetType.CAMELCASE)
public class delivrdappRunner {

}

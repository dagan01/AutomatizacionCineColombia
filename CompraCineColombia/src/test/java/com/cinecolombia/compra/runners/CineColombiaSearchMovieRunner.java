package com.cinecolombia.comprar.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (plugin ={"pretty","html:C:\\Users\\SBMEDADMIN\\eclipse-workspace\\CompraCinecolombia"},
					features="src/test/resources/features/BuscarPelicula.feature",
					glue = "com.cinecolombia.comprar.stepDefinitions",
					snippets = SnippetType.CAMELCASE
)

public class CineColombiaSearchMovieRunner {

	
}

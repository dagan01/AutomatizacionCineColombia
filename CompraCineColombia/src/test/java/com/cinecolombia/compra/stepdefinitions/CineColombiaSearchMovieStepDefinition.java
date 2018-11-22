package com.cinecolombia.comprar.stepDefinitions;

import org.openqa.selenium.WebDriver;

import com.cinecolombia.comprar.tasks.GoToPage;
import com.cinecolombia.comprar.tasks.OpenTheBrowser;
import com.cinecolombia.comprar.userinterfaces.CineColombiaHomePage;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class CineColombiaSearchMovieStepDefinition {
	
	//Inicializamos el Driver
	@Managed(driver = "Chrome")
	WebDriver hisDriver;
	
	//Definimos el actor para el metodo
	private Actor daniel = Actor.named("Daniel");
	
	//
	private CineColombiaHomePage cineColombiaHomePage;
	
	//
	@Before
	public void setup() {
		daniel.can(BrowseTheWeb.with(hisDriver));
	}
	
	@Given("^that user want to open cine colombia page$")
	public void thatUserWantToOpenCineColombiaPage() {
		
		daniel.wasAbleTo(OpenTheBrowser.at(cineColombiaHomePage));    
	}

	@When("^user go to cartelera option$")
	
	public void userGoToCarteleraOption() {
		
		daniel.attemptsTo(GoToPage.theApp());
		//daniel.attemptsTo(SearchWord.the());
		//daniel.should(seeThat(TheResult.is(),equalTo(expectedWord)));
	//	daniel.attemptsTo(GoToPage.the());
		
	}

	@Then("^he see all the movie to select$")
	public void heSeeAllTheMovieToSelect() {
		//daniel.should(seeThat(TheResult.is(),equalTo(expectedWord)));
	    
	}

}

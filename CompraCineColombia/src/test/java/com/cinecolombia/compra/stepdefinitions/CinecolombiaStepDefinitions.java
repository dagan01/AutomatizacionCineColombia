package com.cinecolombia.compra.stepdefinitions;


import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

import org.openqa.selenium.WebDriver;

import com.cinecolombia.compra.questions.TheMovieIs;
import com.cinecolombia.compra.task.OpenThePage;
import com.cinecolombia.compra.task.Select;
import com.cinecolombia.compra.userinterface.CineColombiaShoppingPage;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class CinecolombiaStepDefinitions {
	
	@Managed (driver="Chrome")
	private WebDriver herBrowser;
	private Actor malory= Actor.named("Malory");
	
	@Before 
	public void ConfiguracionInicial(){
		malory.can(BrowseTheWeb.with(herBrowser));
	}
	
	@Given("^that malory wants to enter the cinecolombia page$")
	public void that_malory_wants_to_enter_the_cinecolombia_page(){
		malory.wasAbleTo(OpenThePage.TheCineColombiaPage());
	}

	@When("^select the movie (.*)$")
	public void select_the_movie(String pelicula)  {
		//System.out.println(pelicula);
		malory.attemptsTo(Select.TheMovie(pelicula));
	}
	
	@Then("^she can see the page of the movie and its (.*)$")
	public void she_can_see_the_page_of_the_movie_and_its(String title) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(CineColombiaShoppingPage.PELICULA.toString());
		malory.should(seeThat(TheMovieIs.displayed(),equalTo(title)));
	}

}

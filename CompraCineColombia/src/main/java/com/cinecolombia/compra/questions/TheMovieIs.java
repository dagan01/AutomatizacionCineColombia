package com.cinecolombia.compra.questions;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class TheMovieIs implements Question<String> {

	@Override
	public String answeredBy(Actor actor) {
		// TODO Auto-generated method stub
		return Text.of(Target.the("Titulo")
				.located(By.xpath("//*[@id=\"content\"]/div/div[1]/div[1]/h1")))
                .viewedBy(actor)
                .asString();
	}
	
	public static Question<String> displayed() {
        return new TheMovieIs();
    }

}

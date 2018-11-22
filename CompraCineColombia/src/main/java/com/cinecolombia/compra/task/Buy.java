package com.cinecolombia.compra.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.cinecolombia.compra.userinterfaces.InformOfMovie;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class Buy implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(Click.on(InformOfMovie.CINE),
				Click.on(InformOfMovie.CINE_HORA));
	}

	public static Buy TheMovie() {
		// TODO Auto-generated method stub
		return instrumented(Buy.class);
	}
	
}

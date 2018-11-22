package com.cinecolombia.compra.tasks;

import com.cinecolombia.compra.userinterfaces.CineColombiaOptions;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class GoTo implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(Click.on(CineColombiaOptions.CINECOLOMBIA_CANCEL));
		actor.attemptsTo(Click.on(CineColombiaOptions.CINECOLOMBIA_SELECT_CARTELERA));
	}
	
	public static GoTo MoviesInCartelera() {
		// TODO Auto-generated method stub
		return instrumented(GoTo.class);
	}
	
}

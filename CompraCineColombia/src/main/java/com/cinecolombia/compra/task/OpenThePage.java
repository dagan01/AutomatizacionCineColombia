package com.cinecolombia.compra.task;

import com.cinecolombia.compra.userinterface.CineColombiaShoppingPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenThePage implements Task{
	
	public CineColombiaShoppingPage cineColombiaShoppingPage ;

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(cineColombiaShoppingPage));		
		
	}

	public static Performable TheCineColombiaPage() {
		// TODO Auto-generated method stub
		 return Tasks.instrumented(OpenThePage.class);
	}
	
	
	

}

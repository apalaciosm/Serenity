package co.com.choucair.certifitation.AcademyTest.tasks;

import co.com.choucair.certifitation.AcademyTest.userinterface.ChoucairAcademyPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;


public class OpenUp implements Task {
     ChoucairAcademyPage choucairAcademyPage;


    @Override
    public <T extends Actor>   void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(choucairAcademyPage));

    }
    public static OpenUp thePage() {
        return Tasks.instrumented(OpenUp.class);
    }
}



package project_banistmo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import project_banistmo.UserInterface.SearchPDF;

public class Search implements Task {


    public static Search PDFfile() {
        return Tasks.instrumented(Search.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Scroll.to(SearchPDF.BUTTON_LEARN_EASY),
                Click.on(SearchPDF.BUTTON_LEARN_EASY),
                Scroll.to(SearchPDF.BUTTON_LEGALES),
                Click.on(SearchPDF.BUTTON_LEGALES),
                Scroll.to(SearchPDF.BUTTON_FATCA_CRS),
                Click.on(SearchPDF.BUTTON_FATCA_CRS),
                Scroll.to(SearchPDF.BUTTON_DOWNLOAD_DOCUMENT),
                Click.on(SearchPDF.BUTTON_DOWNLOAD_DOCUMENT));





    }
}

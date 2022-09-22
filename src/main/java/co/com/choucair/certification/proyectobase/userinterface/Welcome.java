package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class Welcome extends PageObject {
    public static final Target WelcomeText = Target.the("Welcome Text").located(By.xpath("//strong[contains(text(),'Participate in the uTest Academy')]"));
}



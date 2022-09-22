package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestRegister extends PageObject{
    public static final Target Register_Button=Target.the("Button that guide us to the register form").located(By.className("unauthenticated-nav-bar__sign-up"));

    public static final Target First_Name=Target.the("Element where the user register the first name").located(By.id("firstName"));

    public static final Target Last_Name=Target.the("Element where the user register the last name").located(By.id("lastName"));

    public static final Target Email=Target.the("Element where the user register the email").located(By.id("email"));

    public static final Target Month=Target.the("Element where the user register the birth month").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[4]/div[2]/div/div[1]/select/option[10]"));

    public static final Target Day=Target.the("Element where the user register the birth Day").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[4]/div[2]/div/div[2]/select/option[30]"));

    public static final Target Year=Target.the("Element where the user register the birt year").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[4]/div[2]/div/div[3]/select/option[8]"));

    public static final Target Next_button=Target.the("Button that guide us to the next part of the form").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[2]/a"));
}

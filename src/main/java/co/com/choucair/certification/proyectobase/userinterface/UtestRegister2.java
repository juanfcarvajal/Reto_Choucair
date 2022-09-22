package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestRegister2 extends PageObject{
    //Step2
    public static final Target City=Target.the("Element where the user register the city").located(By.id("city"));

    public static final Target ZipCode=Target.the("Element where the user register the zipcode").located(By.id("zip"));

    public static final Target Select_country = Target.the("container of the country").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div"));

    public static final Target Country = Target.the("Where do we select the country").located((By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]")));

    public static final Target Next_devices=Target.the("Button that guide us to the next part of the form").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[2]/div/a"));

}


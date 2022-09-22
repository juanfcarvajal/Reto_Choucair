package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestRegister4 extends PageObject{
   //Step4
    public static final Target Password = Target.the("Write your password").located(By.id("password"));
    public static final Target Confirm_Pass = Target.the("Confirm your password").located(By.id("confirmPassword"));
    public static final Target Checkmark1= Target.the("Check Mark  Terms").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target Checkmark2 = Target.the("Check Mark  Privacy").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target Checkmark3 = Target.the("Complete the registration").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div/div/a"));

}

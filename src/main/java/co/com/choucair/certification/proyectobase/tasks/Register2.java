package co.com.choucair.certification.proyectobase.tasks;



import co.com.choucair.certification.proyectobase.userinterface.UtestRegister2;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;



public class Register2 implements Task{
    private String str_City;
    private String str_Zip;
    private String str_Country;

    public Register2(String str_City, String str_Zip, String str_Country) {
        this.str_City = str_City;
        this.str_Zip = str_Zip;
        this.str_Country = str_Country;
    }
    public static Register2 SignIn(String str_City, String str_Zip, String str_Country) {
        return Tasks.instrumented(Register2.class, str_City, str_Zip, str_Country);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("").into(UtestRegister2.City),
                Enter.theValue(str_City).into(UtestRegister2.City),
                Enter.theValue(str_Zip).into(UtestRegister2.ZipCode),
                Click.on(UtestRegister2.Select_country),
                Enter.theValue(str_Country).into(UtestRegister2.Country),
                Click.on(UtestRegister2.Next_devices)

        );
    }
}

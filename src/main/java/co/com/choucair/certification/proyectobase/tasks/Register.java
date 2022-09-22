package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.UtestRegister;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;



public class Register implements Task{

    private String str_FirstName;
    private String str_LastName;
    private String str_Email;
    public Register(String str_FirstName, String str_LastName, String str_Email) {
        this.str_FirstName = str_FirstName;
        this.str_LastName = str_LastName;
        this.str_Email = str_Email;
    }
    public static Register SingIn(String str_FirstName, String str_LastName, String str_Email) {
        return Tasks.instrumented(Register.class, str_FirstName, str_LastName, str_Email);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestRegister.Register_Button),
                Enter.theValue(str_FirstName).into(UtestRegister.First_Name),
                Enter.theValue(str_LastName).into(UtestRegister.Last_Name),
                Enter.theValue(str_Email).into(UtestRegister.Email),
                Click.on((UtestRegister.Month)),
                Click.on((UtestRegister.Day)),
                Click.on((UtestRegister.Year)),
                Click.on(UtestRegister.Next_button)

    );
    }
}

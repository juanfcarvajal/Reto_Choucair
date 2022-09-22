package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.UtestRegister4;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;



public class Register4 implements Task{
    private String str_Pass;

    public Register4(String str_Pass) {
        this.str_Pass = str_Pass;

    }
    public static Register4 SignUp(String str_Pass) {
        return  Tasks.instrumented(Register4.class, str_Pass);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //Step4
                Enter.theValue(str_Pass).into(UtestRegister4.Password),
                Enter.theValue(str_Pass).into(UtestRegister4.Confirm_Pass),
                Click.on(UtestRegister4.Checkmark1),
                Click.on(UtestRegister4.Checkmark2),
                Click.on(UtestRegister4.Checkmark3)

        );
    }
}

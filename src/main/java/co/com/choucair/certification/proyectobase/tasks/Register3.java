package co.com.choucair.certification.proyectobase.tasks;


import co.com.choucair.certification.proyectobase.userinterface.UtestRegister3;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;


public class Register3 implements Task{
    private String str_Computer;
    private String str_Version;
    private String str_Language;
    private String str_MobilDev;
    private String str_Model;
    private String str_OS;

    public Register3(String str_Computer, String str_Version, String str_Language, String str_MobilDev, String str_Model, String str_OS) {
        this.str_Computer = str_Computer;
        this.str_Version = str_Version;
        this.str_Language = str_Language;
        this.str_MobilDev = str_MobilDev;
        this.str_Model = str_Model;
        this.str_OS = str_OS;
    }

    public static Register3 SignUp(String str_Computer, String str_Version, String str_Language, String str_MobilDev, String str_Model, String str_OS) {
        return Tasks.instrumented(Register3.class, str_Computer, str_Version, str_Language, str_MobilDev, str_Model, str_OS);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //Step3
                Click.on(UtestRegister3.Select_Computer),
                Enter.theValue(str_Computer).into(UtestRegister3.Computer),
                Click.on(UtestRegister3.Select_Version),
                Enter.theValue(str_Version).into(UtestRegister3.Version),
                Click.on(UtestRegister3.Select_Language),
                Enter.theValue(str_Language).into(UtestRegister3.Language),
                Click.on(UtestRegister3.Select_movil_Dev),
                Enter.theValue(str_MobilDev).into(UtestRegister3.Mobil_Dev),
                Hit.the(Keys.ARROW_DOWN).into(UtestRegister3.Mobil_Dev),
                Hit.the(Keys.ENTER).into(UtestRegister3.Mobil_Dev),
                Click.on(UtestRegister3.Select_model),
                Enter.theValue(str_Model).into(UtestRegister3.Model),
                Hit.the(Keys.ENTER).into(UtestRegister3.Model),
                Click.on(UtestRegister3.Select_OS),
                Enter.theValue(str_OS).into(UtestRegister3.OS),
                Hit.the(Keys.ARROW_DOWN).into(UtestRegister3.OS),
                Hit.the(Keys.ENTER).into(UtestRegister3.OS),
                Click.on(UtestRegister3.Button_LastStep)


        );
    }
}

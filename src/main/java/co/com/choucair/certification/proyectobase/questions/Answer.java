package co.com.choucair.certification.proyectobase.questions;

import co.com.choucair.certification.proyectobase.userinterface.Welcome;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean>{
    private String question;

    public Answer(String question){
        this.question=question;
    }
    public static Answer toThe(String question){
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor){
        boolean result;
        String PageText= Text.of(Welcome.WelcomeText).viewedBy(actor).asString();
        if (question.equals(PageText)){
            result=true;
        }else {
            result=false;
        }
        return result;
    }
    @Override
    public String getSubject() {
        return Question.super.getSubject();
    }
}

package MyresBriggs;


public class MyBriggsApp {
    public static void main(String[] args) throws ExceptionClass {
        MyersBriggs_App myersBriggs_app = new MyersBriggs_App();
        MyersBriggsQuestions myersBriggsQuestions=new MyersBriggsQuestions();
        myersBriggs_app.setMyersBriggsQuestions(myersBriggsQuestions);
        myersBriggs_app.displayQuestion();
        System.out.println(myersBriggs_app.personalityCheckApproachToDecisionMaking()+myersBriggs_app.personalityCheckNeedForStructure()+myersBriggs_app.personalityCheckProcessingInformation()
        +myersBriggs_app.personalityCheckForSourceOfEnergy());
    }
}
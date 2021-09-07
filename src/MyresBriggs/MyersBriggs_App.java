package MyresBriggs;

import java.util.Scanner;

public class MyersBriggs_App {

    private MyersBriggsQuestions myersBriggsQuestions;
    private final String[] answersToQuestions = new String[20];
    Scanner input = new Scanner(System.in);

    public String[] getAnswersToQuestions() {
        return answersToQuestions;
    }

    public String[] getMyersBriggsQuestions() {
        return myersBriggsQuestions.getQuestions();
    }

    public void setMyersBriggsQuestions(MyersBriggsQuestions myersBriggsQuestions) {
        this.myersBriggsQuestions = myersBriggsQuestions;
    }

    public void displayQuestion() throws ExceptionClass {
        for (int i = 0; i < getMyersBriggsQuestions().length; i++) {
            System.out.println(getMyersBriggsQuestions()[i]);
            System.out.print("Enter your answer A or B: ");
            String userAnswer = input.nextLine();
            if (!(userAnswer.equalsIgnoreCase("A") || userAnswer.equalsIgnoreCase("B"))) {
                throw new ExceptionClass("Boy you no get sense");
            } else
                answersToQuestions[i] = userAnswer;
        }
    }

    public String personalityCheckForSourceOfEnergy() {
        int E = 0;
        int I = 0;
        for (int i = 0; i < answersToQuestions.length; i += 4) {
            if (answersToQuestions[i].equalsIgnoreCase("A")) {
                E++;
            } else I++;
        }
    if(E > I){
        return "E";
    }else return "I";
    }

    public String personalityCheckProcessingInformation() {
        int S = 0;
        int N = 0;
        for (int i = 1; i < answersToQuestions.length; i += 4) {
            if (answersToQuestions[i].equalsIgnoreCase("A")) {
                S++;
            } else N++;
        }
        if(S > N){
            return "S";
        }else return "N";
    }


    public String personalityCheckApproachToDecisionMaking() {
        int T = 0;
        int F = 0;
        for (int i = 2; i < answersToQuestions.length; i += 4) {
            if (answersToQuestions[i].equalsIgnoreCase("A")) {
                T++;
            } else F++;
        }
        if(T > F){
            return "T";
        }else return "F";
    }

 public String personalityCheckNeedForStructure() {
        int J = 0;
        int P = 0;
        for (int i = 3; i < answersToQuestions.length; i += 4) {
            if (answersToQuestions[i].equalsIgnoreCase("A")) {
                J++;
            } else P++;
        }
        if(J > P){
            return "J";
        }else return "P";
    }



    public static void main(String[] args) throws ExceptionClass {
        MyersBriggs_App myersBriggs_app = new MyersBriggs_App();
        MyersBriggsQuestions myersBriggsQuestions = new MyersBriggsQuestions();
        myersBriggs_app.setMyersBriggsQuestions(myersBriggsQuestions);
        myersBriggs_app.displayQuestion();
    }

}

package Chapter5;

import java.util.Scanner;

public class GlobalWarmingQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int correctAnswers = 0;
        int wrongAnswer = 0;
        System.out.print("Please enter your name: ");
        String userName = input.next();
        System.out.println("Your name is:  " + userName);
        System.out.println("Which one of the following cases global warming? \nA) Carbon dioxide \nB) Oxygen \nC) Nitrogen \nD) Hydrogen");
        String question1 = input.next();
        if (question1.equalsIgnoreCase("A")) {
            correctAnswers++;
        } else wrongAnswer++;
        System.out.println("""
                What ia the full form of UNFCC with respect to global warming convention?\s
                A) United Nations Framework Convention on Climate Change\s
                B) United Nations Federation Convention on Climate Change\s
                C) United Nations Framework Center on Climate Change\s
                D) United Nations Federation Centre on Climate Change""");
        String question2 = input.next();
        if (question2.equalsIgnoreCase("a")) {
            correctAnswers++;
        } else wrongAnswer++;
        System.out.println("How many percent of carbon dioxide increased in the atmosphere since pre-industrial times? \nA) About 10% \nB) About 20% \nC) About 30% \nD) About 50%");
        String question3 = input.next();
        if (question3.equalsIgnoreCase("c")) {
            correctAnswers++;
        } else wrongAnswer++;
        System.out.println("Who mean=sures the global warming rate? \nA) Astrologist \nB) Physicist \nC) Philosopher \nD) Climatologist");
        String question4 = input.next();
        if (question4.equalsIgnoreCase("d")) {
            correctAnswers++;
        } else wrongAnswer++;
        System.out.println("Human activities cause global warming? \nA) True \nB) False");
        String question5 = input.next();
        if (question5.equalsIgnoreCase("a")) {
            correctAnswers++;
        } else wrongAnswer++;

        if (correctAnswers >= 5) {
            System.out.println("Excellent");
        } else if (correctAnswers == 4) {
            System.out.println("Very good");
        } else {
            System.out.println("Time to brush up on your knowledge of global warming,read the text book and do more research");
            System.out.println("The total of correct answers is: " + correctAnswers);
            System.out.println("The total of wrong answers is: " + wrongAnswer);
        }
    }
}


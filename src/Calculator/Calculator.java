package Calculator;

import java.util.Map;

public class Calculator {

    public static double addition(double ... numbers){
        double total=0;
        for (double num:numbers) {
            total+=num   ;
        }
        return total;
    }

    public static double subtraction(double ... numbers){
        double total = numbers[0];

        for (int i =1; i < numbers.length; i++)   {
            total -= numbers[i];

        }
        return total;
    }

    public static double division(double ...numbers){
    double total= numbers[0];
        for (int i =1; i < numbers.length; i++) {
        total/=numbers[i]  ;
    }
        return total;
}

    public static double multiplication(double ...numbers){
    double total=1;
        for(double num:numbers) {
        total= total * num   ;
    }
        return total;
}

    public double convertToSin(double number) {
double numberToConvert = Math.toRadians( number);
    return Math.sin(numberToConvert);
    }

    public double convertToCos(double numberToConvert) {
        double numbersToConvert = Math.toRadians(numberToConvert);
        return Math.cos(numbersToConvert);
    }

    public double convertToTan(double numberToConvert) {
        double numbersToConvert = Math.toRadians(numberToConvert);
        return Math.tan(numbersToConvert);

    }

  

}

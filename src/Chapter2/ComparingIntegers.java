package Chapter2;

public class ComparingIntegers {

    public int getLargerNumber(int firstNumber, int secondNumber) {
        if(firstNumber >  secondNumber){
            System.out.println(firstNumber + " is larger");

        } else
        System.out.println(secondNumber + " is larger");
return secondNumber;
    }

    public boolean numbersAreEqual(int firstNumber, int secondNumber) {
        if(firstNumber == secondNumber){
            System.out.println("These numbers are equal" );

        }
        System.out.println("These number are not equal");
        return true;
    }
}

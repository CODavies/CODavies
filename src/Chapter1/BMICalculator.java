package Chapter1;

public class BMICalculator {

    public boolean checkForObesity(double number) {
        if (number >= 30) {
            System.out.println("User is Obese");
            return true;
        }
        System.out.println("User is not Obese");
        return false;
    }

    public boolean checkForOverweight(double numberToCheck) {
        if (numberToCheck >= 25 && numberToCheck <= 29.9) {
            System.out.println("User is Overweight");
            return true;
        }
        System.out.println("User is not Overweight");
        return false;
    }

    public boolean checkForNormalWeight(double numberToCheck) {
        if (numberToCheck >= 18.5 && numberToCheck <= 24.9) {
            System.out.println("User is Normal weight");
            return true;
        }
        System.out.println("User is not Normal weight");
        return false;
    }

    public boolean checkForUnderWeight(double numberToCheck) {
        if (numberToCheck <= 18.5) {
            System.out.println("User is UnderWeight");
            return true;
        }
        System.out.println("User is not UnderWeight");
        return false;
    }




}


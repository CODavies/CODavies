package Chapter7;

public class introductionToArray {
    public static void main(String[] args) {
        int[] b =  {32, 27, 64, 18, 95, 14, 90, 70, 60, 37};
        System.out.printf("%s%8s%n" , "Index", "Value");
        for (int counter = 0; counter< b.length; counter++){
            System.out.printf("%d%10d%n", counter, b[counter]);
        }

    }
}

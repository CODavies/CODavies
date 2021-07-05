package Chapter7;

public class Practice {
    public static void main(String[] args) {


        char[][] array = { {'X', 'O', 'X'},
                           {'O', 'X', 'O'},
                           {'O', 'O', 'X'} };
        for (char[] chars : array) {
            for (char aChar : chars) {
                System.out.print(aChar + " ");

            }
            System.out.println();
        }
    }

}


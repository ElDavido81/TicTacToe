import java.util.Scanner;

public class Player {

    Scanner sc = new Scanner(System.in);

    protected String sq1 = " ";
    protected String sq2 = " ";
    protected String sq3 = " ";
    protected String sq4 = " ";
    protected String sq5 = " ";
    protected String sq6 = " ";
    protected String sq7 = " ";
    protected String sq8 = " ";
    protected String sq9 = " ";

    protected String row1;
    protected String row2;
    protected String row3;
    protected String col1;
    protected String col2;
    protected String col3;
    protected String dia1;
    protected String dia2;

    public void playerXInput() {    // --- Vilken ruta väljer spelare X
        Boolean tryAgainX = true;
        while (tryAgainX == true) { // --- Fortsätt tills spelaren väljer en tom ruta
            System.out.println("Player X choose your square:");
            int playerXInput = sc.nextInt();

            if (playerXInput == 1 && (!sq1.equals("O")) && (!sq1.equals("X"))) {    // --- kolla så rutan är tom
                sq1 = "X";
                tryAgainX = false;
            } else if (playerXInput == 2 && (!sq2.equals("O")) && (!sq2.equals("X"))) {
                sq2 = "X";
                tryAgainX = false;
            } else if (playerXInput == 3 && (!sq3.equals("O")) && (!sq3.equals("X"))) {
                sq3 = "X";
                tryAgainX = false;
            } else if (playerXInput == 4 && (!sq4.equals("O")) && (!sq4.equals("X"))) {
                sq4 = "X";
                tryAgainX = false;
            } else if (playerXInput == 5 && (!sq5.equals("O")) && (!sq5.equals("X"))) {
                sq5 = "X";
                tryAgainX = false;
            } else if (playerXInput == 6 && (!sq6.equals("O")) && (!sq6.equals("X"))) {
                sq6 = "X";
                tryAgainX = false;
            } else if (playerXInput == 7 && (!sq7.equals("O")) && (!sq7.equals("X"))) {
                sq7 = "X";
                tryAgainX = false;
            } else if (playerXInput == 8 && (!sq8.equals("O")) && (!sq8.equals("X"))) {
                sq8 = "X";
                tryAgainX = false;
            } else if (playerXInput == 9 && (!sq9.equals("O")) && (!sq9.equals("X"))) {
                sq9 = "X";
                tryAgainX = false;
            }
        }
    }

    public void playerOInput() {
        Boolean tryAgainO = true;
        while (tryAgainO == true) {
            System.out.println("Player O choose your square:");
            int playerOInput = sc.nextInt();

            if (playerOInput == 1 && (!sq1.equals("X")) && (!sq1.equals("O"))) {
                sq1 = "O";
                tryAgainO = false;
            } else if (playerOInput == 2 && (!sq2.equals("X")) && (!sq2.equals("O"))) {
                sq2 = "O";
                tryAgainO = false;
            } else if (playerOInput == 3 && (!sq3.equals("X")) && (!sq3.equals("O"))) {
                sq3 = "O";
                tryAgainO = false;
            } else if (playerOInput == 4 && (!sq4.equals("X")) && (!sq4.equals("O"))) {
                sq4 = "O";
                tryAgainO = false;
            } else if (playerOInput == 5 && (!sq5.equals("X")) && (!sq5.equals("O"))) {
                sq5 = "O";
                tryAgainO = false;
            } else if (playerOInput == 6 && (!sq6.equals("X")) && (!sq6.equals("O"))) {
                sq6 = "O";
                tryAgainO = false;
            } else if (playerOInput == 7 && (!sq7.equals("X")) && (!sq7.equals("O"))) {
                sq7 = "O";
                tryAgainO = false;
            } else if (playerOInput == 8 && (!sq8.equals("X")) && (!sq8.equals("O"))) {
                sq8 = "O";
                tryAgainO = false;
            } else if (playerOInput == 9 && (!sq9.equals("X")) && (!sq9.equals("O"))) {
                sq9 = "O";
                tryAgainO = false;
            }
        }
    }
}

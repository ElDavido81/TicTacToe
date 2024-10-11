public class Main {
    public static void main(String[] args) {

        Grid grid = new Grid();
        grid.printStartGrid();

        GamePrinter printer = new GamePrinter();

        String winner;

        while (true) {

            printer.playerXInput();  // --- fråga var spelare X vill sätta sitt X ---//
            printer.printGrid();    // --- skriv ut aktuell spelplan --- //
            winner = printer.checkWinner();  // --- undersök om X har tre i rad

            if (winner != null) {   // --- presentera ev. vinnare, avsluta och nollställ spelplanen --- //
                System.out.println(winner + " wins!");
                printer.resetSq();
                grid.printStartGrid();
            }

            printer.playerOInput(); // --- fråga var spelare O vill sätta sitt O --- //
            printer.printGrid();    // --- skriv ut aktuell spelplan --- //
            winner = printer.checkWinner();  // --- kolla om O har tre i rad

            if (winner != null) {      // --- presentera ev. vinnare, avsluta och nollställ spelplanen --- //
                System.out.println(winner + " wins!");
                printer.resetSq();
                grid.printStartGrid();
            }
        }
    }
}
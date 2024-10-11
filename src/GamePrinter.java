public class GamePrinter extends Player {

    String winnerOut;

    public void printGrid() {   // --- skriv ut den aktuella spelplanen
        System.out.println(" " + sq1 + " | " + sq2 + " | " + sq3 + " ");
        System.out.println("–––*–––*–––");
        System.out.println(" " + sq4 + " | " + sq5 + " | " + sq6 + " ");
        System.out.println("–––*–––*–––");
        System.out.println(" " + sq7 + " | " + sq8 + " | " + sq9 + " ");
    }

    // --- skapa rader, kolumner och diagonaler (felsökning)

    public String firstRow() {
        String row1 = sq1 + sq2 + sq3;
        return row1;
    }
    public String secondRow() {
        String row2 = sq4 + sq5 + sq6;
        return row2;
    }
    public String thirdRow() {
        String row3 = sq7 + sq8 + sq9;
        return row3;
    }
    public String firstCol() {
        String col1 = sq1 + sq4 + sq7;
        return col1;
    }
    public String secondCol() {
        String col2 = sq2 + sq5 + sq8;
        return col2;
    }
    public String thirdCol() {
        String col3 = sq3 + sq6 + sq9;
        return col3;
    }
    public String firstDia() {
        String dia1 = sq1 + sq5 + sq9;
        return dia1;
    }
    public String secondDia() {
        String dia2 = sq3 + sq5 + sq7;
        return dia2;
    }

    protected String checkWinner(){ // --- undersök om någon har tre i rad

            row1 = sq1 + sq2 + sq3;
            row2 = sq4 + sq5 + sq6;
            row3 = sq7 + sq8 + sq9;
            col1 = sq1 + sq4 + sq7;
            col2 = sq2 + sq5 + sq8;
            col3 = sq3 + sq6 + sq6;
            dia1 = sq1 + sq5 + sq9;
            dia2 = sq3 + sq5 + sq7;

            if (row1.equals("XXX") || row2.equals("XXX") || row3.equals("XXX") || col1.equals("XXX") || col2.equals("XXX") || col3.equals("XXX") || dia1.equals("XXX") || dia2.equals("XXX")){
            winnerOut = "X";
        } else if (row1.equals("OOO") || row2.equals("OOO") || row3.equals("OOO") || col1.equals("OOO") || col2.equals("OOO") || col3.equals("OOO") || dia1.equals("OOO") || dia2.equals("OOO")) {
            winnerOut = "O";
        } else if ((!sq1.equals(" ")) && (!sq2.equals(" ")) && (!sq3.equals(" ")) && (!sq4.equals(" ")) && (!sq5.equals(" ")) && (!sq6.equals(" ")) && (!sq7.equals(" ")) && (!sq8.equals(" ")) && (!sq9.equals(" "))) {
                winnerOut = "No one";
            }   else {
                winnerOut = null;
            }
        return winnerOut;
    }

    public void resetSq() { // --- nollställ alla rutor
        sq1 = " ";
        sq2 = " ";
        sq3 = " ";
        sq4 = " ";
        sq5 = " ";
        sq6 = " ";
        sq7 = " ";
        sq8 = " ";
        sq9 = " ";
        row1 = "";
        row2 = "";
        row3 = "";
        col1 = "";
        col2 = "";
        col3 = "";
        dia1 = "";
        dia2 = "";
    }


}

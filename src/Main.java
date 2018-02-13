import javax.swing.JOptionPane;

public class Main {


    public static void main(String[] args) {

        int passengers;
        int checkedBags;
        int freeBags;
        int space1 = 100;
        int space2 = 300;
        int space3 = 125;
        int seats = 100;
        int flightNum1 = 3210;
        int flightNum2 = 2594;
        int flightNum3 = 5867;
        int NumCheckBagsIn1 = 0;

        String flightNumInput1 = JOptionPane.showInputDialog("Enter your flight number");
        int flightNumSet1 = Integer.parseInt(flightNumInput1);

        boolean done1 = false;
        while (!done1) {
            if (flightNumInput1 == null) {
                System.out.println("No Flight Number Inputted");
            } else if (flightNumSet1 == flightNum1) {

                String checkBagsIn1 = JOptionPane.showInputDialog("Enter number of checked bags");
                NumCheckBagsIn1 = Integer.parseInt(checkBagsIn1);


            } else if (flightNumSet1 == flightNum2) {

            } else if (flightNumSet1 == flightNum3) {

            }

        }


        Flight flight1 = new Flight(flightNum1, NumCheckBagsIn1, space1);


    }
}



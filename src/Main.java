import javax.swing.JOptionPane;
import java.util.ArrayList;

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
        int NumCheckBagsIn1 = 10;
        boolean done1 = false;
        boolean flightDone1 = false;
        int flightNumSet1 = -1;


        ArrayList <Flight> flightList1 = new ArrayList<>();

        String flightNumInput1 = JOptionPane.showInputDialog("Enter your flight number");


        if (flightNumInput1 == null) {
            done1 = true;
            System.out.println("Done");
        }

        else {
            flightNumSet1 = Integer.parseInt(flightNumInput1);
        }


        while (!done1) {
            if (flightNumSet1 == -1) {
                System.out.println("No Flight Number Inputted");
                done1 = true;
            } else if (flightNumSet1 == flightNum1 && !flightDone1) {

                String checkBagsIn1 = JOptionPane.showInputDialog("Enter number of checked bags");
                NumCheckBagsIn1 = Integer.parseInt(checkBagsIn1);

                Flight flight1 = new Flight(flightNum1, NumCheckBagsIn1, space1);
                int spaceLeft = flight1.getLeftOver();
                System.out.println(spaceLeft);

                flightDone1 = true;
                done1 = true;


            } else if (flightNumSet1 == flightNum2) {

            } else if (flightNumSet1 == flightNum3) {

            }

        }



    }
}



//import jdk.nashorn.internal.scripts.JO;

import jdk.nashorn.internal.scripts.JO;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Collections;

public class Main {


    public static void main(String[] args) {

        int passengers;
        int checkedBags;
        int freeBags;
        int space1 = 100;
        int space2 = 300;
        int space3 = 125;
        int seats1 = 100;
        int flightNum1 = 3210;
        int flightNum2 = 2594;
        int flightNum3 = 5867;
        int NumCheckBagsIn1;
        int NumCheckBagsIn2;
        int NumCheckBagsIn3;
        boolean done1 = false;
        boolean flightDone1 = false;
        int flightNumSet1 = -1;



        ArrayList <Flight> flightList1 = new ArrayList<>();

        String flightNumInput1 = JOptionPane.showInputDialog(null, "Enter your flight number");
        int defaultNum = Integer.parseInt(flightNumInput1);
        String defaultCheckedBags = JOptionPane.showInputDialog(null, "Enter number of chekced bags");
        int defaultChecked = Integer.parseInt(defaultCheckedBags);
        int defaultSpaces = 100;

        Flight defaultFlight = new Flight(defaultNum, defaultChecked, defaultSpaces);


        if (flightNumInput1 == null) {
            done1 = true;
            System.out.println("Done");
        }

        else {
            flightNumSet1 = Integer.parseInt(flightNumInput1);
        }

        //Checks for flight number inputs
        while (!done1) {
            //Handles null input
            if (flightNumSet1 == -1) {
                System.out.println("No Flight Number Inputted");
                done1 = true;

                //flight 1
            } else if (flightNumSet1 == flightNum1 && !flightDone1) {

                String checkBagsIn1 = JOptionPane.showInputDialog(null, "Enter number of checked bags for flight number " + flightNum1);
                NumCheckBagsIn1 = Integer.parseInt(checkBagsIn1);

                String seatsTaken1 = JOptionPane.showInputDialog(null, "Enter number of seats for flight number " + flightNum1);

                Flight flight1 = new Flight(flightNum1, NumCheckBagsIn1, space1);
                int spaceLeft1 = flight1.getLeftOver();
                System.out.println(spaceLeft1);

                flightList1.add(flight1);

                flightDone1 = true;
                done1 = true;

                //flight 2
            } else if (flightNumSet1 == flightNum2 && !flightDone1) {

                String checkBagsIn2 = JOptionPane.showInputDialog(null, "Enter number of checked bags for flight number " + flightNum2);
                NumCheckBagsIn2 = Integer.parseInt(checkBagsIn2);

                String seatsTaken2 = JOptionPane.showInputDialog(null, "Enter number of seats for flight number " + flightNum2);

                Flight flight2 = new Flight(flightNum2, NumCheckBagsIn2, space2);
                int spaceLeft2 = flight2.getLeftOver();
                System.out.println(spaceLeft2);

                flightList1.add(flight2);

                flightDone1 = true;
                done1 = true;

                //flight 3
            } else if (flightNumSet1 == flightNum3 && !flightDone1) {

                String checkedBagsIn3 = JOptionPane.showInputDialog(null,"Enter number of checked bags for flight number " + flightNum3);
                NumCheckBagsIn3 = Integer.parseInt(checkedBagsIn3);

                String seatsTaken3 = JOptionPane.showInputDialog(null, "Enter number of seats for flight number " + flightNum3);

                Flight flight3 = new Flight(flightNum3, NumCheckBagsIn3, space3);
                int spaceLeft3 = flight3.getLeftOver();
                System.out.println(spaceLeft3);

                flightList1.add(flight3);

                flightDone1 = true;
                done1 = true;

                //Handles invalid flight numbers
            } else {
                System.out.println("Not a valid flight");
                done1 = true;
            }

        }

//        flightList1.sort()


    }
}



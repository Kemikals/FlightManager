public class Flight {

    //Main flightNum1 var
    private int flyNum;
    //Main NumCheckBagsIn1 var
    private int bagsChecked;
    //Main spaces1 var
    private int spaces;
    //Space left over after subtracting checked bags
    private int leftOver;

    //Finds number of bag space left after input
    public Flight(int i, int j, int k) {
        flyNum = i;
        bagsChecked = j;
        spaces = k;

        if (flyNum == 3210) {
            spaces = 100;
            leftOver = spaces - bagsChecked;
        }

        else if (flyNum == 2594) {
            spaces = 300;
            leftOver = spaces - bagsChecked;
        }

        else if (flyNum == 5867) {
            spaces = 150;
            leftOver = spaces - bagsChecked;
        }

        else {
            System.out.println("Not a valid flight number");
        }

    }

    public int getLeftOver() {
        return leftOver;
    }


    //Finds number of seats left
    public int spaceLeft () {

        return spaces;
    }

    public int getFlyNum1() {
        return flyNum;
    }

    public void setFlyNum1(int flyNum1) {
        this.flyNum = flyNum1;
    }

    public int getBagsChecked1() {
        return bagsChecked;
    }

    public void setBagsChecked1(int bagsChecked1) {
        this.bagsChecked = bagsChecked1;
    }

    public Flight  (int flyNum1, int bagsChecked1) {

    }


}

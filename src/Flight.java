public class Flight {

    //Main flightNum1 var
    private int flyNum1;
    //Main NumCheckBagsIn1 var
    private int bagsChecked1;
    //Main spaces1 var
    private int spaces;
    //Space left over after subtracting checked bags
    private int leftOver;

    //Finds number of bag space left after input
    public Flight(int i, int j, int k) {
        flyNum1 = i;
        bagsChecked1 = j;
        spaces = k;

        leftOver = spaces - bagsChecked1;
    }

    public int getLeftOver() {
        return leftOver;
    }


    //Finds number of seats left
    public int spaceLeft () {

        return spaces;
    }

    public int getFlyNum1() {
        return flyNum1;
    }

    public void setFlyNum1(int flyNum1) {
        this.flyNum1 = flyNum1;
    }

    public int getBagsChecked1() {
        return bagsChecked1;
    }

    public void setBagsChecked1(int bagsChecked1) {
        this.bagsChecked1 = bagsChecked1;
    }

    public Flight  (int flyNum1, int bagsChecked1) {

    }


}

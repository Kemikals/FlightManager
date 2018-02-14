public class Flight {

    private int flyNum1;
    private int bagsChecked1;
    private int spaces;

    public Flight(int i, int j, int k) {
        flyNum1 = i;
        bagsChecked1 = j;
        spaces = k;
    }

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

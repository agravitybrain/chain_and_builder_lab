package atm;

public class ATM {
    public Tray first;
    private int processAmount;
    public ATM(int amount) {
        Tray tray20 = new Tray20();
        Tray tray10 = new Tray10();
        Tray tray5 = new Tray5();

        tray20.setNext(tray10);
        tray10.setNext(tray5);

        processAmount = amount;
        first = tray20;
        this.process();
    }

    public boolean process() {
        if (first.process(processAmount)) {
            return true;
        } else {
            return false;
        }
    }
}

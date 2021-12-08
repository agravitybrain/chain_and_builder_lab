package atm;

public abstract class DefaultTray implements Tray{
    private int bill;
    private Tray next;

    DefaultTray(int  bill) {
        this.bill = bill;
    }

    public void setNext(Tray next) {
        this.next = next;
    }

    public boolean process(int amount) {
        boolean permission = true;
        if (next != null) {
            permission = next.process(amount % bill);
        }
        else if (amount % bill > 0){
            System.out.println("This amount can't be extracted extract enter " +
                                                            "number multiple of 5 ");
            return  false;
        }
        if (permission) {
            System.out.println("extracted : " + amount / bill + " * " + bill);
            return true;
        } else {
            return false;
        }
    }

}
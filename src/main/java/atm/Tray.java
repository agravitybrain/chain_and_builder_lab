package atm;

public interface Tray {
    void setNext(Tray next);
    boolean process(int amount);
}

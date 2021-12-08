package atm;

import junit.framework.TestCase;


public class ATMTest extends TestCase {
    private ATM atm = new ATM();

    @org.junit.jupiter.api.Test
    void process() {
        boolean success = atm.process(35);
        assertTrue(success);

        success = atm.process(2253);
        assertFalse(success);
    }
}
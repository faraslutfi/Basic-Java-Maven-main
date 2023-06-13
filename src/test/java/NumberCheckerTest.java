import static org.junit.Assert.*;

import org.junit.Test;
public class NumberCheckerTest {

    @Test
    public void testCheckNumberGenap() {
        NumberChecker tChecker = new NumberChecker();

        assertEquals(tChecker.checkNumber(2), "Genap");
    }

    @Test
    public void testCheckNumberGanjil() {
        NumberChecker tChecker = new NumberChecker();

        assertEquals(tChecker.checkNumber(1), "Ganjil");
    }

    @Test
    public void testCheckKPK() {
        NumberChecker tChecker = new NumberChecker();

        assertEquals(tChecker.checkKPK(4, 6), "KPK dari 4 dan 6 adalah 12");
    }
}

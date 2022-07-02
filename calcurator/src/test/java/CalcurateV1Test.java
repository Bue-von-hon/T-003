import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalcurateV1Test {
    @Test
    public void test1() {
        CalcuratorV1 calcuratorV1 = new CalcuratorV1();
        Assertions.assertEquals(calcuratorV1.calcurate("+", 1, 2), 3);
        Assertions.assertEquals(calcuratorV1.calcurate("-", 2, 2), 0);
        Assertions.assertEquals(calcuratorV1.calcurate("*", 2, 2), 4);
        Assertions.assertEquals(calcuratorV1.calcurate("/", 2, 2), 1);
    }
}

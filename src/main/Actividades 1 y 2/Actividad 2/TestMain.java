import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMain {

    @Test
    public void testDescuentoPlatos() {
        Assertions.assertEquals(0, Main.calcularDescuentoPlatos(4, 40));
        Assertions.assertEquals(3, Main.calcularDescuentoPlatos(6, 60));
        Assertions.assertEquals(5, Main.calcularDescuentoPlatos(10, 100));
        Assertions.assertEquals(30, Main.calcularDescuentoPlatos(20, 200));
    }

    @Test
    public void testDescuentoComensales() {
        Assertions.assertEquals(0, Main.calcularDescuentoComensales(4, 3, 40));
        Assertions.assertEquals(15, Main.calcularDescuentoComensales(6, 2, 60));
        Assertions.assertEquals(20, Main.calcularDescuentoComensales(12, 6, 120));
        Assertions.assertEquals(30, Main.calcularDescuentoComensales(20, 8, 200));
        Assertions.assertEquals(15, Main.calcularDescuentoComensales(6, 2, 60));
        Assertions.assertEquals(0, Main.calcularDescuentoComensales(4, 3, 40));
    }
}

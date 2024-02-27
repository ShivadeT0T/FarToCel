import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

public class FahrenheitToCelTest extends TestCase {

    @Test
    public void testConvertFahr() {
        assertEquals(0, FahrenheitToCel.convertFahr(32), 0.1);
        assertEquals(100, FahrenheitToCel.convertFahr(212), 0.1);
        assertEquals(37, FahrenheitToCel.convertFahr(98.6f), 0.1);
        assertEquals(-40, FahrenheitToCel.convertFahr(-40), 0.1);
    }

    @Test
    public void testKelvinToCelsius() {
        assertEquals(0, FahrenheitToCel.kelvinToCelsius(273.15f), 0.1);
        assertEquals(100, FahrenheitToCel.kelvinToCelsius(373.15f), 0.1);
        assertEquals(-100, FahrenheitToCel.kelvinToCelsius(173.15f), 0.1);
    }
}
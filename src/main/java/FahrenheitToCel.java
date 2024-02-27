public class FahrenheitToCel {

    public static float convertFahr(float f) {
        float c= (float) ((f-32)*5/9);
        return Math.round(c);
    }

    public static float kelvinToCelsius(float k) {
        return (float) (k - 273.15);
    }
}

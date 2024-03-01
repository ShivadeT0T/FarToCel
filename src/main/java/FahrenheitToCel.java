public class FahrenheitToCel {

    public static float convertFahr(float f) {
        float c= (float) ((f-32)*5/9);
        return Math.round(c);
    }

    public static float kelvinToCelsius(float k) {
        return (float) (k - 273.15);
    }

    public static float kelvinToFahrenheit(float k) {
        return (float) ((k - 273.15) * 9/5 + 32);
    }


    public static void main(String[] args) {
        System.out.println(convertFahr(100));
        System.out.println(kelvinToCelsius(100));
        System.out.println(kelvinToFahrenheit(100));
    }
}

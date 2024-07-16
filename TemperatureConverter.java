import java.util.*;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            //im using this line to user selcet their options
            System.out.println("\nSelect what kind of converstion you want:\n");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.println("3. Celsius to Kelvin");
            System.out.println("4. Kelvin to Celsius");
            System.out.println("5. Fahrenheit to Kelvin");
            System.out.println("6. Kelvin to Fahrenheit");
            System.out.println("7. Exit");
            System.out.print("\nEnter your choice: ");
            String choice = in.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter temperature in Celsius: ");
                    double celsiusToFahrenheit = Double.parseDouble(in.nextLine());
                    System.out.println("Temperature in Fahrenheit: " + celsiusToFahrenheit(celsiusToFahrenheit));
                    break;
                case "2":
                    System.out.print("Enter temperature in Fahrenheit: ");
                    double fahrenheitToCelsius = Double.parseDouble(in.nextLine());
                    System.out.println("Temperature in Celsius: " + fahrenheitToCelsius(fahrenheitToCelsius));
                    break;
                case "3":
                    System.out.print("Enter temperature in Celsius: ");
                    double celsiusToKelvin = Double.parseDouble(in.nextLine());
                    System.out.println("Temperature in Kelvin: " + celsiusToKelvin(celsiusToKelvin));
                    break;
                case "4":
                    System.out.print("Enter temperature in Kelvin: ");
                    double kelvinToCelsius = Double.parseDouble(in.nextLine());
                    System.out.println("Temperature in Celsius: " + kelvinToCelsius(kelvinToCelsius));
                    break;
                case "5":
                    System.out.print("Enter temperature in Fahrenheit: ");
                    double fahrenheitToKelvin = Double.parseDouble(in.nextLine());
                    System.out.println("Temperature in Kelvin: " + fahrenheitToKelvin(fahrenheitToKelvin));
                    break;
                case "6":
                    System.out.print("Enter temperature in Kelvin: ");
                    double kelvinToFahrenheit = Double.parseDouble(in.nextLine());
                    System.out.println("Temperature in Fahrenheit: " + kelvinToFahrenheit(kelvinToFahrenheit));
                    break;
                case "7":
                    in.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }

    // Conversion formulas
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit + 459.67) * 5 / 9;
    }

    public static double kelvinToFahrenheit(double kelvin) {
        return (kelvin * 9 / 5) - 459.67;
    }
}
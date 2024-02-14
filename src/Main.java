import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] numbers = {34.2, 23.3, -34.6, -23.5, 35.1, 12.0, -42.7, -342.4, -12.0, -4.6, 343.3, 33.6, -3.0, 34.5, 21.5};
        double positveNumber = 0;
        double countPositveNumber = 0;
        boolean firstNegativeNumber = false;
        for (double number : numbers) {
            if (firstNegativeNumber) {
                if (number > 0) {
                    positveNumber = positveNumber + number;
                    countPositveNumber++;
                }
            } else {
                if (number < 0) {
                    firstNegativeNumber = true;
                }
            }
        }
        double averageNombers = positveNumber / countPositveNumber;
        System.out.println(averageNombers);
    }
}
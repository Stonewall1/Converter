
import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter decimal number to convert");
        long decimalNumber = scanner.nextLong();
        System.out.println("Enter which system you would like to use(from 2)");
        int numberSystem = scanner.nextInt();

        if (numberSystem < 2) {
            System.out.println("Enter from 2");
        } else {System.out.println("Your number : " + ConvertToAny(decimalNumber, numberSystem));}

        String newNumber = ConvertToAny(decimalNumber, numberSystem);
        System.out.println("Reverse : " + ConvertToDecimal(newNumber , numberSystem));
    }

    private static String ConvertToAny(long decimalNumber, int numberSystem) {
        String result = "";
        if (decimalNumber > 0) {
            while (decimalNumber != 0) {
                int n = (int) (decimalNumber % numberSystem);
                result = n + "." + result;
                decimalNumber = decimalNumber / numberSystem;
            }
            return result; // 1.18.
        }
        else return "idk what happened";
    }

    private static int ConvertToDecimal(String newNumber , int numberSystem) {
            int decimal = 0;
            String[] array = newNumber.split("\\.");
        for (int i = 0; i < array.length; i++) {
            decimal = (numberSystem * decimal) + Integer.parseInt(array[i]);
        }
            return decimal;
        }
}


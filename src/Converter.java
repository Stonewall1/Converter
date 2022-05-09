
import java.util.Scanner;

public class Converter {
    private static final String CS = "0123456789";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter decimal number to convert");
        long decimalNumber = scanner.nextLong();
        System.out.println("Enter which system you would like to use(from 2)");
        int numberSystem = scanner.nextInt();
        if (numberSystem < 2) {
            System.out.println("Enter from 2");
        } else {System.out.println("Your number : " + ConvertToAny(decimalNumber, numberSystem));}

        System.out.println("Enter new number in chosen system");
        long newNumber = scanner.nextLong();
        System.out.println(newNumber + " in " + numberSystem + " system = " + ConvertToDecimal(newNumber , numberSystem) + " in decimal system");
    }

    private static String ConvertToAny(long decimalNumber, int numberSystem) { // 43 ,25
        ///////////////////////////
        String result = "";
        if (decimalNumber > 0) {
            while (decimalNumber != 0) {
                int n = (int) (decimalNumber % numberSystem);
                result = n + result;
                decimalNumber = decimalNumber / numberSystem;
            }
            return result; // 118
            ///////////////////////////
        } else if (decimalNumber == 0) {
            return "0";
        } else if (decimalNumber < 0) {
            while (decimalNumber != 0) {
                int n = -(int) (decimalNumber % numberSystem);
                result = n + result;
                decimalNumber = decimalNumber / numberSystem;
            }
            return "-" + result;
        } else return "idk what happened";
    }

    private static int ConvertToDecimal(long newNumber , int numberSystem) { // 118 , 25
            String number = newNumber + "";
            int decimal = 0;
            for (int i = 0; i < number.length(); i++) {
                char c = number.charAt(i); //1 , 1 , 8
                int index = CS.indexOf(c);//1 , 1 , 8
                decimal = (decimal * numberSystem) + index;// (0*25)+1 = 1; (1*25)+1 = 26; (26*25)+8 = 658;
            }
            return decimal;//658
        }
}


import java.util.Scanner;

public class Converter {
    private static final String CodeSymbols = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            System.out.println("Enter decimal number to convert");
            long decimalNumber = scanner.nextLong();
            System.out.println("Enter which system you would like your decimalNumber to be converted(from 2 to 62)");
            int numberSystem = scanner.nextInt();
            if(numberSystem > 62 || numberSystem < 2){
                    System.out.println("Enter from 2 to 62 pls");
            }
            else System.out.println("Your number : " + Convert(decimalNumber , numberSystem));
    }
    private static String Convert(long decimalNumber , int numberSystem) {
        String result = "";
        if(decimalNumber > 0) {
            while (decimalNumber != 0) {
                int n = (int) (decimalNumber % numberSystem);
                result = CodeSymbols.charAt(n) + result;
                decimalNumber = decimalNumber / numberSystem;
            }
            return result;
        }
        else if(decimalNumber == 0){
            return "0";
        }
        else if(decimalNumber < 0){
            while (decimalNumber != 0) {
                int n = (int) (decimalNumber % numberSystem);
                result = CodeSymbols.charAt(-n) + result;
                decimalNumber = decimalNumber / numberSystem;
            }
            return "-" + result;
        }
        else return "idk what happened";
    }

}

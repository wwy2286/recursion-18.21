import java.util.Scanner;


public class DecimalToBinary {

    public static String toBinaryConverter(long n) {

        if (n>0){
            return toBinaryConverter(n/2)+n%2;

            } else{
            return"";
        }

        }

    public static String toBinary(long n){
        if (n==0)
        return "0";
        else
            return toBinaryConverter(n);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long decimal = scanner.nextLong();
        DecimalToBinary decimalToBinary = new DecimalToBinary();
        String binary = decimalToBinary.toBinary(decimal);
        System.out.println("The binary representation is " + binary);

    }
}
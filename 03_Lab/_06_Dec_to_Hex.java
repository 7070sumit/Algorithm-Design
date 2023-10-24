import java.util.Scanner;

public class _06_Dec_to_Hex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Decimal number");
        int n = sc.nextInt();
        String a = Dec_to_Hex(n);
        System.out.println("hexadeciaml=" + a);
    }

    public static String Dec_to_Hex(int n) {
        String result = "";
        int remainder = n % 16;
        if (n == 0) {
            return "";
        } else {
            switch (remainder) {
                case 10:
                    result = "A" + result;
                    break;
                case 11:
                    result = "B" + result;
                    break;
                case 12:
                    result = "C" + result;
                    break;
                case 13:
                    result = "D" + result;
                    break;
                case 14:
                    result = "E" + result;
                    break;
                case 15:
                    result = "F" + result;
                    break;
                default:
                    result = (n % 16) + result;
                    break;
            }
            return Dec_to_Hex(n / 16) + result;
        }

    }
}

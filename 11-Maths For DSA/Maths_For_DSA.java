public class Maths_For_DSA {

    public static void main(String[] args) {


        // convert decimal to binary or any base
        decimalToBinary(5, 2);

        // convert binary to decimal or any base
        binarytodecimal(101, 2);

        // number is even or odd
        System.out.println(even_or_odd(5));

        // reverse a number
        System.out.println(reverseNumber(12345));

        // power function
        System.out.println(power(10, 3));

        // fast power or exponential form
        System.out.println(fastpower(10, 3));

    }


    public static void decimalToBinary(int decimalNum, int base){

        int resNum = 0;
        int power = 0;

        while (decimalNum > 0){
            int rem = decimalNum % base;
            decimalNum /= base;
            resNum += rem * Math.pow(10, power);
            power++;
        }
        System.out.println("Result is "+ resNum);
    }

    public static void binarytodecimal(int binary, int base){

        int power = 0;
        int resnum = 0;

        while(binary > 0){
            int unitdigit = binary % 10;
            binary /= 10;
            resnum += unitdigit * Math.pow(base, power);
            power++;
        }
        System.out.println("Result is "+ resnum);
    }

    public static String even_or_odd(int num){
        if (num % 2 == 0){
            return "Number is Even";
        }
        else{
            return "Number is Odd";
        }
    }

    public static int reverseNumber(int num){

        int reverse = 0;
        while(num > 0){
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }
        return reverse;
    }

    public static double power(int number, int power){
        double result = 1;
        for(int i = 0; i < power; i++){
            result *= number;
        }
        return result;
    }

    public static double fastpower(int number, int power){
        double result = 1;
        while(power > 0){
            if (power % 2 != 0){
                result = result * number;
            }
            power /= 2;

            number = number * number;
        }
        return result;
    }
}
























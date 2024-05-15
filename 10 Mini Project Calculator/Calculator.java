import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {


        Calculator obj = new Calculator();

        Scanner sc = new Scanner(System.in);


        // Take input from user and decide which operations to perform

        do{

            System.out.println("Choose an operations : (+, -, *, /, %)");
            System.out.print("-->");

            String input = sc.next();
            char ch = input.charAt(0);



            if(input.length() != 1){
                System.out.println("wrong input, please try again...");
            }
            else{
                obj.chooseOperation(ch);
            }

            boolean exit = obj.existprogram();

            if (exit){
                break;
            }



        }while(true);

        System.out.println("thanks for using our service...");
    }


    public boolean existprogram(){
        Scanner sc = new Scanner(System.in);
        int times = 0;
        int retry = 5;

        boolean exit = false;

        for (times = 0; times < retry; times++){
            System.out.println("Do you want to continue ? (Y/N) ");
            String exit_input = sc.next();
            char ch1 = exit_input.charAt(0);

            if (exit_input.length() == 1 && ch1 == 'n'){
                return true;
            }
            else if (exit_input.length() == 1 && ch1 == 'y'){
                return  false;
            }
            else{
                System.out.println("Wrong input...please try again");
            }
        }

        if (times >= retry){
            System.out.println("maximum retry count exceeded");
            return true;
        }
        return false;
    }



    public float getInteger(){
        Scanner sc = new Scanner(System.in);

        float num1 = sc.nextFloat();
        return  num1;
    }


    public void chooseOperation(char ch){

        switch (ch){

            case '+':
                System.out.println("Addition Result : "+ (getInteger() + getInteger()));
                break;

            case '-':
                System.out.println("substract Result : "+ ( getInteger() - getInteger()));
                break;

            case '*':
                System.out.println("multiply Result : "+ (getInteger() * getInteger()));
                break;

            case '/':
//                int num3 = getInteger();
//                int num4 = getInteger();
//                if (num4 == 0){
//                    System.out.println("Divide by zero error");
//                    break;
//                }
                System.out.println("Divide Result : "+ (getInteger() / getInteger()));
                break;

            case '%':
                System.out.println("modulo Result :"+ (getInteger() % getInteger()));
                break;

            default:
                System.out.println("something went wrong");
        }
    }
}


































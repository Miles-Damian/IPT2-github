import java.util.Scanner;
public class Calculator{
    //Arithmetic Calculator
    
    public int addition(int a, int b){
        return a+b;
    }


    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Calculator calc = new Calculator();
        boolean calculating = true;


        while(calculating){
         System.out.print("Enter First Number:");
         int num1 = scan.nextInt();
         System.out.print("Enter Second Number:");
         int num2 = scan.nextInt();
         System.out.println("");

         System.out.println("Choose an operation");
         System.out.println("+: for Addition");
         System.out.println("-: for Addition");
         System.out.println("*: for Addition");
         System.out.println("/: for Addition");
         System.out.println("%: for Addition");

         char operation = scan.next().charAt(0);

         switch (operation) {
            case '+':
                System.out.println("Addition:" + calc.addition(num1,num2) + "\n");
                break;
            case '-':
                System.out.println("Subtraction:" + calc.subtraction(num1,num2) + "\n");
                break;
            case '*':
                System.out.println("Multiplication:" + calc.multiplication(num1,num2) + "\n");
                break;
            case '/':
                System.out.println("Division:" + calc.division(num1,num2) + "\n");
                break;
            case '%':
                System.out.println("Modulus:" + calc.modulus(num1,num2) + "\n");
                break;
         
            default:
                System.out.println("Invalid operation");
                break;
         }

        boolean continueOperation = true;
        while(continueOperation){
            String response = scan.next().trim().toLowerCase();
            System.out.println("Do you want to continue?");
            if(response.equalsIgnoreCase("no")){
                calculating = false;
                continueOperation = false;
            }
            else if(response.equalsIgnoreCase("yes")){
                continueOperation = false;
            }
            else{
                System.out.println("Invalid Answer \n");
            }
        }         

        }
        scan.close();
        System.out.println("Calculator has exited");
    }
}
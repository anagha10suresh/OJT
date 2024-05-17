import java.util.Scanner;
public class calculator{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the fisrt number:");
        int num1=scanner.nextInt();
        System.out.println("Enter the second number:");
        int num2=scanner.nextInt();
        System.out.println("Select the operator.(+,-,*,/,%):");
        char operator1=scanner.next().charAt(0);
        int result=0;
        switch (operator1) {
            case '+':
            result=num1+num2;
            break;
            case '-':
            result=num1-num2;
            break;
            case '*':
            result=num1*num2;
            break;
            case '/':
            result=num1/num2;
            break;
            case '%':
            result=num1%num2;
            break;
            default:
               System.err.println("invalid operator");
               break;
        }


System.err.println("Result:"+result);
scanner.close();
        
    }
}
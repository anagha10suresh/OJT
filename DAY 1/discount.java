import java.util.Scanner;
public class discount {
    public static void main(String[] args) {
        Scanner discount=new Scanner(System.in);
        System.out.println("Enter the amount");
        double x=discount.nextDouble();
        double y=x*(10.0/100);
        double z=x-y;
        if(x>1000){
           
System.out.println("Your total discount amount will be:"+z);
            }
            else{
                System.out.println("You are not eligible");
            }
            discount.close();
        }
    }


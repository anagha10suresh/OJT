import java.util.Scanner;
public class age {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the age of first person");
        double one=s.nextDouble();
        System.out.println("Enter the age of second person");
        double two=s.nextDouble();
        System.out.println("Enter the age of third person");
        double three=s.nextDouble();
        if(one>two && one>three){
            System.out.println("First person age is higher");
        }
        else if(two>one && two>three){
            System.out.println("Second person age is higher");

        }
        else{
            System.out.println("Third person age is higher");
        }

        s.close();

    }
    
}

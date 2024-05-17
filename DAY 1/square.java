import java.util.Scanner;
public class square {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the width:");
        int w=sc.nextInt();
        System.out.println("Enter the height:");
        int l=sc.nextInt();
        if(w==l){
            System.out.println("It is square");
        }
        else{
            System.out.println("It is rectangle");
        }
        sc.close();
    }
    
}

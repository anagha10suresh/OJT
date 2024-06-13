public class question1{
    static int f1 = 0, f2 = 1,f3, limit = 10; 
    static void call(){
      
        System.out.println(f1);
        System.out.println(f2);
        
        for (int i = 2; i < limit; i++) {
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
            System.out.println(f3);
        }
    }

    public static void main(String[] args) {
        call();
    }
}

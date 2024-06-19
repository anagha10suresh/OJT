public class calculator3 {
    int add(int a,int b,int c){
        return a+b+c;
    }
    double add(double x,double y,double z){
        return x+y+z;
    }
    

public static void main(String[] args){
    calculator3 cal = new calculator3();
    System.out.println(cal.add(10,20,30));
    System.out.println(cal.add(10.5,20.5,11.5));
}
}

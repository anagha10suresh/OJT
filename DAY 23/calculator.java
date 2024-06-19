public class calculator {
    int add(int a,int b){
        return a+b;
    }
    double add(double x,double y){
        return x+y;
    }
    

public static void main(String[] args){
    calculator cal = new calculator();
    System.out.println(cal.add(10,20));
    System.out.println(cal.add(10.5,20.5));
}
}

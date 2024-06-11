interface shape{
    double calarea();
    double calperimeter();
}
class rectangle implements shape{
    private double length;
    private double width;
    public rectangle(double length, double width){
        this.length=length;
        this.width=width;
    }
    public double calarea(){
        return length*width;
    }
    public double calperimeter(){
        return 2*(length+width);
    }
} 
public class interfaceex{
    public static void main(String[] args) {
        rectangle rec=new rectangle (10,5);
        System.out.println("area of the rectangle:"+rec.calarea());
        System.out.println("perimeter of the square:"+rec.calperimeter());
    }
}
  
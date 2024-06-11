 class parent{
    void display(){
        System.out.println("parent class");
    }

}
class child extends parent{
    @Override
    void display(){
        System.out.println("child class is showing");

    }
}
public class annotationex{
    public static void main(String[] args) {
        parent p=new child();
        p.display();
    }
}
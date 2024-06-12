class livingbeing{
    void sound() {
        System.out.println("Living beings make noise");
    }
} 
  class animal extends livingbeing {
    void sound() {
        System.out.println("Animals makes noises");
    }
}
    class dog extends animal {
        void sound() {
            System.out.println("dogs makes bow bow");
        }
  }
  public class program2 {
    public static void main(String[] args) {
      animal objani=new animal();
      dog obj=new dog();
        objani.sound();
        obj.sound();
    }
  }
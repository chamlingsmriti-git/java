public class Encapsulation{
    private int a;
    public int getA(){
        return a;
    }
    public void setA(int a){
        this.a=a;
    }
}

class Text{
    public static void main(String[]args){
        Encapsulation e=new Encapsulation();
        e.setA(10);
        System.out.println("The value of A is:"+ e.getA());
    }
}

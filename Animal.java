public class Animal{
    void main(){
        System.out.println("eat");
    }
}
class Donkey extends Animal{
    public static void main(String args[]){
        Donkey obj=new Donkey();
        obj.main();
    }
}
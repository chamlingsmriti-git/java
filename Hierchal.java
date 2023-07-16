public class Hierchal{
    void main(){
        System.out.println("Eat");
    }
}
class Donkey extends Hierchal{
    public static void Don(){
        Donkey obj=new Donkey();
        obj.main();
    }
}
class Gorilla extends Hierchal{
    public static void Gor(){
        Gorilla obj=new Gorilla();
            obj.main();
    }
}
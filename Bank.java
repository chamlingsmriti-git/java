interface Bank{
    float rateofinterest();
}
class NIC implements Bank{
    public float rateofinterest(){
        return 9.15f;
    }
}
class Sanima implements Bank{
    public float rateofinterest(){
        return 9.7f;
    }
}
class Testinterface2{
    public static void main(String[]args){
        Bank b=new Sanima();
        System.out.println("ROI:"+b.rateofinterest());
    }
}
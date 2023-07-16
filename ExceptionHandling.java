public class ExceptionHandling{
    public static void main(String[]args){
        divideNumbers(25,5);
        divideNumbers(50,5);
        divideNumbers(5,0);
    }
    public static void divideNumbers(int a,int b){
        try{
            int result=a/b;
            System.out.println("The result of divide is;" + result);
        }catch(ArithmeticException e){
            System.out.println("Error:divide by zero is not allowed.");
        }catch(NumberFormatException e){
            System.out.println("Error:Invalid operand types.");
        }catch(Exception e){
            System.out.println("An error occured:" + e.getMessage());
        }
        }
    }
    
    

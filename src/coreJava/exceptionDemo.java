package coreJava;

/**
 * Created by DD on 2017-11-04.
 */
public class exceptionDemo {


    public static void main(String[] args) {

        int a = 4;
        //3 lines - try catch mechanism

        int b = 7;
        int c = 0;
           try
           {
        int k = a/c;
          }
        catch(ArithmeticException e)
        {System.out.println(e);}
        catch(IndexOutOfBoundsException e){
           System.out.println(e);
        }
        catch(Exception e)
         {
            System.out.println("I catched the error/exception");
         }
         finally {
               System.out.println("This is finally block");
           }

        System.out.println("After finally block");



    }
}

package QSpider.Practice;

import java.io.FileNotFoundException;
import java.io.FileReader;

class MyException extends Exception{
    MyException (String message){
        super(message);
    }
}
public class Exceptions {
    public static void main(String[] args) {
        //checked
        FileReader fileReader;
        try {
            fileReader = new FileReader("/random");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e.getMessage());
        }

        //unchecked (need not to be checked but can be checked)
        int num = 6/0;

        int num2 = 50;
        try {
            if (num2>18)
                throw new MyException("it cant be more then 18");
            else
                System.out.println("done");
        }catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}

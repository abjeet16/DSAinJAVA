package QSpider.Practice;

public class functionalInterface {
    public static void main(String[] args) {
        Functional functional = (num1,num2)->{
            System.out.println(num1+num2);
        };
        functional.addNumber(10,20);
    }
}
@FunctionalInterface
interface Functional{
    void addNumber(int num1 , int num2);
}

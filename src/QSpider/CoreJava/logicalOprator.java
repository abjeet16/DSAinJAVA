package QSpider.CoreJava;

public class logicalOprator {
    public static void main(String[] args) {
        int i = 1;
        int j = 3;
        if (!(i<j)&&i==1){
            System.out.println("i is 1 and also more then j");
        }
        if ((i<j)||i==1){
            System.out.println("i is 1 or i is less then j");
        }
    }
    static void exIfStatment(){
        int age = 20;
        int height = 180;
        float weight = 70.8f;
        if (age<18&&age>16&&height>170&&weight>65){
            System.out.println("the person is can write NDA");
        }
    }
}

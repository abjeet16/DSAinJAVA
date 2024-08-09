package recurtion;

public class firstLastIndex {
    public static int FirstIndex = -1;
    public static int LastIndex = -1;
    public static void main(String[] args) {
        String str = "ababgcacaddaaj";
        char element = 'a';
        FirstLastIndex(str,0,element);
    }

    private static void FirstLastIndex(String str, int index, char element) {
        if (index == str.length()){
            if (FirstIndex == -1 && LastIndex == -1){
                System.out.println("the char is not present in the String");
                return;
            }
            System.out.println(FirstIndex);
            System.out.println(LastIndex);
            return;
        }
        char indexElement = str.charAt(index);
        if (indexElement == element){
            if (FirstIndex == -1){
                FirstIndex = index;
                LastIndex = index;
            }else {
                LastIndex = index;
            }
        }
        FirstLastIndex(str , index+1,element);
    }
}

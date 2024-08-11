package recurtion;

public class keyPad {
    public static String[] keypad ={".","abc","def","ghi",
            "jkl","mno","pqrs","tu","vwx","yz"};
    public static void prinhtComb(String str,int index,String combination){
        if (index == str.length()){
            System.out.println(combination);
            return;
        }
        char currChar = str.charAt(index);
        //- 0 reduces the number or index by 0 (ntg changes)
        String mapping = keypad[currChar-'0'];
        for (int i = 0 ; i<mapping.length();i++){
            prinhtComb(str,index+1,combination+mapping.charAt(i));
        }
    }
    public static void main(String[] args) {
        prinhtComb("08",0,"");
    }
}

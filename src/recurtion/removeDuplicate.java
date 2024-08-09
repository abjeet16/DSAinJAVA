package recurtion;

public class removeDuplicate {
    public static boolean[] map = new boolean[26];
    public static void main(String[] args) {
        String str = "aabbccddaazzzzz";
        RemoveDuplicate(str,0,"");
    }

    private static void RemoveDuplicate(String oldString, int index, String newString) {
        if (index == oldString.length()){
            System.out.println(newString);
            return;
        }
        char currentChar = oldString.charAt(index);
        // - 'a' reduces 1 from index to get the position of char in alphabet
        if (map[currentChar - 'a']){
            RemoveDuplicate(oldString,index+1,newString);
        }else{
            newString += currentChar;
            map[currentChar - 'a'] = true;
            RemoveDuplicate(oldString,index+1,newString);
        }
    }
}

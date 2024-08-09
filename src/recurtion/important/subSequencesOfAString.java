package recurtion.important;

public class subSequencesOfAString {
    public static void main(String[] args) {
        String str = "abc";
        SubSequencesOfAString(str,0,"");
    }

    private static void SubSequencesOfAString(String oldString, int index, String newString) {
        if (index == oldString.length()){
            System.out.println(newString);
            return;
        }
        char currentChar = oldString.charAt(index);
        // if the char wants to come in the subsequence
        SubSequencesOfAString(oldString,index+1,newString+currentChar);

        // if it doesn't want to come in the subsequence
        SubSequencesOfAString(oldString,index+1,newString);
    }
}

package recurtion.important;

import java.util.HashSet;

public class uniqueSubSequences {
    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> hashSet = new HashSet<>();
        SubSequencesOfAString(str,0,"",hashSet);
    }
    private static void SubSequencesOfAString(String oldString, int index, String newString, HashSet<String> hashSet) {
        if (index == oldString.length()){
            if (hashSet.contains(newString)){
                return;
            }else {
                System.out.println(newString);
                hashSet.add(newString);
                return;
            }
        }
        char currentChar = oldString.charAt(index);
        // if the char wants to come in the subsequence
        SubSequencesOfAString(oldString,index+1,newString+currentChar, hashSet);

        // if it doesn't want to come in the subsequence
        SubSequencesOfAString(oldString,index+1,newString, hashSet);
    }
}

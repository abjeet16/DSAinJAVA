package QSpider.JavaProgramming.String;

public class class25_07_25 {
    public static void main(String[] args) {
        String s = "zayx";
        String s1 = "abje";
        //sortCharInString(s);
        String sentence = "i am abjeet he he he he";
        //revSentenceWithoutSplit(sentence);
        //revSentenceWithSplit(sentence);
        //countNumberOfWordsWithOutSplit(sentence);
        //countNumberOfWordsWithSplit(sentence);
        //findLongestWordInSentenceWithSplit(sentence);
        //findLongestWordInSentenceWithoutSplit(sentence);
        //swapTwoStringDataWithoutUsingTemp(s,s1);
        findLengthOfStringWithoutLengthMethod(s);
    }

    private static void findLengthOfStringWithoutLengthMethod(String s) {
        int count = 0 ;
        char[] chars = s.toCharArray();
        for (char ch : chars)
            count++;
        System.out.println(count);

        //another way
        count = 0;
        try{
            while (true){
                s.charAt(count);
                count++;
            }
        }catch (Exception e){

        }
        System.out.println(count);
    }
    private static void swapTwoStringDataWithoutUsingTemp(String s, String s1) {
        System.out.println("before swap s1 : "+s+" s2 : "+s1);
        s +=s1;//zayxabje
        s1 = s.substring(0,s.length()-s1.length());//zayx
        s = s.substring(s1.length(),s.length());//abje
        System.out.println("after swap s1 : "+s+" s2 : "+s1);
    }
    private static void findLongestWordInSentenceWithoutSplit(String sentance) {
        String longest = "";
        int end = sentance.length();
        for (int i = sentance.length()-1 ; i >=0;i--){
            String word = "";
            if (sentance.charAt(i)==' '){
                for (int j = i;j<end;j++){
                    word+=sentance.charAt(j);
                }
                if (word.length()>longest.length())
                    longest = word;
                end = i;
            }
        }
        System.out.println(longest);
    }
    private static void findLongestWordInSentenceWithSplit(String sentance) {
        String[] strings = sentance.split(" ");
        int longest = 0;
        for (int i = 1 ; i < strings.length;i++ ){
            if (strings[longest].length()<strings[i].length())
                longest=i;
        }
        System.out.println(strings[longest]);
    }
    static void countNumberOfWordsWithSplit(String sentance) {
        String[] strings = sentance.split(" ");
        System.out.println(strings.length);
    }
    static void countNumberOfWordsWithOutSplit(String sentance) {
        int count = 1;
        for (int i = sentance.length()-1 ; i >=0;i--){
            if (sentance.charAt(i)==' '){
               count++;
            }
        }
        System.out.println(count);
    }
    private static void revSentenceWithSplit(String sentance) {
        String[] strings = sentance.split(" ");
        String result = "";
        for (int i = strings.length-1;i >=0;i--){
            result+=strings[i]+" ";
        }
        System.out.println(result);
    }
    private static void revSentenceWithoutSplit(String sentance) {
        String result = "";
        int end = sentance.length();
        for (int i = sentance.length()-1 ; i >=0;i--){
            //there is no space before the first word so we manually add it
            if (i==0)
                result+=sentance.charAt(i);

            String word = "";
            if (sentance.charAt(i)==' '){
                for (int j = i;j<end;j++){
                    word+=sentance.charAt(j);
                }
                result+=word+" ";
                end = i;
            }
        }
        System.out.println(result);
    }
    private static void sortCharInString(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0 ; i < chars.length;i++){
            int minIndex = i;
            for (int j = i;j< chars.length;j++)
                if (chars[minIndex]>chars[j])
                    minIndex = j;
            swap(chars,minIndex,i);
        }
        String sorted = new String(chars);
        System.out.println(sorted);
    }
    static void swap(char[] chars, int minIndex, int i) {
        char temp = chars[minIndex];
        chars[minIndex] = chars[i];
        chars[i] = temp;
    }
}

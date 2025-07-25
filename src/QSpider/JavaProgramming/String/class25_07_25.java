package QSpider.JavaProgramming.String;

public class class25_07_25 {
    public static void main(String[] args) {
        String s = "zayx";
        //sortCharInString(s);
        String sentance = "i am abjeet he he he he";
        revSentanceWithoutSplit(sentance);
        revSentanceWithSplit(sentance);
    }

    private static void revSentanceWithSplit(String sentance) {
        String[] strings = sentance.split(" ");
        String result = "";
        for (int i = strings.length-1;i >=0;i--){
            result+=strings[i]+" ";
        }
        System.out.println(result);
    }

    private static void revSentanceWithoutSplit(String sentance) {
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

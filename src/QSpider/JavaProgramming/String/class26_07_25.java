package QSpider.JavaProgramming.String;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class class26_07_25 {

    public static void main(String[] args) {
        String string = "abyjjeeett";
        //countVowelConsonantsDigits(string);
        //revStringByUsingMethodRecursion(string,"",string.length()-1);
        //revStringByUsingMethodRecursionBetter(string);
        findDublicateInString(string);
        findNonDublicateInString(string);
        findNonDublicateInStringUsingString(string);
    }

    private static void findNonDublicateInStringUsingString(String string) {
        Set<Character> chars = new LinkedHashSet<>();
        for (int i = 0 ; i < string.length(); i++)
            if (chars.add(string.charAt(i)))
                System.out.println(string.charAt(i));
        System.out.println(chars);
    }
    private static void findDublicateInStringUsingString(String string) {
        Set<Character> chars = new HashSet<>();
        for (int i = 0 ; i < string.length(); i++)
            if (!chars.add(string.charAt(i)))
                System.out.println(string.charAt(i));
    }

    private static void findNonDublicateInString(String string) {
        string = string.toLowerCase();
        for (int i = 0; i < string.length()-1;i++){
            boolean flag = false;
            for (int j = i+1;j<string.length();j++){
                if (string.charAt(i)==string.charAt(j)){
                    flag = true;
                    break;
                }
            }
            if (!flag)
                System.out.print(string.charAt(i)+" ");
        }
        System.out.println(string.charAt(string.length()-1));
    }

    private static void findDublicateInString(String string) {
        string = string.toLowerCase();
        for (int i = 0; i < string.length()-1;i++){
            boolean flag = false;
            for (int j = i+1;j<string.length();j++){
                if (string.charAt(i)==string.charAt(j)){
                    flag = true;
                    break;
                }
            }
            if (flag)
                System.out.print(string.charAt(i)+" ");
        }
    }

    private static void revStringByUsingMethodRecursion(String string, String rev,int count) {
        if (count<0){
            System.out.println(rev);
            return;
        }
        revStringByUsingMethodRecursion(string,rev+string.charAt(count),count-1);
    }
    private static String revStringByUsingMethodRecursionBetter(String string) {
        if (string.length()==1){
            return string;
        }
        return string.charAt(
                string.length()-1
        )+revStringByUsingMethodRecursionBetter(
                string.substring(0,string.length()-1)
        );
    }
    private static void countVowelConsonantsDigits(String string) {
        int digit = 0,vowel = 0,conson = 0;
        string=string.toLowerCase();

        for(int i = 0 ; i < string.length(); i++){
            if (string.charAt(i)>='0'&& string.charAt(i)<='9')
                digit++;
            else if(string.charAt(i)=='a'||string.charAt(i)=='e'||string.charAt(i)=='i'||string.charAt(i)=='u'||string.charAt(i)=='o')
                vowel++;
            else if (string.charAt(i)>='a'&&string.charAt(i)<='z')
                conson++;
        }
        System.out.println("vowel : "+vowel+" digits : "+digit+" cons : "+conson);
    }
}

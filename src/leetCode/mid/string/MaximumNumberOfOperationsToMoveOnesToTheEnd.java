package leetCode.mid.string;

import com.sun.jdi.event.MonitorWaitedEvent;

/// 3228. Maximum Number of Operations to Move Ones to the End
public class MaximumNumberOfOperationsToMoveOnesToTheEnd {
    public static int maxOperations(String s) {
        int oneCount = 0;
        int max = 0;
        int len = s.length();
        for(int i = 0 ;  i < len; i++){
            char ch = s.charAt(i);
            if (ch=='1')
                oneCount++;
            else{
                if (i==len-1||s.charAt(i+1)=='1')
                    max += oneCount;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        String str = "00111";
        System.out.println(maxOperations(str));
    }
}

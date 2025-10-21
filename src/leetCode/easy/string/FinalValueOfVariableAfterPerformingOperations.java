package leetCode.easy.string;
//2011. Final Value of Variable After Performing Operations
public class FinalValueOfVariableAfterPerformingOperations {
    public int finalValueAfterOperations(String[] operations) {
        int res = 0;
        for (String str : operations){
            if (str.charAt(0)=='-'||str.charAt(2)=='-'){
                res--;
            }else{
                res++;
            }
        }
        return res;
    }
}

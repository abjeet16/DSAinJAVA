package leetCode.easy.simulation;

/// 258. Add Digits
public class AddDigits {
    public int addDigits(int num) {
        int ans = num;
        while(num>9){
            num = getSum(num);
            if(num!=0){
                ans = num;
            }
        }
        return ans;
    }
    public int getSum(int num){
        int res = 0;
        while(num!=0){
            res+=(num%10);
            num/=10;
        }
        return res;
    }
}

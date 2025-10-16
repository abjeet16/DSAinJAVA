package leetCode.easy.string;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<>();
        for (int i = 0 ; i < n ; i++){
            res.add(getString(i+1));
        }
        return res;
    }
    private String getString(int i) {
        if (i%3==0&&i%5==0)
            return "FizzBuzz";
        else if (i%3==0) {
            return "Fizz";
        } else if (i%5==0) {
            return "Buzz";
        }
        return String.valueOf(i);
    }
}

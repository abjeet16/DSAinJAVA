package strivers.stackAndQueue.mid;

import java.util.Stack;

/// 155. Min Stack
public class MinStack {
    /*class Pair{
        private Integer val;
        private Integer min;
        public Pair(int val,int min){
            this.val = val;
            this.min = min;
        }
        public int getVal(){
            return val;
        }
        public int getMin(){
            return min;
        }
    }
    Stack<Pair> stack;
    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int val) {
        Pair pair;
        if (stack.isEmpty()){
            pair = new Pair(val,val);
        }else {
            int currMin = stack.peek().getMin();
            if (val<currMin) {
                currMin = val;
            }
            pair = new Pair(val,currMin);
        }
        stack.push(pair);
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek().getVal();
    }

    public int getMin() {
        return stack.peek().getMin();
    }*/

    Stack<Integer> vals;
    Stack<Integer> mins;
    public MinStack() {
        vals = new Stack<>();
        mins = new Stack<>();
    }

    public void push(int val) {
        if (vals.isEmpty()||val<=mins.peek())mins.push(val);
        vals.push(val);
    }

    public void pop() {
        int val = vals.pop();
        if (mins.peek()==val)
            mins.pop();
    }

    public int top() {
        return vals.peek();
    }

    public int getMin() {
        return mins.peek();
    }
}

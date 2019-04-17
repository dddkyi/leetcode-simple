package main.leetcode.leetcode;

import java.util.Stack;

class MinStack {
    /** initialize your data structure here. */

    static Stack<Integer> minstack;
    static Stack<Integer> stack;

    public static void MinStack() {
        minstack=new Stack<Integer>();
        stack=new Stack<Integer>();
    }

    public static void push(int x) {
        stack.push(x);
        if (minstack.empty()||x<=minstack.peek()){
            minstack.push(x);
        }

    }

    public static void pop() {
        if (minstack.peek().equals(stack.peek())){
            minstack.pop();
        }
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public static int getMin() {
        return minstack.peek();
    }

    public static void main(String[] args){

        MinStack.MinStack();
        MinStack.push(512);
        MinStack.push(-1024);
        MinStack.push(-1024);
        MinStack.push(512);
        MinStack.pop();
        int a=MinStack.getMin();
        MinStack.pop();
        int b=MinStack.getMin();
        MinStack.pop();
        int c=MinStack.getMin();

        System.out.println(a+" "+b+" "+c);
    }


}
/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
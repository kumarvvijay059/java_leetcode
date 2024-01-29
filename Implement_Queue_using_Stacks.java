import java.util.*;
import java.lang.*;
import java.io.*;
public class Implement_Queue_using_Stacks {
    class MyQueue {
        Stack<Integer> s1 = new Stack<>();

        public MyQueue() {

        }

        public void push(int x) {
            s1.push(x);
        }

        public int pop() {
            Stack<Integer> s2 = new Stack<>();
            int n = s1.size();
            for(int i = 0 ; i<n ; i++)
            {
                s2.push(s1.pop());
            }
            int p = s2.pop();
            n = s2.size();
            for(int i = 0 ; i<n ; i++)
            {
                s1.push(s2.pop());
            }
            return p;
        }

        public int peek() {
            Stack<Integer> s2 = new Stack<>();
            int n  = s1.size();
            for(int i = 0 ; i<n ; i++)
            {
                s2.push(s1.pop());
            }
            int p = s2.peek();
            n = s2.size();
            for(int i = 0 ; i<n ; i++)
            {
                s1.push(s2.pop());
            }
            return p;
        }

        public boolean empty() {
            return s1.empty();
        }
    }

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
}

package dataStructure;

import java.util.Stack;

/**
 * Created by Shahida Lucky on 12/6/2015.
 */
public class USeOfStack {
    public static void main(String[] args) {
        Stack<String> list = new Stack();

        list.push("California");
        list.push("NewYork");
        list.push("NewJersy");

        for(int i=0; i<=list.size()+1;i++) {
            System.out.println(list.pop());
        }
    }
}

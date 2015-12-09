package dataStructure;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Shahida Lucky on 12/6/2015.
 */
public class UseOfQueue {
    public static void main(String[] args) {
        Queue<String> line = new LinkedList<>();
        line.add("LA");
        line.add("NewYOrk");
        line.add("NewJersy");

        Iterator it = line.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}

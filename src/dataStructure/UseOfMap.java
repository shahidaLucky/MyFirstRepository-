package dataStructure;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Shahida Lucky on 12/6/2015.
 */
public class UseOfMap {
    public static void main(String[] args) {

        Map<String, String> map = new LinkedHashMap<String, String>();

        map.put("UK", "London");
        map.put("USA", "New York");
        map.put("Australia", "Sydney");
        map.put("Germany", "Berlin");



                     //......... Using foreach loop (same thing)................

       // for(Map.Entry<String, String> st:map.entrySet()){
         //   System.out.println(st.getKey()+"------->"+st.getValue());
        //}


                       //............. using Iterator (same thing)......................

        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}

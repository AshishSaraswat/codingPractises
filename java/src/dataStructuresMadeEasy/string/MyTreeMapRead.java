package string;

import java.util.Set;
import java.util.TreeMap;

public class MyTreeMapRead {
	 
    public static void main(String a[]){
        TreeMap<String, String> hm = new TreeMap<String, String>();
        //add key-value pair to TreeMap
        hm.put("first", "FIRST INSERTED");
        hm.put("second", "SECOND INSERTED");
        hm.put("third","THIRD INSERTED");
        System.out.println(hm);
        Set<String> keys = hm.keySet();
        for(String key: hm.keySet()){
            System.out.println("Value of "+key+" is: "+hm.get(key));
        }
    }
}
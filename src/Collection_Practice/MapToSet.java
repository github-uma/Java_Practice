package Collection_Practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapToSet {

    public static void main(String[] args) {

        Map<Integer,String> map= getMap();

        //Convert Map keys to Set
        Set<Integer> keySet= new HashSet<Integer>(map.keySet());
        keySet.forEach(key-> System.out.println(key));

        //Convert Map values to Set
        Set<String> valueSet= new HashSet<String>(map.values());
        valueSet.forEach(value-> System.out.println(value));
        
        //Convert Map key-value to Set key value
        Set<Entry<Integer,String>> entrySet=map.entrySet();
        for(Entry<Integer,String> entryset:entrySet)
        {
        	System.out.println(entryset.getKey()+" "+entryset.getValue());
        }
    }

    static Map<Integer,String> getMap(){

        Map<Integer, String> sampleMap=new HashMap<Integer,String>();
        sampleMap.put(1,"Sunday");
        sampleMap.put(2,"Monday");
        sampleMap.put(3,"Tuesday");
        sampleMap.put(4,"Wednesday");

        return sampleMap;
    }
}
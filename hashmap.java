import java.util.*;
public class hashmap{
    public static void main(String[] args){
        HashMap<String, Integer>ageMap = new HashMap<>();

ageMap.put("arun",25);
ageMap.put("Bilal",45);
ageMap.put("ANAM",33);
System.out.println("Ahe of Bob is"+ageMap.get("BOB"));

for(HashMap.Entry<String,Integer>enter:
ageMap.entrySet()){
System.out.println(enter.getKey()+":"+enter.getValue());
}

    }
}

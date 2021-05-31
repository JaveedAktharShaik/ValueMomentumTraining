package com.vm.session.concurrency;
import java.util.HashMap;

public class ConcurrentHashMapDemo {

public static void main(String[] args) {
// TODO Auto-generated method stub

HashMap<String, Integer> hm =new HashMap<String, Integer>();

hm.put("Jav", 95);
hm.put("Elu", 80);
hm.put("rishi", 90);

System.out.println("Elements = "+hm);


for(Integer val:hm.values())
{
	System.out.println(val);
	//hm.computeIfAbsent("mahesh", a->90);
	hm.put("sam", 89);
}
System.out.println("After adding = "+hm);




}

}


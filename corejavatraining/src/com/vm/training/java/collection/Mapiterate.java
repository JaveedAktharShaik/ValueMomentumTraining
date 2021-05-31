package com.vm.training.java.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Mapiterate {
  static HashMap hashadd(HashMap contacts,String name, String number)
	{
		contacts.put(name,number);
		return contacts;
	}
	static HashMap hashremove(HashMap contacts,String name, String number)
	{
		contacts.remove(name);
		return contacts;
	}
	static void displayContact(HashMap contacts)
	{
		System.out.println(contacts);
	}
public static void main(String[] args) {
	/*LinkedHashMap lhm=new LinkedHashMap();
	lhm.put("javeed", "akthar");
	lhm.put("elu", "jav");
	lhm.put("imran", "irfan");
	lhm.put("hussain", "siraj");
	System.out.println(lhm);
	System.out.println(lhm.get("guda"));
	System.out.println(lhm.keySet());
	System.out.println(lhm.values());
	for(Object s:)*/
	
	
	HashMap contacts=new HashMap();
	hashadd(contacts,"javeed","9866374666");
	hashadd(contacts,"elu","44438773");
	hashadd(contacts,"imran","89988661");
	hashremove(contacts,"hussain", null);
	displayContact(contacts);
	
}
}


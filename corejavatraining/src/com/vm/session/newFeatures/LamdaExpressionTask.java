package com.vm.session.newFeatures;


interface findLength
{
int find(String name);
}

interface Reverse
{
String reverse(String name);
}



public class LamdaExpressionTask {

public static void main(String[] args) {

findLength fl=(name)->name.length();
System.out.println("Length of name = "+fl.find("javeed"));

Reverse rev=(name)->
{
StringBuffer sb=new StringBuffer(name);
sb=sb.reverse();
String s=sb.toString();
return s;
};
System.out.println("Reversed string = "+rev.reverse("Javeed"));



}

}


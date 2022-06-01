package com.ford.pfs.movis.controller;

public class SingletonProgram {

	private static SingletonProgram single_instance = null;
	  
    public String str;
  
    private SingletonProgram()
    {
        this.str = "Hello Singleton world";
    }
  
    public static SingletonProgram getInstance()
    {
        if (single_instance == null)
            single_instance = new SingletonProgram();
  
        return single_instance;
    }
}
  
class GFG {

    public static void main(String args[])
    {
    	SingletonProgram x = SingletonProgram.getInstance();
  
    	SingletonProgram y = SingletonProgram.getInstance();
  
    	SingletonProgram z = SingletonProgram.getInstance();
  
        System.out.println("Hashcode of x is "
                           + x.hashCode());
        System.out.println("Hashcode of y is "
                           + y.hashCode());
        System.out.println("Hashcode of z is "
                           + z.hashCode());
        System.out.println("String from x is " + x.str);
        System.out.println("String from y is " + y.str);
        System.out.println("String from z is " + z.str);
        if (x == y && y == z) {
  
            System.out.println(
                "Three objects point to the same memory location on the heap i.e, to the same object");
        }
  
        else {
            System.out.println(
                "Three objects DO NOT point to the same memory location on the heap");
        }
    }
}

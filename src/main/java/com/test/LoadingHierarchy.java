/**
 * 
 */
package com.test;

/**
 * 
 */
public class LoadingHierarchy {
	
	static {
		System.out.println("Static Block of LoadingHierarchy-1"); 
	}
	
	static {
		System.out.println("Static Block of LoadingHierarchy-2"); 
	}
	
	LoadingHierarchy(){
		System.out.println("Constructor Block of LoadingHierarchy"); 
	}
	
	public static void main(String a[]) {
		System.out.println("static main method");
		SomeClass sClass = new SomeClass();
		sClass.methodHr();
		
		LoadingHierarchy lr = new LoadingHierarchy();
	}
	
}

class SomeClass{
	
	SomeClass(){
		System.out.println("Constructor Block Someclass"); 
	}
	
	public void methodHr() {
		{
			System.out.println("Inside MethodHr() Block");
		}
		
		System.out.println("Inside MethodHr()"); 
	}
	
	static {
		System.out.println("\nStatic Block of SomeClass"); 
	}
}


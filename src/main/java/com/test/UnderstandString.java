package com.test;

/**
 * Hello world!
 *
 */
public final class UnderstandString 
{
    public static void main( String[] args)
    {
    	//String
    	String str = "Welcome";
    	System.out.println(str);
    	
    	str = "Hello";
    	System.out.println(str);

    	//String Buffer
    	StringBuffer sbuf = new StringBuffer();
    	sbuf.append("First String.");
    	sbuf.append(" Second String.").append(" third string\n");
    	sbuf.append(sbuf);
    
    	System.out.println(sbuf);
    	
    	
    	//String Builder
    	StringBuilder sBuilder = new StringBuilder();
    	sBuilder.append("First String.");
    	sBuilder.append(" Second String.").append(" third string\n");
    	
    	System.out.println(sBuilder);
    	
    }
}

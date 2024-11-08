package com.nt.service;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class AppTest 
{	
	private static Arthametic ar;
	@BeforeAll
	public static void setupOnceBefore()
	{
		System.out.println("AppTest.setupOnceBefore()");
    	ar=new Arthametic();		
	}
	@AfterAll
	public static void setupOnceAfter()
	{
		System.out.println("AppTest.setupOnceAfter()");
		ar=null;
	}
	@BeforeEach
	public void beforeEach()
	{
		System.out.println("AppTest.beforeEach()");
	}
	@AfterEach
	public void afterEach()
	{
		System.out.println("AppTest.afterEach()");
	}
    @Test
    public void testSumWithPositives() 
    {
    	System.out.println("AppTest.testSumWithPositives()");
    	int a=100,b=200;
    	int expected=300;
    	int actual=ar.sum(a, b);
        assertEquals(expected,actual);
    }
    @Test
    public void testSubWithPositives() 
    {
    	System.out.println("AppTest.testSubWithPositives()");
    	int a=100,b=200;
    	int expected=-100;
    	int actual=ar.substraction(a, b);
        assertEquals(expected,actual);
    }
    @Test
    public void testSumWithNegatives() 
    {
    	System.out.println("AppTest.testSumWithNegatives()");
    	int a=-100,b=-200;
    	int expected=-300;
    	int actual=ar.sum(a, b);
        assertEquals(expected,actual);
    }
    @Test
    public void testSubWithNegatives() 
    {
    	System.out.println("AppTest.testSubWithNegatives()");
    	int a=-100,b=-200;
    	int expected=100;
    	int actual=ar.substraction(a, b);
        assertEquals(expected,actual);
    }
    @Test
    public void testSumWithMixed() 
    {
    	System.out.println("AppTest.testSumWithMixed()");
    	int a=100,b=-200;
    	int expected=-100;
    	int actual=ar.sum(a, b);
        assertEquals(expected,actual);
    }
    @Test
    public void testSubWithMixed() 
    {
    	System.out.println("AppTest.testSubWithMixed()");
    	int a=100,b=-200;
    	int expected=300;
    	int actual=ar.substraction(a, b);
        assertEquals(expected,actual);
    } 
    @Test
    public void testSumWithZeros() 
    {
    	System.out.println("AppTest.testSumWithZeros()");
    	int a=0,b=0;
    	int expected=0;
    	int actual=ar.sum(a, b);
        assertEquals(expected,actual);
    }
    @Test
    public void testSubWithZeros() 
    {
    	System.out.println("AppTest.testSubWithZeros()");
    	int a=0,b=0;
    	int expected=0;
    	int actual=ar.substraction(a, b);
        assertEquals(expected,actual);
    }
}
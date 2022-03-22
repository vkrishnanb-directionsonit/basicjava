package edu.lessons.day31.primitiveTypes.wrappers;

import java.math.BigInteger;

public class BigIntegerDemo
{
	public static void testBigInteger()throws Exception
	{
		long l1=9876543210l;
		BigInteger bi=BigInteger.valueOf(l1);
		System.out.println(bi);
	}
}
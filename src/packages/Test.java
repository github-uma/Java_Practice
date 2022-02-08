package packages;

import package_default.TestDefault;
import package_private.TestPrivate;
import package_protected.TestProtected;
import package_public.TestPublic;

public class Test extends TestProtected{

	public static void main(String[] args)
	{
		Test t=new Test();
		TestDefault obj1=new TestDefault(); // No variable and method accessed in different package
		TestPrivate obj2=new TestPrivate(); // No variable and method accessed in different package
		TestProtected obj3=new TestProtected(); // No variable and method accessed in different package it possible if inherit
		System.out.println(t.protectedNum);
		t.getData();
		TestPublic obj4=new TestPublic();
		System.out.println(obj4.publicNum);
		obj4.getData();

	}

}


package com.launching;

public class Example extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		init();

		launcher("chromebrowser");

		navigateUrl("amazonurl");
	}

}


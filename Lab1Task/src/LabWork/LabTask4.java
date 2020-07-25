/*Author:Rashi Gupta
Date:25/07/2020
Time:10:23 PM
File:LabTask2.java
*/
package LabWork;


class Static  {
	//non static variable
	int rk = 10;
	//static variable
	public static int num;
	public static String name ="Rashi";
	//Constructor
	Static(){
		System.out.println("Constructor Called!!");
	}
	//static block which will be printed only once
	static {
		System.out.println("inside static block");
	}
	
}

public class LabTask4 {
	
	public static void main(String[] args) {
		Static.num=100;
		System.out.println("Static Variable : "+Static.name+","+Static.num);
		Static s1 = new Static(); //making objects of Static class
		Static s2 = new Static();
		System.out.println("Non-Static Variable : "+s1.rk);
		}

}

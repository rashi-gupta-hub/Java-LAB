/*Author:Rashi Gupta
Date:25/07/2020
Time:10:23 PM
File:LabTask2.java
*/
package LabWork;

public class LabTask1 {

	public static void display(Class<?> type, int size, Number min, Number max) {
        System.out.printf("%-10s %-5s %-20s %s\n", type, size, min, max);
	 }

	public static void main(String[] args) {
		System.out.printf("%-10s %-5s %-20s %s\n","type","size","min","max");
       System.out.println("");
       display(Byte.TYPE, Byte.SIZE, Byte.MIN_VALUE, Byte.MAX_VALUE);
       display(Character.TYPE, Character.SIZE, (int) Character.MIN_VALUE, (int) Character.MAX_VALUE);
       display(Integer.TYPE, Integer.SIZE, Integer.MIN_VALUE, Integer.MAX_VALUE);
       display(Float.TYPE, Float.SIZE, Float.MIN_VALUE, Float.MAX_VALUE);
       display(Double.TYPE, Double.SIZE, Double.MIN_VALUE, Double.MAX_VALUE);
       display(Long.TYPE, Long.SIZE, Long.MIN_VALUE, Long.MAX_VALUE);
       display(Double.TYPE, Double.SIZE, Double.MIN_VALUE, Double.MAX_VALUE);
       System.out.println(Boolean.TYPE);

	}
}

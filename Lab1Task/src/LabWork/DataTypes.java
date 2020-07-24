package LabWork;

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char marks,grade;
	    marks = '8';
	    grade = 'B';
	    System.out.println("Marks: "+marks);
	    System.out.println("Grade: "+grade);
	    
	    byte myByte1,myByte2;
	    myByte1 = 127;
	    myByte2 = -48;
	    System.out.println("Byte 1: " +myByte1);
	    System.out.println("Byte 2: " +myByte2);
	    
	    short myShort = 6000;
	    System.out.println("myShort: " + myShort);
	    
	    int myNum1, myNum2, result;
	    myNum1 = -7000;
	    myNum2 = 90000;
	    result = myNum1 + myNum2;
	    System.out.println("Number 1: " +myNum1);
	    System.out.println("Number 2: " +myNum2);
	    System.out.println("Number 1 + Number 2: " +result);
	    
	    long myLong1, myLong2, result1;
	    myLong1 = 100000000L;
	    myLong2 = 200L;
	    result1 = myLong1 * myLong2;
	    System.out.println("Number 1: " +myLong1);
	    System.out.println("Number 2: " +myLong2);
	    System.out.println("Number 1 * Number 2: " +result1);
	    
	    float myFloat1,myFloat2,result2;
        myFloat1=1000.666f;
        myFloat2=110.77f;
        result2=myFloat1-myFloat2;
        System.out.println("Number1: "+myFloat1);
        System.out.println("Number2: "+myFloat2);
        System.out.println("Number1-Number2: "+result2);

	}

}

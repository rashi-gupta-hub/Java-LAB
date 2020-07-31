/* Created by Intellij IDEA
* Author- Rashi Gupta
* Date-31/07/2020
* Time-8:00 PM
* File- Lab3Task.java
*/

package LabTasks;
import java.util.Scanner;

public class Lab3Task {

    public static final String DISCOUNT_CODE = "CoVid19";

    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        String clientInputDiscountCode = scannerObject.nextLine();
        if (DISCOUNT_CODE.compareTo(clientInputDiscountCode) == 0) {
            System.out.println("Congrats, you get ₹ 100 off on your bill!");
        }
        else if(clientInputDiscountCode.isEmpty()){
            System.out.println("The coupon code cannot be blank or empty");
        }
        else{
           System.out.println("Sorry,coupon is invalid");
        }
    }
}







/*   Created by IntelliJ IDEA.
 *   Author: Rashi Gupta
 *   Date: 07/08/20
 *   Time: 8:47 PM
 *   File: Lab5Task.java
 */
package labTasks;

public class Lab5Task {
    private static final byte RANDOM_NUMBER_MAX_LIMIT = 10;

    private static int generateOTP() {

        int NumberofDigits = 6;


        int OnetimePassword = 0;
        for (int i = 0; i < NumberofDigits; i++) {
            int randomNumber = 0;
            randomNumber = createRandomNumber();
            int PowersofTen = (int) Math.pow(10.0, i);
            PowersofTen = randomNumber * PowersofTen;
            OnetimePassword = OnetimePassword + PowersofTen;
        }


        return OnetimePassword;
    }


    private static int createRandomNumber() {
        return (int) (Math.random() * RANDOM_NUMBER_MAX_LIMIT);
    }

    private static void printOTP(int generatedOTP) {
        String otpString = String.valueOf(generatedOTP);
        for (int i = 0; i < otpString.length(); i++) {
            System.out.print(otpString.charAt(i) + (i < otpString.length() - 1 ? "-" : ""));
        }
    }

    public static void main(String[] args) {
        int generatedOTP = generateOTP();
        System.out.print("Your OTP is : ");
        printOTP(generatedOTP);
    }
}

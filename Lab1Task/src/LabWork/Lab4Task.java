/*   Created by IntelliJ IDEA.
 *   Author: Rashi Gupta
 *   Date: 01/08/20
 *   Time: 8:17 PM
 *   File: Lab4Task.java
 */

package LabTasks;
import java.util.Scanner;

public class Lab4Task {
        private static final byte TOTAL_PARTICIPANTS = 100;
        private static void sellTicket(String participantName) {
            String message = "Congratulations, " + participantName + ". " +
                    "See you at the conference!";
            System.out.println(message);
        }

        public static void main(String[] args) {

            byte numberOfTicketsSold = 0;
            while(numberOfTicketsSold<=TOTAL_PARTICIPANTS) {
                int numberOfTicketsLeft = TOTAL_PARTICIPANTS-numberOfTicketsSold;
                System.out.println("Total Tickets Left: "+ numberOfTicketsLeft);

                System.out.print("Enter your name : ");

                Scanner input = new Scanner(System.in);

                String participantName = input.next();


                sellTicket(participantName);

                numberOfTicketsSold++;
                if (numberOfTicketsSold==TOTAL_PARTICIPANTS) {
                    System.out.print("Sorry, The tickets are sold-out!");

                    break;

                }
            }

        }
    }

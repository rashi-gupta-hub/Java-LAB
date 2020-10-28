package LabTasks;
import java.util.*;

public enum Months {
    JANUARY(31),
    FEBRUARY(28),
    MARCH(31),
    APRIL(30),
    MAY(31),
    JUNE(30),
    JULY(31),
    AUGUST(30),
    SEPTEMBER(31),
    OCTOBER(30),
    NOVEMBER(31),
    DECEMBER(30);

    private int action;


    public int getDay()
    {
        return this.action;
    }


    private Months(int action)
    {
        this.action = action;
    }
}
class labtasks
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter MONTH: ");
        String month= sc.nextLine();
        System.out.print("Enter Today's Day: ");


        int day = sc.nextInt();
        Months[] counters = Months.values();

        for (Months counter : counters)
        {

            if(counter.name().equalsIgnoreCase(month))
            {
                int remainingDays=counter.getDay()-day;
                System.out.print(counter.getDay() +" - " + day + " = " + remainingDays +" Days left in " + month.toUpperCase() +"!");
                break;

            }

        }
    }
}

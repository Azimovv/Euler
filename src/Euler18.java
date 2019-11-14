public class Euler18 {
    public static void main (String[] args)
    {
        int days=0;
        int prevDays;
        int weekdaycounter=2;
        int firstSundays=0;
        boolean isLeap;
        for(int year=1901; year<=2000; year++)
        {
            prevDays = days;

            isLeap = false;
            if (year%4==0)
            {
                if (year%100==0 && year%400==0)
                    isLeap = true;
                else if (year%100==0 && year%400!=0)
                    isLeap=false;
                else
                    isLeap = true;
            }

            for(int month=1; month<=12; month++)
            {
                if(weekdaycounter==7)
                    firstSundays++;

                if (month==2 || month==4 || month==6 || month==9 || month==11)
                {
                    if(month==2) {
                        if (isLeap)
                            days += 29;
                        else
                            days += 28;
                    }
                    else
                        days+=30;

                }
                else
                    days+=31;

                for(int i=prevDays; i<=days; i++)
                {
                    if(weekdaycounter==1)
                        System.out.println("The day is: " + i + " and it's a Monday");
                    else if(weekdaycounter==2)
                        System.out.println("The day is: " + i + " and it's a Tuesday");
                    else if(weekdaycounter==3)
                        System.out.println("The day is: " + i + " and it's a Wednesday");
                    else if(weekdaycounter==4)
                        System.out.println("The day is: " + i + " and it's a Thursday");
                    else if(weekdaycounter==5)
                        System.out.println("The day is: " + i + " and it's a Friday");
                    else if(weekdaycounter==6)
                        System.out.println("The day is: " + i + " and it's a Saturday");
                    else if(weekdaycounter==7)
                        System.out.println("The day is: " + i + " and it's a Sunday");

                    if(weekdaycounter<7)
                        weekdaycounter++;
                    else
                        weekdaycounter=1;
                }

            }

            days=0;
        }
        System.out.println("First Sundays: " + firstSundays);
    }
}

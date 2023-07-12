package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {

    public void printDays(int year, int month) {
        //Create a program that will consume a year and a month (validation is required)
        //and will print amount of days in this month considering also if a year is leap or not
        //(prints amount of days or else "invalid date", negative years are not accepted)
        boolean isLeap = false;
        if (year < 0 || month < 1 || month > 12) System.out.println("invalid date");
        else {
            //год должен быть кратен 400
            //или год должен быть кратен 4, но не 100.
            if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) isLeap = true;
            if (month == 2 && isLeap) System.out.println(29);
            if (month == 2 && !isLeap) System.out.println(28);
            //1, 3, 5, 7, 8, 10, 12 - 31
            //4, 6, 9, 11 - 30
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) System.out.println(31);
            if (month == 4 || month == 6 || month == 9 || month == 11) System.out.println(30);
        }
    }
}

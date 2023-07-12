package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        if (divider == 0) System.out.println("division by zero");
        else {
            int divRes = dividend / divider;
            //System.out.println(divRes);
            int res = divRes * divider;
            //System.out.println(res);
            if (dividend == res) System.out.println("can be divided completely");
            else System.out.println("cannot be divided completely");
        }

    }
}

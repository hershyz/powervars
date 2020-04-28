public class powernum {

    public static double raw;

    //Constructor:
    public powernum(double n) {
        raw = n;
    }

    //Finds out of the value is even or not:
    public boolean isEven() {

        double d = raw / 2;
        if (Math.round(d) == d) {
            return true;
        }
        else {
            return false;
        }
    }

    //Precise round (n must be a number to a power of 10):
    //Example: preciseRound(.1) --> rounds to the nearest hundredth
    public double preciseRound(double n) {

        double temp = raw;
        double subtracted = 0;
        double half = n / 2;

        while (temp >= n) {
            temp = temp - n;
            subtracted = subtracted + n;
        }

        if (temp >= half) {
            return subtracted + n;
        }
        else {
            return subtracted;
        }
    }
}
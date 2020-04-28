import java.util.Arrays;

public class powernumarray {

    public static double[] raw;

    //Constructor:
    public powernumarray(double[] vals) {

        raw = new double[vals.length];
        for (int i = 0; i < vals.length; i++) {
            raw[i] = vals[i];
        }
    }

    //Returns a sorted array from raw values:
    public double[] sort() {

        double[] temp = new double[raw.length];
        for (int i = 0; i < raw.length; i++) {
            temp[i] = raw[i];
        }

        Arrays.sort(temp);
        return temp;
    }

    //Displays raw values:
    public void display() {
        for (int i = 0; i < raw.length; i++) {
            System.out.println(raw[i]);
        }
    }

    //Returns a reversed array from raw values:
    public double[] reverse() {

        double[] temp = new double[raw.length];
        int index = 0;
        for (int i = raw.length - 1; i >= 0; i--) {
            temp[index] = raw[i];
            index++;
        }

        return temp;
    }

    //Rounds all values from raw array:
    public double[] roundAll() {

        double[] temp = new double[raw.length];
        for (int i = 0; i < raw.length; i++) {
            temp[i] = Math.round(raw[i]);
        }

        return temp;
    }

    //Returns a subarray from a left and right index boundary:
    public double[] subarrayFromBounds(int leftIndex, int rightIndex) {

        double[] temp = new double[rightIndex - leftIndex + 1];
        for (int i = leftIndex; i <= rightIndex; i++) {
            temp[i] = raw[i];
        }

        return temp;
    }

    //Returns average of numbers in the array:
    public double mean() {

        double total = 0;
        for (int i = 0; i < raw.length; i++) {
            total = total + raw[i];
        }

        return total / raw.length;
    }

    //Returns the median of the array:
    public double median() {

        powernum arrLength = new powernum(raw.length);

        if (arrLength.isEven()) {
            double term1 = raw[(int)((arrLength.raw/ 2) - 1)];
            double term2 = raw[(int)(arrLength.raw / 2)];
            return (term1 + term2) / 2;
        }
        else {
            int minusOne = (int)((arrLength.raw - 1) / 2);
            return raw[minusOne];
        }
    }
}
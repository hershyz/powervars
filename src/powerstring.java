public class powerstring {

    public static String raw;

    //Constructor:
    public powerstring(String s) {
        raw = s;
    }

    //Returns a reversed string:
    public String reverse() {

        String[] arr = raw.split("");
        String result = "";
        int i;

        for (i = arr.length - 1; i >= 0; i--) {
            result = result + arr[i];
        }

        return result;
    }

    //Returns the nth split term:
    public String getSplitTerm(String regex, int n) {
        return raw.split(regex)[n];
    }

    //Returns the hash total of the string:
    public int hash() {

        int hashTotal = 0;
        int i;
        for (i = 0; i < raw.length(); i++) {
            char c = raw.charAt(i);
            int cast = c;
            hashTotal = hashTotal + c;
        }

        return hashTotal;
    }

    //Finds the number of times a substring occurs in a string:
    public int occurances(String substring) {

        String temp = raw;
        temp = raw.replace(substring, "");
        int difference = raw.length() - temp.length();
        return difference / substring.length();
    }

    //Checks if the string is a palindrome or not:
    public boolean isPalindrome() {

        if (reverse().equals(raw)) {
            return true;
        }

        return false;
    }

    //Checks if the string is double quoted:
    public boolean isDoubleQuoted() {

        String temp = raw.trim();
        String[] arr = temp.split("");

        if (arr[0].equals("\"") && arr[arr.length - 1].equals("\"")) {
            return true;
        }

        return false;
    }

    //Checks if the string is single quoted:
    public boolean isSingleQuoted() {

        String temp = raw.trim();
        String[] arr = temp.split("");

        if (arr[0].equals("'") && arr[arr.length - 1].equals("'")) {
            return true;
        }

        return false;
    }

    //Strips the quotes from the string:
    public String stripQuotes() {

        String temp = raw.replace("\"", "");
        temp = raw.replace("'", "");
        return temp;
    }
}
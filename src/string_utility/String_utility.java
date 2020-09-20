package string_utility;

public class String_utility {
    String input = "aBc";


    public String reverse(String input) {

        StringBuilder sb = new StringBuilder(input);
        sb.reverse();
        return sb.toString();
    }

    public String capitalize(String input) {

        return input.toUpperCase();
    }

    public String lowercase(String input) {

        return input.toLowerCase();
    }

}

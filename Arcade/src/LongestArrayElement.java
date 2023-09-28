import java.util.ArrayList;

public class LongestArrayElement {
    public String[] longestArrayElement(String[] inputArray) {

        ArrayList<String> newArray = new ArrayList<String>();

        int largestElement = 0;

        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i].length() >= largestElement) {
                largestElement = inputArray[i].length();
            }
        }
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i].length() == largestElement) {
                newArray.add(inputArray[i]);
            }
        }

        String[] outputArray = newArray.toArray(new String[0]);

        return outputArray;

    }
}

package homework;

public class Task3FuzzySearch {
    public static boolean fuzzySearch(String target, String original) {
        if (target == null || original == null) {
            return false;
        }
        int targetLength = target.length();
        int origLength = original.length();

        if (targetLength > origLength || targetLength == 0) {
            return false;
        }

        char[] targetArr = target.toCharArray();
        char[] origArr = original.toCharArray();
        int count = 0;

        for (int i = 0; i < origLength; i++) {
            if (count == targetLength) {
                break;
            }
            if (targetArr[count] == origArr[i]) {
                count++;
            }
        }
        return count == targetLength;
    }
}

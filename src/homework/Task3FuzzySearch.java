package homework;

public class Task3FuzzySearch {
    public static boolean fuzzySearch(String target, String original) {
        if (target.length() > original.length()) {
            return false;
        }
        char[] targetArr = target.toCharArray();
        char[] origArr = original.toCharArray();
        int count = 0;

        for (int i = 0; i < original.length(); i++) {
            if (count == target.length()) {
                break;
            }
            if (targetArr[count] == origArr[i]) {
                count++;
            }
        }
        return count == target.length();
    }

    public static void main(String[] args) {
        System.out.println(fuzzySearch("car", "ca6$$#_rtwheel") + " expected true");
        System.out.println(fuzzySearch("cwhl", "cartwheel") + " expected true");
        System.out.println(fuzzySearch("cwhee", "cartwheel") + " expected true");
        System.out.println(fuzzySearch("cartwheel", "cartwheel") + " expected true");
        System.out.println(fuzzySearch("cwheeel", "cartwheel") + " expected false");
        System.out.println(fuzzySearch("lw", "cartwheel") + " expected false");
        System.out.println(fuzzySearch("dsag", "123*#dtuysbnm###g/..[a") + " expected false");
    }
}

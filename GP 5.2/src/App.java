/*
Jessica Willis
4/3/2026
5.2
*/

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Jessica Willis - 5.2");
        System.out.println("Iterative countdown from 10:");
        iterativeCountdown(10);
        System.out.println("\n\nRecursive Countrdown from 10:");
        recursiveCountdown(10);
        System.out.println("\n\nIterative Name reverse:");
        System.out.println(iterativeNameReverse("Jessica"));
        System.out.println("\nRecursive name reverse:");
        System.out.println(recursiveNameReverse("Jessica"));
    }

    private static void iterativeCountdown(int startNum) {
        for (int i = startNum; i > 0; i--) {
            System.out.print(i + ", ");
        }

        System.out.print("Blastoff!");
    }

    private static void recursiveCountdown(int startNum) {
        if (startNum == 0) {
            System.out.print("Blastoff!");
        } else {
            System.out.print(startNum + ", ");
            recursiveCountdown( startNum - 1);
        }
    }

    private static String iterativeNameReverse(String name) {
        StringBuilder reverseName = new StringBuilder();
        char[] strChars = name.toCharArray();
        for (int i = name.length() -1; i>= 0; i--) {
            reverseName.append(strChars[i]);
        }
        return reverseName.toString();
    }

    private static String recursiveNameReverse(String name) {
        if(name.length() == 0) {
            return "";
        } else {
            return recursiveNameReverse(name.substring(1)) +name.charAt(0);
        }
    }
}

package textserach;

import java.util.Scanner;

public class PatternSearcher {
    public static void main(String[] args) {
        System.out.println("Starting PatternSearcher...");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter expression:");
        String pattern = scanner.nextLine();

        FileSearcher fileSearcher = new FileSearcher(pattern);
        fileSearcher.searchInFiles();
    }
}

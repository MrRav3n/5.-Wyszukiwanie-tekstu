package textserach;

public class WildcardMatcher {
    public static boolean matches(String text, String pattern) {
        String regex = ".*" + pattern.replace("?", ".").replace("*", ".*") + ".*";
        System.out.println("Pattern: " + pattern + " converted to regex: " + regex);
        boolean match = text.matches(regex);
        System.out.println("Matching text: \"" + text + "\" with pattern: \"" + pattern + "\" - " + (match ? "Matched" : "Not Matched"));
        return match;
    }
}
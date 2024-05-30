package textserach;

import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FileSearcher {

    private String pattern;

    public FileSearcher(String pattern) {
        this.pattern = pattern;
        System.out.println("FileSearcher created with pattern: " + pattern);
    }

    public void searchInFiles() {
        try {
            List<Path> txtFiles = Files.list(Paths.get("."))
                    .filter(Files::isRegularFile)
                    .filter(path -> path.toString().endsWith(".txt"))
                    .collect(Collectors.toList());

            System.out.println("Found " + txtFiles.size() + " .txt files in the directory.");
            for (Path file : txtFiles) {
                System.out.println("Searching in file: " + file.getFileName());
                searchFile(file);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void searchFile(Path path) {
        try {
            List<String> lines = Files.readAllLines(path);
            List<String> messages = new ArrayList<>();
            for (int i = 0; i < lines.size(); i++) {
                if (WildcardMatcher.matches(lines.get(i), pattern)) {
                    messages.add(String.format("File: %s, Line: %d, Content: %s%n", path.getFileName(), i + 1, lines.get(i)));
                }
            }
            for (String message : messages) {
                System.out.println(message);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

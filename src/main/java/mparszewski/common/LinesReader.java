package mparszewski.common;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import static java.util.Optional.ofNullable;

public class LinesReader {

    private static LinesReader instance;

    public static synchronized LinesReader getInstance() {
        return ofNullable(instance).orElse(new LinesReader());
    }

    private LinesReader() {
    }

    public List<String> getLines(Path path) {
        try {
            return Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
}

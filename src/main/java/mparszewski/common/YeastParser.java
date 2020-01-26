package mparszewski.common;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static java.lang.Float.*;
import static java.util.stream.Collectors.toList;

public class YeastParser {

    private static final String DELIMITER = "  ";
    private final Path path;

    public YeastParser(String filePath) {
        path = this.createPathFromString(filePath);
    }


    public List<Yeast> getAllYeasts() {
        return LinesReader.getInstance().getLines(this.path).stream()
                .map(this::mapToYeast)
                .collect(toList());
    }

    private Yeast mapToYeast(String line) {
        Yeast yeast = new Yeast();
        line = line.replace("   ", DELIMITER);
        line = line.replace("    ", DELIMITER);
        String[] stringParameters = line.split(DELIMITER);
        for (int i = 0; i < stringParameters.length; i++) {
            switch (i) {
                case 0:
                    yeast.setSequenceName(stringParameters[i]);
                    continue;
                case 1:
                    yeast.setMcg(parseFloat(stringParameters[i]));
                    continue;
                case 2:
                    yeast.setGvh(parseFloat(stringParameters[i]));
                    continue;
                case 3:
                    yeast.setAlm(parseFloat(stringParameters[i]));
                    continue;
                case 4:
                    yeast.setMit(parseFloat(stringParameters[i]));
                    continue;
                case 5:
                    yeast.setErl(parseFloat(stringParameters[i]));
                    continue;
                case 6:
                    yeast.setPox(parseFloat(stringParameters[i]));
                    continue;
                case 7:
                    yeast.setVac(parseFloat(stringParameters[i]));
                    continue;
                case 8:
                    yeast.setNuc(parseFloat(stringParameters[i]));
                    continue;
                case 9:
                    yeast.setClassDistribution(stringParameters[i]);
            }
        }
        return yeast;
    }

    private Path createPathFromString(String path) {
        return Paths.get(path);
    }


}

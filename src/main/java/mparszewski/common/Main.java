package mparszewski.common;

public class Main {

    public static void main(String[] args) {
        testParser();
    }

    private static void testParser() {
        YeastParser yeastParser = new YeastParser("D:\\IdeaProjects\\PSZT\\yeast\\data\\yeast.data");
        yeastParser.getAllYeasts().stream().limit(100).forEach(System.out::println);
        System.out.println("...and over 1700 more");
    }
}

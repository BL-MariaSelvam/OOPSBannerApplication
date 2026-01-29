import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    public static void main(String[] args) {

        Map<Character, CharacterPattern> patternMap = createPatternMap();
        renderBanner("OOPS", patternMap);
    }

    // Creates and returns character patterns
    private static Map<Character, CharacterPattern> createPatternMap() {

        Map<Character, CharacterPattern> map = new HashMap<>();

        map.put('O', new CharacterPattern(new String[]{
                " *****  ",
                "*     * ",
                "*     * ",
                "*     * ",
                "*     * ",
                "*     * ",
                " *****  "
        }));

        map.put('P', new CharacterPattern(new String[]{
                " *****  ",
                "*     * ",
                "*     * ",
                " *****  ",
                "*        ",
                "*        ",
                "*        "
        }));

        map.put('S', new CharacterPattern(new String[]{
                " *****  ",
                "*        ",
                "*        ",
                " *****  ",
                "       *",
                "       *",
                " *****  "
        }));

        return map;
    }

    // Renders banner for given text
    private static void renderBanner(String text,
                                     Map<Character, CharacterPattern> map) {

        int height = map.values().iterator().next().getHeight();

        for (int row = 0; row < height; row++) {
            for (char ch : text.toCharArray()) {
                CharacterPattern pattern = map.get(ch);
                System.out.print(pattern.getRow(row) + " ");
            }
            System.out.println();
        }
    }
}

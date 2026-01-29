public class OOPSBannerApp{
   public static void main(String[] args) {

        CharacterPattern[] banner = getOOPSBanner();
        printBanner(banner);
    }

    private static CharacterPattern[] getOOPSBanner() {

        return new CharacterPattern[]{
                new CharacterPattern(new String[]{
                        " *****  ",
                        "*     * ",
                        "*     * ",
                        "*     * ",
                        "*     * ",
                        "*     * ",
                        " *****  "
                }),
                new CharacterPattern(new String[]{
                        " *****  ",
                        "*     * ",
                        "*     * ",
                        "*     * ",
                        "*     * ",
                        "*     * ",
                        " *****  "
                }),
                new CharacterPattern(new String[]{
                        " *****  ",
                        "*     * ",
                        "*     * ",
                        " *****  ",
                        "*        ",
                        "*        ",
                        "*        "
                }),
                new CharacterPattern(new String[]{
                        " *****  ",
                        "*        ",
                        "*        ",
                        " *****  ",
                        "       *",
                        "       *",
                        " *****  "
                })
        };
    }

    private static void printBanner(CharacterPattern[] patterns) {

        int height = patterns[0].getHeight();

        for (int row = 0; row < height; row++) {
            for (CharacterPattern pattern : patterns) {
                System.out.print(pattern.getRow(row) + " ");
            }
            System.out.println();
        }
    }
}
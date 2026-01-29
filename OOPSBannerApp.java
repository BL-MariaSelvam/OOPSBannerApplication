public class OOPSBannerApp{
    public static void main(String[] args) {
        String[][] banner = getOOPSBanner();
        printBanner(banner);
    }

    // Returns banner data
    private static String[][] getOOPSBanner() {
        return new String[][]{
                {   // O
                        " *****  ",
                        "*     * ",
                        "*     * ",
                        "*     * ",
                        "*     * ",
                        "*     * ",
                        " *****  "
                },
                {   // O
                        " *****  ",
                        "*     * ",
                        "*     * ",
                        "*     * ",
                        "*     * ",
                        "*     * ",
                        " *****  "
                },
                {   // P
                        " *****  ",
                        "*     * ",
                        "*     * ",
                        " *****  ",
                        "*        ",
                        "*        ",
                        "*        "
                },
                {   // S
                        " *****  ",
                        "*        ",
                        "*        ",
                        " *****  ",
                        "       *",
                        "       *",
                        " *****  "
                }
        };
    }

    // Prints the banner
    private static void printBanner(String[][] letters) {
        for (int row = 0; row < 7; row++) {
            for (String[] letter : letters) {
                System.out.print(letter[row] + " ");
            }
            System.out.println();
        }
    }
}
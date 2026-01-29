public class OOPSBannerApp{
    public static void main(String[] args) {
         String[][] letters = {
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

        for (int row = 0; row < 7; row++) {
            for (String[] letter : letters) {
                System.out.print(letter[row] + " ");
            }
            System.out.println();
        }
    }
}
class CharacterPattern {

    private String[] rows;

    public CharacterPattern(String[] rows) {
        this.rows = rows;
    }

    public String getRow(int index) {
        return rows[index];
    }

    public int getHeight() {
        return rows.length;
    }
}

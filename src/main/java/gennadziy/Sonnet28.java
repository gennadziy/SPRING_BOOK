package gennadziy;

public class Sonnet28 implements Poem {
    private static String[] LINES = {
            "11111",
        "sadasdasd",
        "ccasdcfasd"};

    public Sonnet28() {
    }
    public void recite() {
        for (int i = 0; i < LINES.length; i++) {
            System.out.println ( LINES[i] );
        }
    }
}
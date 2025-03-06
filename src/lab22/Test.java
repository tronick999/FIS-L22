package lab22;

public class Test {
    private int rng;

   
    public Test() {
        rng = (int)(Math.random() * Integer.MAX_VALUE);
    }

    public int getRng(int x) {
        return rng % x;
    }
}


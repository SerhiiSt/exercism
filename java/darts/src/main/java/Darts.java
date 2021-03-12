class Darts {

    private final double x;
    private final double y;

    Darts(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    int score() {
        double dist = Math.sqrt(Math.pow(getX(), 2) + Math.pow(getY(), 2));
        if (dist <= 1.0) return 10;
        if (dist <= 5.0) return 5;
        if (dist <= 10.0) return 1;

        return 0;

    }

}

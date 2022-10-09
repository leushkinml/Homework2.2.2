public enum BusCapacity {
    EXTRA_SMALL(1, 10),
    SMALL(11, 25),
    MEDIUM(26, 50),
    LARGE(51, 80),
    EXTRA_LARGE(81, 120);

    private final int from;
    private final int to;

    BusCapacity(int from, int to) {
        this.from = from;
        this.to = to;
    }

    public int getFrom() {
        return from;
    }

    public int getTo() {
        return to;
    }
}

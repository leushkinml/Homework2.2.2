public enum TruckСarrying {
    N_1(0.1D, 3.5),
    N_2(3.5, 12D),
    N_3(12D, 20D);

    private final Double from;
    private final Double to;

    TruckСarrying(Double from, Double to) {
       this.from = from;
       this.to = to;
    }

    public Double getFrom() {
        return from;
    }

    public Double getTo() {
        return to;
    }


}

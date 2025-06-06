public enum ShipType {
    X_WING("XW", 180_000), A_WING("AW", 190_000), Y_WING("YW", 160_000), MILLENNIUM_FALCON("MF", 1_200_000);

    private final String shipIdPrefix;
    private final int shipTypePrice;

    private ShipType(String shipIdPrefix, int shipTypePrice) {
        this.shipIdPrefix = shipIdPrefix;
        this.shipTypePrice = shipTypePrice;
    }


    public String getShipIdPrefix() {
        return shipIdPrefix;
    }

    public int getShipTypePrice() {
        return shipTypePrice;
    }
}
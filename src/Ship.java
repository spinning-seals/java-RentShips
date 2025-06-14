public class Ship
{
    private String id;
    private ShipType type;
    private String pilot;
    private int price;
    private ShipStatus status;


    public Ship(String id, ShipType type, String pilot, int price, ShipStatus status)
    {
        this.id = id;
        this.type = type;
        this.pilot = pilot;
        this.price = price;
        this.status = status;
    }


    @Override
    public String toString()
    {
        return "SHIP ID: " + id +
                "\nSHIP TYPE: " + type +
                "\nPILOT NAME: " + pilot +
                "\nPRICE: " + price + " credits" +
                "\nSTATUS: " + status +
                "\n";
    }

    public String getId() {
        return id;
    }

    public ShipType getType() {
        return type;
    }

    public String getPilot() {
        return pilot;
    }

    public int getPrice() {
        return price;
    }

    public ShipStatus getStatus() {
        return status;
    }

    public void setPilot(String pilot)
    {
        this.pilot = pilot;
    }

    public void setStatus(ShipStatus status)
    {
        this.status = status;
    }
}



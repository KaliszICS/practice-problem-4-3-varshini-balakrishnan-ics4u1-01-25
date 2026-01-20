class Chair {
    private int legs;
    private String material;
    public Rectangle() {
        this.legs = 4;
        this.material = wood;
    }
    public Rectangle(int legs) {
        this.legs = legs;
        this.material = wood;
    }
    public Rectangle(int legs, String material) {
        this.legs = legs;
        this.material = material;
    }
    public int getLegs() {
        return this.legs;
    }
    public String getMaterial() {
        return this.material;
    }
}
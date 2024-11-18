class GarmentSimulator {
    private final Top top;
    private final Pant pant;
    private final Shoe shoe;

    public GarmentSimulator(GarmentFactory factory) {
        this.top = factory.createTop();
        this.pant = factory.createPant();
        this.shoe = factory.createShoe();
    }

    public void displayGarments() {
        System.out.println("Garments Set:");
        System.out.println("- " + top.getDescription());
        System.out.println("- " + pant.getDescription());
        System.out.println("- " + shoe.getDescription());
    }
}
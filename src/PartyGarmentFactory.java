class PartyGarmentFactory implements GarmentFactory {
    public Top createTop() {
        return new PartyTop();
    }
    public Pant createPant() {
        return new PartyPant();
    }
    public Shoe createShoe() {
        return new PartyShoe();
    }
}
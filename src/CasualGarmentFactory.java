
class CasualGarmentFactory implements GarmentFactory {
    public Top createTop() {
        return new CasualTop();
    }
    public Pant createPant() {
        return new CasualPant();
    }
    public Shoe createShoe() {
        return new CasualShoe();
    }
}
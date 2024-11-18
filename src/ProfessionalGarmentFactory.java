class ProfessionalGarmentFactory implements GarmentFactory {
    public Top createTop() {
        return new ProfessionalTop();
    }
    public Pant createPant() {
        return new ProfessionalPant();
    }
    public Shoe createShoe() {
        return new ProfessionalShoe();
    }
}
public class Driver {
    public static void main(String[] args) {
        System.out.println("Testing Professional Garments:");
        GarmentFactory professionalFactory = new ProfessionalGarmentFactory();
        Top professionalTop = professionalFactory.createTop();
        Pant professionalPant = professionalFactory.createPant();
        Shoe professionalShoe = professionalFactory.createShoe();
        System.out.println("- " + professionalTop.getDescription());
        System.out.println("- " + professionalPant.getDescription());
        System.out.println("- " + professionalShoe.getDescription());

        System.out.println("\nTesting Casual Garments:");
        GarmentFactory casualFactory = new CasualGarmentFactory();
        Top casualTop = casualFactory.createTop();
        Pant casualPant = casualFactory.createPant();
        Shoe casualShoe = casualFactory.createShoe();
        System.out.println("- " + casualTop.getDescription());
        System.out.println("- " + casualPant.getDescription());
        System.out.println("- " + casualShoe.getDescription());

        System.out.println("\nTesting Party Garments:");
        GarmentFactory partyFactory = new PartyGarmentFactory();
        Top partyTop = partyFactory.createTop();
        Pant partyPant = partyFactory.createPant();
        Shoe partyShoe = partyFactory.createShoe();
        System.out.println("- " + partyTop.getDescription());
        System.out.println("- " + partyPant.getDescription());
        System.out.println("- " + partyShoe.getDescription());
    }
}
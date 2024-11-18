public class Main {
    public static void main(String[] args) {
        System.out.println("Professional Garments:");
        GarmentSimulator professionalSimulator = new GarmentSimulator(new ProfessionalGarmentFactory());
        professionalSimulator.displayGarments();

        System.out.println("\nCasual Garments:");
        GarmentSimulator casualSimulator = new GarmentSimulator(new CasualGarmentFactory());
        casualSimulator.displayGarments();

        System.out.println("\nParty Garments:");
        GarmentSimulator partySimulator = new GarmentSimulator(new PartyGarmentFactory());
        partySimulator.displayGarments();
    }
}
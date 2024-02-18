import java.util.Scanner;

class PartyAffiliationChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display menu and prompt user for input
        System.out.println("Party Affiliation Menu:");
        System.out.println("D - Democrat");
        System.out.println("R - Republican");
        System.out.println("I - Independent");
        System.out.print("Enter your party affiliation (D/R/I): ");
        String affiliation = scanner.next().toUpperCase(); // Convert input to uppercase

        // Determine response based on user input using cascaded if structure
        switch (affiliation) {
            case "D" -> System.out.println("You get a Democratic Donkey.");
            case "R" -> System.out.println("You get a Republican Elephant.");
            case "I" -> System.out.println("You get an Independent Person.");
            default -> System.out.println("You get an Other.");
        }

        scanner.close();
    }
}

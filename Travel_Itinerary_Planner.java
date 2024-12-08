import java.util.ArrayList;
import java.util.Scanner;

class Destination {
    private String name;
    private String date;
    private String preferences;

    public Destination(String name, String date, String preferences) {
        this.name = name;
        this.date = date;
        this.preferences = preferences;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getPreferences() {
        return preferences;
    }
}

class TravelItineraryPlanner {
    private ArrayList<Destination> destinations;

    public TravelItineraryPlanner() {
        destinations = new ArrayList<>();
    }

    public void addDestination(String name, String date, String preferences) {
        Destination destination = new Destination(name, date, preferences);
        destinations.add(destination);
    }

    public void generateItinerary() {
        System.out.println("Travel Itinerary:");
        for (Destination destination : destinations) {
            System.out.println("Destination: " + destination.getName());
            System.out.println("Date: " + destination.getDate());
            System.out.println("Preferences: " + destination.getPreferences());
            System.out.println("---");
        }
    }

    public void getWeatherInformation(String destinationName) {
        System.out.println("Weather information for " + destinationName + " is not available.");
    }

    public void calculateBudget(String destinationName) {
        System.out.println("Budget calculation for " + destinationName + " is not available.");
    }
}

public class Travel_Itinerary_Planner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TravelItineraryPlanner planner = new TravelItineraryPlanner();

        while (true) {
            System.out.println("1. Add Destination");
            System.out.println("2. Generate Itinerary");
            System.out.println("3. Get Weather Information");
            System.out.println("4. Calculate Budget");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter destination name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter date: ");
                    String date = scanner.nextLine();
                    System.out.print("Enter preferences: ");
                    String preferences = scanner.nextLine();
                    planner.addDestination(name, date, preferences);
                    break;
                case 2:
                    planner.generateItinerary();
                    break;
                case 3:
                    System.out.print("Enter destination name for weather information: ");
                    String weatherDestination = scanner.nextLine();
                    planner.getWeatherInformation(weatherDestination);
                    break;
                case 4:
                    System.out.print("Enter destination name for budget calculation: ");
                    String budgetDestination = scanner.nextLine();
                    planner.calculateBudget(budgetDestination);
                    break;
                case 5:
                    System.out.println("Exiting the program. Thank you!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

/*
Jessica Willis
3/6/2026
1.6
*/

public class App {
    public static void main(String[] args) {
        System.out.println("Jessica Willis - In-Class Assignment 1: Mandatory Composition");

        // Create two SmartSpeaker instances
        SmartSpeaker sonos = new SmartSpeaker("Sonos", 15.0, "Alexa", 50, 6.0, 4.0, 4.0);
        SmartSpeaker homePod = new SmartSpeaker("Apple HomePod", 20.0, "Siri", 30, 6.5, 5.0, 5.0);

        // Print both instances
        System.out.println(sonos.toString());
        System.out.println(homePod.toString());

        // Update test
        sonos.setVolume(75);
        homePod.setAssistantName("Jarvis");

        // Reprint to verify updates
        System.out.println("\nAfter Updates:");
        System.out.println(sonos.toString());
        System.out.println(homePod.toString());
    }
}

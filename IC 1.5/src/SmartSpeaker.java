/**
 * Name: Jessica Willis
 * Date: 3/6/2026
 * Assignment: In-Class Assignment 1: Mandatory Composition
 * Description: Represents a smart speaker with assistant name, volume, and physical size.
 */
public class SmartSpeaker extends ElectronicDevice {
    private String assistantName;
    private int volume;
    private Dimensions physicalSize;

    // Constructor using setters
    public SmartSpeaker(String brand, double powerUsage, String assistantName, int volume,
                        double height, double width, double depth) {
        super(brand, powerUsage, true);  // Defaulting isOn to true
        setAssistantName(assistantName);
        setVolume(volume);
        setPhysicalSize(new Dimensions(height, width, depth)); // Composition
    }

    // Getters and Setters
    public String getAssistantName() { return assistantName; }
    public void setAssistantName(String assistantName) { this.assistantName = assistantName; }

    public int getVolume() { return volume; }
    public void setVolume(int volume) { this.volume = volume; }

    public Dimensions getPhysicalSize() { return physicalSize; }
    public void setPhysicalSize(Dimensions physicalSize) { this.physicalSize = physicalSize; }

    // toString override
    @Override
    public String toString() {
        return super.toString() + ", SmartSpeaker [AssistantName=" + getAssistantName() +
               ", Volume=" + getVolume() + ", PhysicalSize=" + getPhysicalSize() + "]";
    }
}

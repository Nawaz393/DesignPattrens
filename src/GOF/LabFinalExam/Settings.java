package GOF.LabFinalExam;

public class Settings {
    private static Settings instance;
    private String settingsData;

    private Settings() {
    }

    public static synchronized Settings getInstance() {
        if (instance == null) {
            instance = new Settings();
        }
        return instance;
    }

    public void loadConfiguration() {
        System.out.println("Config loaded for system");
    }

    public void updateSettings(String setting, String value) {
        this.settingsData=setting;
        // Update settings logic
        System.out.println("Updating " + settingsData + " to " + value);
    }
}

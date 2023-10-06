package GOF.Lab2.Singleton;

public class test {


    public static void main(String[] args) {
        Setting setting =Setting.getInstance();
        setting.setTextColor("white");
        setting.setTheme("dark");
        setting.setFontFamily("consolas");
        setting.setLayout("Grid");
        setting.showConfig();
        Setting setting1=Setting.getInstance();
        setting1.setTextColor("golden");
        setting1.setFontFamily("time new roman");
        setting.showConfig();

    }
}

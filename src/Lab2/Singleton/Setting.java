package Lab2.Singleton;


public class Setting {



    private  String theme="blue";
    private  String fontFamily="arial";
    private  String layout="list";
    private String textColor="black";


    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getFontFamily() {
        return fontFamily;
    }

    public void setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
    }

    public String getLayout() {
        return layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }

    public String getTextColor() {
        return textColor;
    }

    public void setTextColor(String textColor) {
        this.textColor = textColor;
    }




    private Setting(){}

    private static  Setting instance=new Setting();



    public static Setting getInstance(){
        return instance ;
    }


    public void showConfig(){

        System.out.println("theme is: "+theme+" fontFamily is: "+fontFamily+" text Color is: "+textColor+" layout is: "+layout  );
    }
}

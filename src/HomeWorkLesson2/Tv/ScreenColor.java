package HomeWorkLesson2.Tv;

public enum ScreenColor {
  BLACKWHITE("Black and white"),
    COLOR("Color");


    String screen_color;

    ScreenColor (String screen_color){
        this.screen_color = screen_color;

    }


    public String getScreen_color() {
        return screen_color;
    }
}

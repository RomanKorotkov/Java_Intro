package lesson01.Metallica;

public enum PlayStyle {
    FINGER("fingers"),
    MEDIATOR("mediator"),
    HANDS("hands");

   public String style;

    PlayStyle(String style){
        this.style = style;

    }

    public String getStyle() {
        return style;
    }
}

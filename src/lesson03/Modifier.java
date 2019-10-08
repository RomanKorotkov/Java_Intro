package lesson03;

public enum Modifier {
    PUBLIC(25),
    DEFAULT(35),
    PROTECTED(45),
    PRIVATE(55);

   private final int modifierCode;

    Modifier(int modifierCode) {
        this.modifierCode = modifierCode;
    }

    public int getModifierCode() {
        return modifierCode;
    }
}

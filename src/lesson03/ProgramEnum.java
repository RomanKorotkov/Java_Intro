package lesson03;

public class ProgramEnum {
    public static void main(String[] args){
        for (Modifier modifier: Modifier.values()){
            System.out.printf("Modifier #%d: %s%n",  modifier.ordinal(), modifier);
        }
        System.out.println(Modifier.PROTECTED);
        printModifierCode(Modifier.PROTECTED);
    }
    private static void printModifierCode(Modifier modifier){
        System.out.printf("Modifier '%s' has code: %d%n", modifier, modifier.getModifierCode());

    }
}

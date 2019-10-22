package lesson03.T;

public class BoxPrinter<T> {
    private T val;

    public BoxPrinter(T val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "BoxPrinter{" +
                "val=" + val +
                '}';
    }

    public T getVal() {
        return val;
    }

    public BoxPrinter<T> setVal(T val) {
        this.val = val;
        return this;
    }

    public static <K> K getMiddle(K... args) {
        return args[args.length / 2];
    }

    public static void main(String[] args) {
        BoxPrinter<Integer> boxPrinter1 = new BoxPrinter<>(50);
        BoxPrinter<String> boxPrinter2 = new BoxPrinter<>("Hello World!");

        System.out.println(boxPrinter1);
        System.out.println("value = " + boxPrinter1.getVal());

        System.out.println(boxPrinter2);
        System.out.println("value2 = " + boxPrinter2.getVal());

        String mid1 = getMiddle("Hello", "World", "!");
        int mid2 = getMiddle(5, 6, 7);
        System.out.println("mid1 = " + mid1);
        System.out.println("mid2 = " + mid2);
    }
}


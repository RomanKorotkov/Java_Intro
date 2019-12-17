package lesson03.Lambdas;
@FunctionalInterface
public interface Expression<T> {
    boolean isEqual(T t);
}

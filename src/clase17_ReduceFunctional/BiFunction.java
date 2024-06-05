package clase17_ReduceFunctional;

@FunctionalInterface
public interface BiFunction<T, U, R> {
    
    R apply(T t, U u);
}

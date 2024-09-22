import java.util.List;

public interface Calculation<T> {
    T calc(List<T> arrayItems);
}

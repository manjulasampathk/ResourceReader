package sl.uzabase.input.processors;

public interface ItemProcessor<T> {

    T process(T item);
}

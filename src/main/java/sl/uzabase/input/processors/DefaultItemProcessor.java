package sl.uzabase.input.processors;

public class DefaultItemProcessor implements ItemProcessor<String> {
    @Override
    public String process(String item) {
        return item;
    }
}

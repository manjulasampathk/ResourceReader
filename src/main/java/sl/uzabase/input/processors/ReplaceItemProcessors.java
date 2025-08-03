package sl.uzabase.input.processors;

public class ReplaceItemProcessors implements ItemProcessor<String> {


    private final String from;

    private final String to;

    public ReplaceItemProcessors(String from, String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public String process(String item) {
        return item.replaceAll(from, to);
    }
}

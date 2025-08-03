package sl.uzabase.input.processors;

public class TrimItemProcessor implements ItemProcessor<String> {

    private int maxLength = 10;

    public TrimItemProcessor(int maxLength) {
        if (maxLength > 0) {
            this.maxLength = maxLength;
        }
    }

    @Override
    public String process(String item) {
        return item.substring(0, maxLength);

    }
}

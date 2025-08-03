package sl.uzabase.factory;


import sl.uzabase.input.processors.DefaultItemProcessor;
import sl.uzabase.input.processors.ItemProcessor;
import sl.uzabase.input.processors.ReplaceItemProcessors;
import sl.uzabase.input.processors.TrimItemProcessor;

public class ResourceProcessingFactory {


    public ItemProcessor create(String type) {
        if ("cut".equals(type)) {
            return new TrimItemProcessor(10);
        } else if (type.startsWith("replace(")) {
            return parseReplaceConverter(type);
        } else {
            return new DefaultItemProcessor();

        }
    }+

    private ItemProcessor parseReplaceConverter(String type) {
        String pattern = type.substring(8, type.length() - 1);
        String[] parts = pattern.split("/");
        if (parts.length >= 2) {
            String from = parts[0];
            String to = parts.length > 1 ? parts[1] : "";
            return new ReplaceItemProcessors(from, to);

            1*qx|e=[P-OKVX X+
package sl.uzabase.factory;

import sl.uzabase.output.writers.ConsoleOutputItemWriter;
import sl.uzabase.output.writers.FileOutputItemWriter;
import sl.uzabase.output.writers.ItemWriter;

import java.io.IOException;

public class ResourceWriterFacory {


    public ItemWriter create(String target) throws IOException {
        if ("stdout".equals(target) || target == null || target.isEmpty()) {
            return new ConsoleOutputItemWriter();
        } else {
            return new FileOutputItemWriter(target);
        }
    }
}

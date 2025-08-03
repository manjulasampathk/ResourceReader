package sl.uzabase.output.writers;

import java.io.IOException;
import java.util.List;

public class ConsoleOutputItemWriter implements ItemWriter<String> {
    @Override
    public void write(List<String> items) throws IOException {

        for (String item : items) {
            System.out.println(item);
        }

    }
}

package sl.uzabase.output.writers;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class FileOutputItemWriter implements ItemWriter<String> {

    private final String outputFilePath;

    public FileOutputItemWriter(String outputFilePath) {
        this.outputFilePath = outputFilePath;
    }

    @Override
    public void write(List<String> items) throws IOException {

        try (PrintWriter writer = new PrintWriter(new FileWriter(outputFilePath))) {
            for (String item : items) {
                writer.println(item);
            }
        }

    }
}

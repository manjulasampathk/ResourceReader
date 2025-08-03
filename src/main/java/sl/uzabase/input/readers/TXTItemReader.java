package sl.uzabase.input.readers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TXTItemReader implements ItemReader<String> {

    private final String resourcePath;

    public TXTItemReader(String resource) {
        resourcePath = resource;
    }


    @Override
    public String read() throws IOException {
        StringBuilder content = null;
        try (BufferedReader reader = new BufferedReader(new FileReader(resourcePath))) {
            content = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        }
        return content.toString();
    }
}

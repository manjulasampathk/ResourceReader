package sl.uzabase.input.readers;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVItemReader implements ItemReader<String> {

    private final String resourcePath;

    public CSVItemReader(String resource) {
        resourcePath = resource;
    }


    public String read() throws IOException {
        StringBuilder stringBuilder = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader(resourcePath))) {
            String line;

            while ((line = br.readLine()) != null) {
                stringBuilder.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }
}

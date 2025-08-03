package sl.uzabase;

import sl.uzabase.util.CommandLineParser;
import sl.uzabase.util.ProcessingConfig;

import java.io.IOException;

public class ResourceReaderMain {

    public static void main(String[] args) throws IOException {

        try {
            System.out.println("Welcome to the Resource Reader App.");

            System.out.println("PROCESSING...");
            CommandLineParser parser = new CommandLineParser();
            ProcessingConfig config = parser.parse(args);

            ResourceProcessingManager processingManager = new ResourceProcessingManager();
            processingManager.process(config);


            System.out.println("Processing is complete.");
        } catch (Exception e) {
            e.printStackTrace();

            System.out.println("Incorrect configuration has been provided");

            System.out.println("********************** Options *********************:");
            System.out.println("  -i <source>     Input source (URL or file path)");
            System.out.println("  -c <types>    Conversion types (cut, replace(/from/to/))");
            System.out.println("  -o <target>    Output target (file path or stdout)");
            System.out.println("Examples:");
            System.out.println("  java ResourceReaderMain -i https://tech.uzabase.com/rss -c cut -o src/main/resources/output/result.txt");
            System.out.println("  java ResourceReaderMain -i  src/main/resources/input/articles.csv -c cut,replace(/abc/def/) -o stdout");
        }

    }


}

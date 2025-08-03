package sl.uzabase.factory;

import sl.uzabase.input.readers.CSVItemReader;
import sl.uzabase.input.readers.ItemReader;
import sl.uzabase.input.readers.RSSItemReader;
import sl.uzabase.input.readers.TXTItemReader;

import java.io.IOException;

public class ResourceReaderFactory {


    public ItemReader create(String source) throws IOException {
        if (source.startsWith("http://") || source.startsWith("https://")) {
            return new RSSItemReader(source);
        } else if (source.endsWith(".csv")) {
            return new CSVItemReader(source);
        } else {
            return new TXTItemReader(source);
        }
    }

}

package sl.uzabase.input.readers;


import com.rometools.rome.feed.synd.SyndFeed;
import com.rometools.rome.io.SyndFeedInput;
import com.rometools.rome.io.XmlReader;

import java.io.IOException;
import java.net.URL;

public class RSSItemReader implements ItemReader<String> {

    private final String resourcePath;

    public RSSItemReader(String resource) {
        resourcePath = resource;
    }

    public String read() throws IOException {
        try {
            URL feedSource = new URL(resourcePath);

            SyndFeedInput input = new SyndFeedInput();
            SyndFeed feed = input.build(new XmlReader(feedSource));

            return feed.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
}

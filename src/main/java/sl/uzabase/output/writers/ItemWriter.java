package sl.uzabase.output.writers;

import java.io.IOException;
import java.util.List;

public interface ItemWriter<T> {

    void write(List<T> items) throws IOException;
}

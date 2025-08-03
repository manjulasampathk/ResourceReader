package sl.uzabase.input.readers;

import java.io.IOException;

public interface ItemReader<T> {

    T read() throws IOException;
}

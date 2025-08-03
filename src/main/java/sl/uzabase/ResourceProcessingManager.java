package sl.uzabase;

import sl.uzabase.factory.ResourceProcessingFactory;
import sl.uzabase.factory.ResourceReaderFactory;
import sl.uzabase.factory.ResourceWriterFacory;
import sl.uzabase.input.processors.ItemProcessor;
import sl.uzabase.input.readers.ItemReader;
import sl.uzabase.output.writers.ItemWriter;
import sl.uzabase.util.ProcessingConfig;

import java.io.IOException;
import java.util.Collections;

public class ResourceProcessingManager {

    private final ResourceProcessingFactory resourceProcessingFactory;
    private final ResourceReaderFactory resourceReaderFactory;
    private final ResourceWriterFacory resourceWriterFacory;

    public ResourceProcessingManager() {
        this.resourceProcessingFactory = new ResourceProcessingFactory();
        this.resourceReaderFactory = new ResourceReaderFactory();
        this.resourceWriterFacory = new ResourceWriterFacory();
    }


    public void process(ProcessingConfig config) throws IOException {

        ItemReader reader = resourceReaderFactory.create(config.getInputSource());

        String line = (String) reader.read();

        for (String converterType : config.getConverters()) {
            ItemProcessor converter = resourceProcessingFactory.create(converterType);
            line = (String) converter.process(line);
        }

        ItemWriter writer = resourceWriterFacory.create(config.getOutputTarget());

        writer.write(Collections.singletonList(line));
    }
}

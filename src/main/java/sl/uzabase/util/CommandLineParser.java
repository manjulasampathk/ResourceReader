package sl.uzabase.util;

import java.util.Arrays;

public class CommandLineParser {

    public ProcessingConfig parse(String[] args) {
        ProcessingConfig config = new ProcessingConfig();

        for (int i = 0; i < args.length; i++) {
            String arg = args[i];

            if (arg.equals("-i")) {
                if (i + 1 < args.length) {
                    config.setInputSource(args[++i]);
                }
            } else if (arg.equals("-c")) {
                if (i + 1 < args.length) {
                    String converterStr = args[++i];
                    config.setConverters(Arrays.asList(converterStr.split(",")));
                }
            } else if (arg.equals("-o")) {
                if (i + 1 < args.length) {
                    config.setOutputTarget(args[++i]);
                }
            }
        }

        if (config.getInputSource() == null) {
            throw new IllegalArgumentException("Input source is required");
        }

        return config;

    }


}

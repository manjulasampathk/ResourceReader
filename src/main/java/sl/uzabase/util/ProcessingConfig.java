package sl.uzabase.util;

import java.util.ArrayList;
import java.util.List;

public class ProcessingConfig {

    private String inputSource;
    private List<String> converters;
    private String outputTarget;

    //    default output set as stdout
    public ProcessingConfig() {
        this.converters = new ArrayList<>();
        this.outputTarget = "stdout";
    }

    public String getInputSource() {
        return inputSource;
    }

    public void setInputSource(String inputSource) {
        this.inputSource = inputSource;
    }

    public List<String> getConverters() {
        return converters;
    }

    public void setConverters(List<String> converters) {
        this.converters = converters;
    }

    public String getOutputTarget() {
        return outputTarget;
    }

    public void setOutputTarget(String outputTarget) {
        this.outputTarget = outputTarget;
    }
}

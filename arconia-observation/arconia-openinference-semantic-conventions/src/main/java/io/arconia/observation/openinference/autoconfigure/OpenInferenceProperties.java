package io.arconia.observation.openinference.autoconfigure;

import org.jspecify.annotations.Nullable;
import org.springframework.boot.context.properties.ConfigurationProperties;

import io.arconia.observation.openinference.instrumentation.OpenInferenceOptions;

/**
 * Configuration properties for the OpenInference instrumentation.
 */
@ConfigurationProperties(prefix = OpenInferenceProperties.CONFIG_PREFIX)
public class OpenInferenceProperties extends OpenInferenceOptions {

    public static final String CONFIG_PREFIX = "arconia.observations.conventions.openinference";

    /**
     * Name of the project in the OpenInference backend where to send the telemetry data.
     */
    @Nullable
    private String projectName;

    public @Nullable String getProjectName() {
        return projectName;
    }

    public void setProjectName(@Nullable String projectName) {
        this.projectName = projectName;
    }

}

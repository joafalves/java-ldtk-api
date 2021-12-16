package io.github.joafalves.ldtk.model;

import com.fasterxml.jackson.annotation.*;

/**
 * IntGrid value definition
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class IntGridValueDefinition {
    private String color;
    private String identifier;
    private long value;

    @JsonProperty("color")
    public String getColor() { return color; }
    @JsonProperty("color")
    public void setColor(String value) { this.color = value; }

    /**
     * Unique String identifier
     */
    @JsonProperty("identifier")
    public String getIdentifier() { return identifier; }
    @JsonProperty("identifier")
    public void setIdentifier(String value) { this.identifier = value; }

    /**
     * The IntGrid value itself
     */
    @JsonProperty("value")
    public long getValue() { return value; }
    @JsonProperty("value")
    public void setValue(long value) { this.value = value; }
}

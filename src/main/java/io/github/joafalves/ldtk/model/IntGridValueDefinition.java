package io.github.joafalves.ldtk.model;

import com.fasterxml.jackson.annotation.*;

/**
 * IntGrid value definition
 */
@lombok.Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class IntGridValueDefinition {
    @lombok.Getter(onMethod_ = {@JsonProperty("color")})
    @lombok.Setter(onMethod_ = {@JsonProperty("color")})
    private String color;
    @lombok.Getter(onMethod_ = {@JsonProperty("identifier")})
    @lombok.Setter(onMethod_ = {@JsonProperty("identifier")})
    private String identifier;
    @lombok.Getter(onMethod_ = {@JsonProperty("value")})
    @lombok.Setter(onMethod_ = {@JsonProperty("value")})
    private long value;
}

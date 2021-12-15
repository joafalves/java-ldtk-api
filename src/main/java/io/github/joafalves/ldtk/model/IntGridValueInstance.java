package io.github.joafalves.ldtk.model;

import com.fasterxml.jackson.annotation.*;

/**
 * IntGrid value instance
 */
@lombok.Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class IntGridValueInstance {
    @lombok.Getter(onMethod_ = {@JsonProperty("coordId")})
    @lombok.Setter(onMethod_ = {@JsonProperty("coordId")})
    private long coordID;
    @lombok.Getter(onMethod_ = {@JsonProperty("v")})
    @lombok.Setter(onMethod_ = {@JsonProperty("v")})
    private long v;
}

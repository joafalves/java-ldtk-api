package io.github.joafalves.ldtk.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

/**
 * This structure represents a single tile from a given Tileset.
 */
@lombok.Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class TileInstance {
    @lombok.Getter(onMethod_ = {@JsonProperty("d")})
    @lombok.Setter(onMethod_ = {@JsonProperty("d")})
    private List<Long> d;
    @lombok.Getter(onMethod_ = {@JsonProperty("f")})
    @lombok.Setter(onMethod_ = {@JsonProperty("f")})
    private long f;
    @lombok.Getter(onMethod_ = {@JsonProperty("px")})
    @lombok.Setter(onMethod_ = {@JsonProperty("px")})
    private List<Long> px;
    @lombok.Getter(onMethod_ = {@JsonProperty("src")})
    @lombok.Setter(onMethod_ = {@JsonProperty("src")})
    private List<Long> src;
    @lombok.Getter(onMethod_ = {@JsonProperty("t")})
    @lombok.Setter(onMethod_ = {@JsonProperty("t")})
    private long t;
}

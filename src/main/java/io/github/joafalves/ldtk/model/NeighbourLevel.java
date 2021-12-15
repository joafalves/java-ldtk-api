package io.github.joafalves.ldtk.model;

import com.fasterxml.jackson.annotation.*;

/**
 * Nearby level info
 */
@lombok.Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class NeighbourLevel {
    @lombok.Getter(onMethod_ = {@JsonProperty("dir")})
    @lombok.Setter(onMethod_ = {@JsonProperty("dir")})
    private String dir;
    @lombok.Getter(onMethod_ = {@JsonProperty("levelUid")})
    @lombok.Setter(onMethod_ = {@JsonProperty("levelUid")})
    private long levelUid;
}

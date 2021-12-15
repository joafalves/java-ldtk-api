package io.github.joafalves.ldtk.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

/**
 * Tile data in an Entity instance
 */
@lombok.Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class EntityInstanceTile {
    @lombok.Getter(onMethod_ = {@JsonProperty("srcRect")})
    @lombok.Setter(onMethod_ = {@JsonProperty("srcRect")})
    private List<Long> srcRect;
    @lombok.Getter(onMethod_ = {@JsonProperty("tilesetUid")})
    @lombok.Setter(onMethod_ = {@JsonProperty("tilesetUid")})
    private long tilesetUid;
}

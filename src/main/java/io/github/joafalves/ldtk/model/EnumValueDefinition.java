package io.github.joafalves.ldtk.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@lombok.Data
public class EnumValueDefinition {
    @lombok.Getter(onMethod_ = {@JsonProperty("__tileSrcRect")})
    @lombok.Setter(onMethod_ = {@JsonProperty("__tileSrcRect")})
    private List<Long> tileSrcRect;
    @lombok.Getter(onMethod_ = {@JsonProperty("color")})
    @lombok.Setter(onMethod_ = {@JsonProperty("color")})
    private long color;
    @lombok.Getter(onMethod_ = {@JsonProperty("id")})
    @lombok.Setter(onMethod_ = {@JsonProperty("id")})
    private String id;
    @lombok.Getter(onMethod_ = {@JsonProperty("tileId")})
    @lombok.Setter(onMethod_ = {@JsonProperty("tileId")})
    private Long tileID;
}

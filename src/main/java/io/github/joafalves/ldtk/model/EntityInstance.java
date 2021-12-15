package io.github.joafalves.ldtk.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@lombok.Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class EntityInstance {
    @lombok.Getter(onMethod_ = {@JsonProperty("__grid")})
    @lombok.Setter(onMethod_ = {@JsonProperty("__grid")})
    private List<Long> grid;
    @lombok.Getter(onMethod_ = {@JsonProperty("__identifier")})
    @lombok.Setter(onMethod_ = {@JsonProperty("__identifier")})
    private String identifier;
    @lombok.Getter(onMethod_ = {@JsonProperty("__pivot")})
    @lombok.Setter(onMethod_ = {@JsonProperty("__pivot")})
    private List<Double> pivot;
    @lombok.Getter(onMethod_ = {@JsonProperty("__tile")})
    @lombok.Setter(onMethod_ = {@JsonProperty("__tile")})
    private EntityInstanceTile tile;
    @lombok.Getter(onMethod_ = {@JsonProperty("defUid")})
    @lombok.Setter(onMethod_ = {@JsonProperty("defUid")})
    private long defUid;
    @lombok.Getter(onMethod_ = {@JsonProperty("fieldInstances")})
    @lombok.Setter(onMethod_ = {@JsonProperty("fieldInstances")})
    private List<FieldInstance> fieldInstances;
    @lombok.Getter(onMethod_ = {@JsonProperty("height")})
    @lombok.Setter(onMethod_ = {@JsonProperty("height")})
    private long height;
    @lombok.Getter(onMethod_ = {@JsonProperty("px")})
    @lombok.Setter(onMethod_ = {@JsonProperty("px")})
    private List<Long> px;
    @lombok.Getter(onMethod_ = {@JsonProperty("width")})
    @lombok.Setter(onMethod_ = {@JsonProperty("width")})
    private long width;
}

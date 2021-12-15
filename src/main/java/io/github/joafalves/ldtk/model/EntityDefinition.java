package io.github.joafalves.ldtk.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@lombok.Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class EntityDefinition {
    @lombok.Getter(onMethod_ = {@JsonProperty("color")})
    @lombok.Setter(onMethod_ = {@JsonProperty("color")})
    private String color;
    @lombok.Getter(onMethod_ = {@JsonProperty("fieldDefs")})
    @lombok.Setter(onMethod_ = {@JsonProperty("fieldDefs")})
    private List<FieldDefinition> fieldDefs;
    @lombok.Getter(onMethod_ = {@JsonProperty("fillOpacity")})
    @lombok.Setter(onMethod_ = {@JsonProperty("fillOpacity")})
    private double fillOpacity;
    @lombok.Getter(onMethod_ = {@JsonProperty("height")})
    @lombok.Setter(onMethod_ = {@JsonProperty("height")})
    private long height;
    @lombok.Getter(onMethod_ = {@JsonProperty("hollow")})
    @lombok.Setter(onMethod_ = {@JsonProperty("hollow")})
    private boolean hollow;
    @lombok.Getter(onMethod_ = {@JsonProperty("identifier")})
    @lombok.Setter(onMethod_ = {@JsonProperty("identifier")})
    private String identifier;
    @lombok.Getter(onMethod_ = {@JsonProperty("keepAspectRatio")})
    @lombok.Setter(onMethod_ = {@JsonProperty("keepAspectRatio")})
    private boolean keepAspectRatio;
    @lombok.Getter(onMethod_ = {@JsonProperty("limitBehavior")})
    @lombok.Setter(onMethod_ = {@JsonProperty("limitBehavior")})
    private LimitBehavior limitBehavior;
    @lombok.Getter(onMethod_ = {@JsonProperty("limitScope")})
    @lombok.Setter(onMethod_ = {@JsonProperty("limitScope")})
    private LimitScope limitScope;
    @lombok.Getter(onMethod_ = {@JsonProperty("lineOpacity")})
    @lombok.Setter(onMethod_ = {@JsonProperty("lineOpacity")})
    private double lineOpacity;
    @lombok.Getter(onMethod_ = {@JsonProperty("maxCount")})
    @lombok.Setter(onMethod_ = {@JsonProperty("maxCount")})
    private long maxCount;
    @lombok.Getter(onMethod_ = {@JsonProperty("pivotX")})
    @lombok.Setter(onMethod_ = {@JsonProperty("pivotX")})
    private double pivotX;
    @lombok.Getter(onMethod_ = {@JsonProperty("pivotY")})
    @lombok.Setter(onMethod_ = {@JsonProperty("pivotY")})
    private double pivotY;
    @lombok.Getter(onMethod_ = {@JsonProperty("renderMode")})
    @lombok.Setter(onMethod_ = {@JsonProperty("renderMode")})
    private RenderMode renderMode;
    @lombok.Getter(onMethod_ = {@JsonProperty("resizableX")})
    @lombok.Setter(onMethod_ = {@JsonProperty("resizableX")})
    private boolean resizableX;
    @lombok.Getter(onMethod_ = {@JsonProperty("resizableY")})
    @lombok.Setter(onMethod_ = {@JsonProperty("resizableY")})
    private boolean resizableY;
    @lombok.Getter(onMethod_ = {@JsonProperty("showName")})
    @lombok.Setter(onMethod_ = {@JsonProperty("showName")})
    private boolean showName;
    @lombok.Getter(onMethod_ = {@JsonProperty("tags")})
    @lombok.Setter(onMethod_ = {@JsonProperty("tags")})
    private List<String> tags;
    @lombok.Getter(onMethod_ = {@JsonProperty("tileId")})
    @lombok.Setter(onMethod_ = {@JsonProperty("tileId")})
    private Long tileID;
    @lombok.Getter(onMethod_ = {@JsonProperty("tileRenderMode")})
    @lombok.Setter(onMethod_ = {@JsonProperty("tileRenderMode")})
    private TileRenderMode tileRenderMode;
    @lombok.Getter(onMethod_ = {@JsonProperty("tilesetId")})
    @lombok.Setter(onMethod_ = {@JsonProperty("tilesetId")})
    private Long tilesetID;
    @lombok.Getter(onMethod_ = {@JsonProperty("uid")})
    @lombok.Setter(onMethod_ = {@JsonProperty("uid")})
    private long uid;
    @lombok.Getter(onMethod_ = {@JsonProperty("width")})
    @lombok.Setter(onMethod_ = {@JsonProperty("width")})
    private long width;
}

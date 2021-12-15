package io.github.joafalves.ldtk.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@lombok.Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class LayerDefinition {
    @lombok.Getter(onMethod_ = {@JsonProperty("__type")})
    @lombok.Setter(onMethod_ = {@JsonProperty("__type")})
    private String type;
    @lombok.Getter(onMethod_ = {@JsonProperty("autoRuleGroups")})
    @lombok.Setter(onMethod_ = {@JsonProperty("autoRuleGroups")})
    private List<AutoLayerRuleGroup> autoRuleGroups;
    @lombok.Getter(onMethod_ = {@JsonProperty("autoSourceLayerDefUid")})
    @lombok.Setter(onMethod_ = {@JsonProperty("autoSourceLayerDefUid")})
    private Long autoSourceLayerDefUid;
    @lombok.Getter(onMethod_ = {@JsonProperty("autoTilesetDefUid")})
    @lombok.Setter(onMethod_ = {@JsonProperty("autoTilesetDefUid")})
    private Long autoTilesetDefUid;
    @lombok.Getter(onMethod_ = {@JsonProperty("displayOpacity")})
    @lombok.Setter(onMethod_ = {@JsonProperty("displayOpacity")})
    private double displayOpacity;
    @lombok.Getter(onMethod_ = {@JsonProperty("excludedTags")})
    @lombok.Setter(onMethod_ = {@JsonProperty("excludedTags")})
    private List<String> excludedTags;
    @lombok.Getter(onMethod_ = {@JsonProperty("gridSize")})
    @lombok.Setter(onMethod_ = {@JsonProperty("gridSize")})
    private long gridSize;
    @lombok.Getter(onMethod_ = {@JsonProperty("identifier")})
    @lombok.Setter(onMethod_ = {@JsonProperty("identifier")})
    private String identifier;
    @lombok.Getter(onMethod_ = {@JsonProperty("intGridValues")})
    @lombok.Setter(onMethod_ = {@JsonProperty("intGridValues")})
    private List<IntGridValueDefinition> intGridValues;
    @lombok.Getter(onMethod_ = {@JsonProperty("pxOffsetX")})
    @lombok.Setter(onMethod_ = {@JsonProperty("pxOffsetX")})
    private long pxOffsetX;
    @lombok.Getter(onMethod_ = {@JsonProperty("pxOffsetY")})
    @lombok.Setter(onMethod_ = {@JsonProperty("pxOffsetY")})
    private long pxOffsetY;
    @lombok.Getter(onMethod_ = {@JsonProperty("requiredTags")})
    @lombok.Setter(onMethod_ = {@JsonProperty("requiredTags")})
    private List<String> requiredTags;
    @lombok.Getter(onMethod_ = {@JsonProperty("tilePivotX")})
    @lombok.Setter(onMethod_ = {@JsonProperty("tilePivotX")})
    private double tilePivotX;
    @lombok.Getter(onMethod_ = {@JsonProperty("tilePivotY")})
    @lombok.Setter(onMethod_ = {@JsonProperty("tilePivotY")})
    private double tilePivotY;
    @lombok.Getter(onMethod_ = {@JsonProperty("tilesetDefUid")})
    @lombok.Setter(onMethod_ = {@JsonProperty("tilesetDefUid")})
    private Long tilesetDefUid;
    @lombok.Getter(onMethod_ = {@JsonProperty("type")})
    @lombok.Setter(onMethod_ = {@JsonProperty("type")})
    private Type layerDefinitionType;
    @lombok.Getter(onMethod_ = {@JsonProperty("uid")})
    @lombok.Setter(onMethod_ = {@JsonProperty("uid")})
    private long uid;
}

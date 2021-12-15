package io.github.joafalves.ldtk.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@lombok.Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class LayerInstance {
    @lombok.Getter(onMethod_ = {@JsonProperty("__cHei")})
    @lombok.Setter(onMethod_ = {@JsonProperty("__cHei")})
    private long cHei;
    @lombok.Getter(onMethod_ = {@JsonProperty("__cWid")})
    @lombok.Setter(onMethod_ = {@JsonProperty("__cWid")})
    private long cWid;
    @lombok.Getter(onMethod_ = {@JsonProperty("__gridSize")})
    @lombok.Setter(onMethod_ = {@JsonProperty("__gridSize")})
    private long gridSize;
    @lombok.Getter(onMethod_ = {@JsonProperty("__identifier")})
    @lombok.Setter(onMethod_ = {@JsonProperty("__identifier")})
    private String identifier;
    @lombok.Getter(onMethod_ = {@JsonProperty("__opacity")})
    @lombok.Setter(onMethod_ = {@JsonProperty("__opacity")})
    private double opacity;
    @lombok.Getter(onMethod_ = {@JsonProperty("__pxTotalOffsetX")})
    @lombok.Setter(onMethod_ = {@JsonProperty("__pxTotalOffsetX")})
    private long pxTotalOffsetX;
    @lombok.Getter(onMethod_ = {@JsonProperty("__pxTotalOffsetY")})
    @lombok.Setter(onMethod_ = {@JsonProperty("__pxTotalOffsetY")})
    private long pxTotalOffsetY;
    @lombok.Getter(onMethod_ = {@JsonProperty("__tilesetDefUid")})
    @lombok.Setter(onMethod_ = {@JsonProperty("__tilesetDefUid")})
    private Long tilesetDefUid;
    @lombok.Getter(onMethod_ = {@JsonProperty("__tilesetRelPath")})
    @lombok.Setter(onMethod_ = {@JsonProperty("__tilesetRelPath")})
    private String tilesetRelPath;
    @lombok.Getter(onMethod_ = {@JsonProperty("__type")})
    @lombok.Setter(onMethod_ = {@JsonProperty("__type")})
    private String type;
    @lombok.Getter(onMethod_ = {@JsonProperty("autoLayerTiles")})
    @lombok.Setter(onMethod_ = {@JsonProperty("autoLayerTiles")})
    private List<TileInstance> autoLayerTiles;
    @lombok.Getter(onMethod_ = {@JsonProperty("entityInstances")})
    @lombok.Setter(onMethod_ = {@JsonProperty("entityInstances")})
    private List<EntityInstance> entityInstances;
    @lombok.Getter(onMethod_ = {@JsonProperty("gridTiles")})
    @lombok.Setter(onMethod_ = {@JsonProperty("gridTiles")})
    private List<TileInstance> gridTiles;
    @lombok.Getter(onMethod_ = {@JsonProperty("intGrid")})
    @lombok.Setter(onMethod_ = {@JsonProperty("intGrid")})
    private List<IntGridValueInstance> intGrid;
    @lombok.Getter(onMethod_ = {@JsonProperty("intGridCsv")})
    @lombok.Setter(onMethod_ = {@JsonProperty("intGridCsv")})
    private List<Long> intGridCSV;
    @lombok.Getter(onMethod_ = {@JsonProperty("layerDefUid")})
    @lombok.Setter(onMethod_ = {@JsonProperty("layerDefUid")})
    private long layerDefUid;
    @lombok.Getter(onMethod_ = {@JsonProperty("levelId")})
    @lombok.Setter(onMethod_ = {@JsonProperty("levelId")})
    private long levelID;
    @lombok.Getter(onMethod_ = {@JsonProperty("optionalRules")})
    @lombok.Setter(onMethod_ = {@JsonProperty("optionalRules")})
    private List<Long> optionalRules;
    @lombok.Getter(onMethod_ = {@JsonProperty("overrideTilesetUid")})
    @lombok.Setter(onMethod_ = {@JsonProperty("overrideTilesetUid")})
    private Long overrideTilesetUid;
    @lombok.Getter(onMethod_ = {@JsonProperty("pxOffsetX")})
    @lombok.Setter(onMethod_ = {@JsonProperty("pxOffsetX")})
    private long pxOffsetX;
    @lombok.Getter(onMethod_ = {@JsonProperty("pxOffsetY")})
    @lombok.Setter(onMethod_ = {@JsonProperty("pxOffsetY")})
    private long pxOffsetY;
    @lombok.Getter(onMethod_ = {@JsonProperty("seed")})
    @lombok.Setter(onMethod_ = {@JsonProperty("seed")})
    private long seed;
    @lombok.Getter(onMethod_ = {@JsonProperty("visible")})
    @lombok.Setter(onMethod_ = {@JsonProperty("visible")})
    private boolean visible;
}

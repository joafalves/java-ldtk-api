package io.github.joafalves.ldtk.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

/**
 * This section contains all the level data. It can be found in 2 distinct forms, depending
 * on Project current settings:  - If "*Separate level files*" is **disabled** (default):
 * full level data is *embedded* inside the main Project JSON file, - If "*Separate level
 * files*" is **enabled**: level data is stored in *separate* standalone `.ldtkl` files (one
 * per level). In this case, the main Project JSON file will still contain most level data,
 * except heavy sections, like the `layerInstances` array (which will be null). The
 * `externalRelPath` string points to the `ldtkl` file.  A `ldtkl` file is just a JSON file
 * containing exactly what is described below.
 */
@lombok.Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Level {
    @lombok.Getter(onMethod_ = {@JsonProperty("__bgColor")})
    @lombok.Setter(onMethod_ = {@JsonProperty("__bgColor")})
    private String bgColor;
    @lombok.Getter(onMethod_ = {@JsonProperty("__bgPos")})
    @lombok.Setter(onMethod_ = {@JsonProperty("__bgPos")})
    private LevelBackgroundPosition bgPos;
    @lombok.Getter(onMethod_ = {@JsonProperty("__neighbours")})
    @lombok.Setter(onMethod_ = {@JsonProperty("__neighbours")})
    private List<NeighbourLevel> neighbours;
    @lombok.Getter(onMethod_ = {@JsonProperty("bgColor")})
    @lombok.Setter(onMethod_ = {@JsonProperty("bgColor")})
    private String levelBgColor;
    @lombok.Getter(onMethod_ = {@JsonProperty("bgPivotX")})
    @lombok.Setter(onMethod_ = {@JsonProperty("bgPivotX")})
    private double bgPivotX;
    @lombok.Getter(onMethod_ = {@JsonProperty("bgPivotY")})
    @lombok.Setter(onMethod_ = {@JsonProperty("bgPivotY")})
    private double bgPivotY;
    @lombok.Getter(onMethod_ = {@JsonProperty("bgPos")})
    @lombok.Setter(onMethod_ = {@JsonProperty("bgPos")})
    private BgPos levelBgPos;
    @lombok.Getter(onMethod_ = {@JsonProperty("bgRelPath")})
    @lombok.Setter(onMethod_ = {@JsonProperty("bgRelPath")})
    private String bgRelPath;
    @lombok.Getter(onMethod_ = {@JsonProperty("externalRelPath")})
    @lombok.Setter(onMethod_ = {@JsonProperty("externalRelPath")})
    private String externalRelPath;
    @lombok.Getter(onMethod_ = {@JsonProperty("fieldInstances")})
    @lombok.Setter(onMethod_ = {@JsonProperty("fieldInstances")})
    private List<FieldInstance> fieldInstances;
    @lombok.Getter(onMethod_ = {@JsonProperty("identifier")})
    @lombok.Setter(onMethod_ = {@JsonProperty("identifier")})
    private String identifier;
    @lombok.Getter(onMethod_ = {@JsonProperty("layerInstances")})
    @lombok.Setter(onMethod_ = {@JsonProperty("layerInstances")})
    private List<LayerInstance> layerInstances;
    @lombok.Getter(onMethod_ = {@JsonProperty("pxHei")})
    @lombok.Setter(onMethod_ = {@JsonProperty("pxHei")})
    private long pxHei;
    @lombok.Getter(onMethod_ = {@JsonProperty("pxWid")})
    @lombok.Setter(onMethod_ = {@JsonProperty("pxWid")})
    private long pxWid;
    @lombok.Getter(onMethod_ = {@JsonProperty("uid")})
    @lombok.Setter(onMethod_ = {@JsonProperty("uid")})
    private long uid;
    @lombok.Getter(onMethod_ = {@JsonProperty("useAutoIdentifier")})
    @lombok.Setter(onMethod_ = {@JsonProperty("useAutoIdentifier")})
    private boolean useAutoIdentifier;
    @lombok.Getter(onMethod_ = {@JsonProperty("worldX")})
    @lombok.Setter(onMethod_ = {@JsonProperty("worldX")})
    private long worldX;
    @lombok.Getter(onMethod_ = {@JsonProperty("worldY")})
    @lombok.Setter(onMethod_ = {@JsonProperty("worldY")})
    private long worldY;
}

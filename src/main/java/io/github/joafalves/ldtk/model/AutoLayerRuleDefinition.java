package io.github.joafalves.ldtk.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

/**
 * This complex section isn't meant to be used by game devs at all, as these rules are
 * completely resolved internally by the editor before any saving. You should just ignore
 * this part.
 */
@lombok.Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AutoLayerRuleDefinition {
    @lombok.Getter(onMethod_ = {@JsonProperty("active")})
    @lombok.Setter(onMethod_ = {@JsonProperty("active")})
    private boolean active;
    @lombok.Getter(onMethod_ = {@JsonProperty("breakOnMatch")})
    @lombok.Setter(onMethod_ = {@JsonProperty("breakOnMatch")})
    private boolean breakOnMatch;
    @lombok.Getter(onMethod_ = {@JsonProperty("chance")})
    @lombok.Setter(onMethod_ = {@JsonProperty("chance")})
    private double chance;
    @lombok.Getter(onMethod_ = {@JsonProperty("checker")})
    @lombok.Setter(onMethod_ = {@JsonProperty("checker")})
    private Checker checker;
    @lombok.Getter(onMethod_ = {@JsonProperty("flipX")})
    @lombok.Setter(onMethod_ = {@JsonProperty("flipX")})
    private boolean flipX;
    @lombok.Getter(onMethod_ = {@JsonProperty("flipY")})
    @lombok.Setter(onMethod_ = {@JsonProperty("flipY")})
    private boolean flipY;
    @lombok.Getter(onMethod_ = {@JsonProperty("outOfBoundsValue")})
    @lombok.Setter(onMethod_ = {@JsonProperty("outOfBoundsValue")})
    private Long outOfBoundsValue;
    @lombok.Getter(onMethod_ = {@JsonProperty("pattern")})
    @lombok.Setter(onMethod_ = {@JsonProperty("pattern")})
    private List<Long> pattern;
    @lombok.Getter(onMethod_ = {@JsonProperty("perlinActive")})
    @lombok.Setter(onMethod_ = {@JsonProperty("perlinActive")})
    private boolean perlinActive;
    @lombok.Getter(onMethod_ = {@JsonProperty("perlinOctaves")})
    @lombok.Setter(onMethod_ = {@JsonProperty("perlinOctaves")})
    private double perlinOctaves;
    @lombok.Getter(onMethod_ = {@JsonProperty("perlinScale")})
    @lombok.Setter(onMethod_ = {@JsonProperty("perlinScale")})
    private double perlinScale;
    @lombok.Getter(onMethod_ = {@JsonProperty("perlinSeed")})
    @lombok.Setter(onMethod_ = {@JsonProperty("perlinSeed")})
    private double perlinSeed;
    @lombok.Getter(onMethod_ = {@JsonProperty("pivotX")})
    @lombok.Setter(onMethod_ = {@JsonProperty("pivotX")})
    private double pivotX;
    @lombok.Getter(onMethod_ = {@JsonProperty("pivotY")})
    @lombok.Setter(onMethod_ = {@JsonProperty("pivotY")})
    private double pivotY;
    @lombok.Getter(onMethod_ = {@JsonProperty("size")})
    @lombok.Setter(onMethod_ = {@JsonProperty("size")})
    private long size;
    @lombok.Getter(onMethod_ = {@JsonProperty("tileIds")})
    @lombok.Setter(onMethod_ = {@JsonProperty("tileIds")})
    private List<Long> tileIDS;
    @lombok.Getter(onMethod_ = {@JsonProperty("tileMode")})
    @lombok.Setter(onMethod_ = {@JsonProperty("tileMode")})
    private TileMode tileMode;
    @lombok.Getter(onMethod_ = {@JsonProperty("uid")})
    @lombok.Setter(onMethod_ = {@JsonProperty("uid")})
    private long uid;
    @lombok.Getter(onMethod_ = {@JsonProperty("xModulo")})
    @lombok.Setter(onMethod_ = {@JsonProperty("xModulo")})
    private long xModulo;
    @lombok.Getter(onMethod_ = {@JsonProperty("yModulo")})
    @lombok.Setter(onMethod_ = {@JsonProperty("yModulo")})
    private long yModulo;
}

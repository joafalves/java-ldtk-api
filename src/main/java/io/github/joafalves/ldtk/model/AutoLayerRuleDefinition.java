package io.github.joafalves.ldtk.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

/**
 * This complex section isn't meant to be used by game devs at all, as these rules are
 * completely resolved internally by the editor before any saving. You should just ignore
 * this part.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AutoLayerRuleDefinition {
    private boolean active;
    private boolean breakOnMatch;
    private double chance;
    private Checker checker;
    private boolean flipX;
    private boolean flipY;
    private Long outOfBoundsValue;
    private List<Long> pattern;
    private boolean perlinActive;
    private double perlinOctaves;
    private double perlinScale;
    private double perlinSeed;
    private double pivotX;
    private double pivotY;
    private long size;
    private List<Long> tileIDS;
    private TileMode tileMode;
    private long uid;
    private long xModulo;
    private long yModulo;

    /**
     * If FALSE, the rule effect isn't applied, and no tiles are generated.
     */
    @JsonProperty("active")
    public boolean getActive() { return active; }
    @JsonProperty("active")
    public void setActive(boolean value) { this.active = value; }

    /**
     * When TRUE, the rule will prevent other rules to be applied in the same cell if it matches
     * (TRUE by default).
     */
    @JsonProperty("breakOnMatch")
    public boolean getBreakOnMatch() { return breakOnMatch; }
    @JsonProperty("breakOnMatch")
    public void setBreakOnMatch(boolean value) { this.breakOnMatch = value; }

    /**
     * Chances for this rule to be applied (0 to 1)
     */
    @JsonProperty("chance")
    public double getChance() { return chance; }
    @JsonProperty("chance")
    public void setChance(double value) { this.chance = value; }

    /**
     * Checker mode Possible values: `None`, `Horizontal`, `Vertical`
     */
    @JsonProperty("checker")
    public Checker getChecker() { return checker; }
    @JsonProperty("checker")
    public void setChecker(Checker value) { this.checker = value; }

    /**
     * If TRUE, allow rule to be matched by flipping its pattern horizontally
     */
    @JsonProperty("flipX")
    public boolean getFlipX() { return flipX; }
    @JsonProperty("flipX")
    public void setFlipX(boolean value) { this.flipX = value; }

    /**
     * If TRUE, allow rule to be matched by flipping its pattern vertically
     */
    @JsonProperty("flipY")
    public boolean getFlipY() { return flipY; }
    @JsonProperty("flipY")
    public void setFlipY(boolean value) { this.flipY = value; }

    /**
     * Default IntGrid value when checking cells outside of level bounds
     */
    @JsonProperty("outOfBoundsValue")
    public Long getOutOfBoundsValue() { return outOfBoundsValue; }
    @JsonProperty("outOfBoundsValue")
    public void setOutOfBoundsValue(Long value) { this.outOfBoundsValue = value; }

    /**
     * Rule pattern (size x size)
     */
    @JsonProperty("pattern")
    public List<Long> getPattern() { return pattern; }
    @JsonProperty("pattern")
    public void setPattern(List<Long> value) { this.pattern = value; }

    /**
     * If TRUE, enable Perlin filtering to only apply rule on specific random area
     */
    @JsonProperty("perlinActive")
    public boolean getPerlinActive() { return perlinActive; }
    @JsonProperty("perlinActive")
    public void setPerlinActive(boolean value) { this.perlinActive = value; }

    @JsonProperty("perlinOctaves")
    public double getPerlinOctaves() { return perlinOctaves; }
    @JsonProperty("perlinOctaves")
    public void setPerlinOctaves(double value) { this.perlinOctaves = value; }

    @JsonProperty("perlinScale")
    public double getPerlinScale() { return perlinScale; }
    @JsonProperty("perlinScale")
    public void setPerlinScale(double value) { this.perlinScale = value; }

    @JsonProperty("perlinSeed")
    public double getPerlinSeed() { return perlinSeed; }
    @JsonProperty("perlinSeed")
    public void setPerlinSeed(double value) { this.perlinSeed = value; }

    /**
     * X pivot of a tile stamp (0-1)
     */
    @JsonProperty("pivotX")
    public double getPivotX() { return pivotX; }
    @JsonProperty("pivotX")
    public void setPivotX(double value) { this.pivotX = value; }

    /**
     * Y pivot of a tile stamp (0-1)
     */
    @JsonProperty("pivotY")
    public double getPivotY() { return pivotY; }
    @JsonProperty("pivotY")
    public void setPivotY(double value) { this.pivotY = value; }

    /**
     * Pattern width and height. Should only be 1,3,5 or 7.
     */
    @JsonProperty("size")
    public long getSize() { return size; }
    @JsonProperty("size")
    public void setSize(long value) { this.size = value; }

    /**
     * Array of all the tile IDs. They are used randomly or as stamps, based on `tileMode` value.
     */
    @JsonProperty("tileIds")
    public List<Long> getTileIDS() { return tileIDS; }
    @JsonProperty("tileIds")
    public void setTileIDS(List<Long> value) { this.tileIDS = value; }

    /**
     * Defines how tileIds array is used Possible values: `Single`, `Stamp`
     */
    @JsonProperty("tileMode")
    public TileMode getTileMode() { return tileMode; }
    @JsonProperty("tileMode")
    public void setTileMode(TileMode value) { this.tileMode = value; }

    /**
     * Unique Int identifier
     */
    @JsonProperty("uid")
    public long getUid() { return uid; }
    @JsonProperty("uid")
    public void setUid(long value) { this.uid = value; }

    /**
     * X cell coord modulo
     */
    @JsonProperty("xModulo")
    public long getXModulo() { return xModulo; }
    @JsonProperty("xModulo")
    public void setXModulo(long value) { this.xModulo = value; }

    /**
     * Y cell coord modulo
     */
    @JsonProperty("yModulo")
    public long getYModulo() { return yModulo; }
    @JsonProperty("yModulo")
    public void setYModulo(long value) { this.yModulo = value; }
}

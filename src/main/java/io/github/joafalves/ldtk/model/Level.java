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
@JsonIgnoreProperties(ignoreUnknown = true)
public class Level {
    private String bgColor;
    private LevelBackgroundPosition bgPos;
    private List<NeighbourLevel> neighbours;
    private String levelBgColor;
    private double bgPivotX;
    private double bgPivotY;
    private BgPos levelBgPos;
    private String bgRelPath;
    private String externalRelPath;
    private List<FieldInstance> fieldInstances;
    private String identifier;
    private List<LayerInstance> layerInstances;
    private long pxHei;
    private long pxWid;
    private long uid;
    private boolean useAutoIdentifier;
    private long worldX;
    private long worldY;

    /**
     * Background color of the level (same as `bgColor`, except the default value is
     * automatically used here if its value is `null`)
     */
    @JsonProperty("__bgColor")
    public String getBgColor() { return bgColor; }
    @JsonProperty("__bgColor")
    public void setBgColor(String value) { this.bgColor = value; }

    /**
     * Position informations of the background image, if there is one.
     */
    @JsonProperty("__bgPos")
    public LevelBackgroundPosition getBgPos() { return bgPos; }
    @JsonProperty("__bgPos")
    public void setBgPos(LevelBackgroundPosition value) { this.bgPos = value; }

    /**
     * An array listing all other levels touching this one on the world map. In "linear" world
     * layouts, this array is populated with previous/next levels in array, and `dir` depends on
     * the linear horizontal/vertical layout.
     */
    @JsonProperty("__neighbours")
    public List<NeighbourLevel> getNeighbours() { return neighbours; }
    @JsonProperty("__neighbours")
    public void setNeighbours(List<NeighbourLevel> value) { this.neighbours = value; }

    /**
     * Background color of the level. If `null`, the project `defaultLevelBgColor` should be
     * used.
     */
    @JsonProperty("bgColor")
    public String getLevelBgColor() { return levelBgColor; }
    @JsonProperty("bgColor")
    public void setLevelBgColor(String value) { this.levelBgColor = value; }

    /**
     * Background image X pivot (0-1)
     */
    @JsonProperty("bgPivotX")
    public double getBgPivotX() { return bgPivotX; }
    @JsonProperty("bgPivotX")
    public void setBgPivotX(double value) { this.bgPivotX = value; }

    /**
     * Background image Y pivot (0-1)
     */
    @JsonProperty("bgPivotY")
    public double getBgPivotY() { return bgPivotY; }
    @JsonProperty("bgPivotY")
    public void setBgPivotY(double value) { this.bgPivotY = value; }

    /**
     * An enum defining the way the background image (if any) is positioned on the level. See
     * `__bgPos` for resulting position info. Possible values: &lt;`null`&gt;, `Unscaled`,
     * `Contain`, `Cover`, `CoverDirty`
     */
    @JsonProperty("bgPos")
    public BgPos getLevelBgPos() { return levelBgPos; }
    @JsonProperty("bgPos")
    public void setLevelBgPos(BgPos value) { this.levelBgPos = value; }

    /**
     * The *optional* relative path to the level background image.
     */
    @JsonProperty("bgRelPath")
    public String getBgRelPath() { return bgRelPath; }
    @JsonProperty("bgRelPath")
    public void setBgRelPath(String value) { this.bgRelPath = value; }

    /**
     * This value is not null if the project option "*Save levels separately*" is enabled. In
     * this case, this **relative** path points to the level Json file.
     */
    @JsonProperty("externalRelPath")
    public String getExternalRelPath() { return externalRelPath; }
    @JsonProperty("externalRelPath")
    public void setExternalRelPath(String value) { this.externalRelPath = value; }

    /**
     * An array containing this level custom field values.
     */
    @JsonProperty("fieldInstances")
    public List<FieldInstance> getFieldInstances() { return fieldInstances; }
    @JsonProperty("fieldInstances")
    public void setFieldInstances(List<FieldInstance> value) { this.fieldInstances = value; }

    /**
     * Unique String identifier
     */
    @JsonProperty("identifier")
    public String getIdentifier() { return identifier; }
    @JsonProperty("identifier")
    public void setIdentifier(String value) { this.identifier = value; }

    /**
     * An array containing all Layer instances. **IMPORTANT**: if the project option "*Save
     * levels separately*" is enabled, this field will be `null`. This array is **sorted
     * in display order**: the 1st layer is the top-most and the last is behind.
     */
    @JsonProperty("layerInstances")
    public List<LayerInstance> getLayerInstances() { return layerInstances; }
    @JsonProperty("layerInstances")
    public void setLayerInstances(List<LayerInstance> value) { this.layerInstances = value; }

    /**
     * Height of the level in pixels
     */
    @JsonProperty("pxHei")
    public long getPxHei() { return pxHei; }
    @JsonProperty("pxHei")
    public void setPxHei(long value) { this.pxHei = value; }

    /**
     * Width of the level in pixels
     */
    @JsonProperty("pxWid")
    public long getPxWid() { return pxWid; }
    @JsonProperty("pxWid")
    public void setPxWid(long value) { this.pxWid = value; }

    /**
     * Unique Int identifier
     */
    @JsonProperty("uid")
    public long getUid() { return uid; }
    @JsonProperty("uid")
    public void setUid(long value) { this.uid = value; }

    /**
     * If TRUE, the level identifier will always automatically use the naming pattern as defined
     * in `Project.levelNamePattern`. Becomes FALSE if the identifier is manually modified by
     * user.
     */
    @JsonProperty("useAutoIdentifier")
    public boolean getUseAutoIdentifier() { return useAutoIdentifier; }
    @JsonProperty("useAutoIdentifier")
    public void setUseAutoIdentifier(boolean value) { this.useAutoIdentifier = value; }

    /**
     * World X coordinate in pixels
     */
    @JsonProperty("worldX")
    public long getWorldX() { return worldX; }
    @JsonProperty("worldX")
    public void setWorldX(long value) { this.worldX = value; }

    /**
     * World Y coordinate in pixels
     */
    @JsonProperty("worldY")
    public long getWorldY() { return worldY; }
    @JsonProperty("worldY")
    public void setWorldY(long value) { this.worldY = value; }
}

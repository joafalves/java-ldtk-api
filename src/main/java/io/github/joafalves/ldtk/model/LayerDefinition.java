package io.github.joafalves.ldtk.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LayerDefinition {
    private String type;
    private List<AutoLayerRuleGroup> autoRuleGroups;
    private Long autoSourceLayerDefUid;
    private Long autoTilesetDefUid;
    private double displayOpacity;
    private List<String> excludedTags;
    private long gridSize;
    private String identifier;
    private List<IntGridValueDefinition> intGridValues;
    private long pxOffsetX;
    private long pxOffsetY;
    private List<String> requiredTags;
    private double tilePivotX;
    private double tilePivotY;
    private Long tilesetDefUid;
    private Type layerDefinitionType;
    private long uid;

    /**
     * Type of the layer (*IntGrid, Entities, Tiles or AutoLayer*)
     */
    @JsonProperty("__type")
    public String getType() { return type; }
    @JsonProperty("__type")
    public void setType(String value) { this.type = value; }

    /**
     * Contains all the auto-layer rule definitions.
     */
    @JsonProperty("autoRuleGroups")
    public List<AutoLayerRuleGroup> getAutoRuleGroups() { return autoRuleGroups; }
    @JsonProperty("autoRuleGroups")
    public void setAutoRuleGroups(List<AutoLayerRuleGroup> value) { this.autoRuleGroups = value; }

    @JsonProperty("autoSourceLayerDefUid")
    public Long getAutoSourceLayerDefUid() { return autoSourceLayerDefUid; }
    @JsonProperty("autoSourceLayerDefUid")
    public void setAutoSourceLayerDefUid(Long value) { this.autoSourceLayerDefUid = value; }

    /**
     * Reference to the Tileset UID being used by this auto-layer rules. WARNING: some layer
     * *instances* might use a different tileset. So most of the time, you should probably use
     * the `__tilesetDefUid` value from layer instances.
     */
    @JsonProperty("autoTilesetDefUid")
    public Long getAutoTilesetDefUid() { return autoTilesetDefUid; }
    @JsonProperty("autoTilesetDefUid")
    public void setAutoTilesetDefUid(Long value) { this.autoTilesetDefUid = value; }

    /**
     * Opacity of the layer (0 to 1.0)
     */
    @JsonProperty("displayOpacity")
    public double getDisplayOpacity() { return displayOpacity; }
    @JsonProperty("displayOpacity")
    public void setDisplayOpacity(double value) { this.displayOpacity = value; }

    /**
     * An array of tags to forbid some Entities in this layer
     */
    @JsonProperty("excludedTags")
    public List<String> getExcludedTags() { return excludedTags; }
    @JsonProperty("excludedTags")
    public void setExcludedTags(List<String> value) { this.excludedTags = value; }

    /**
     * Width and height of the grid in pixels
     */
    @JsonProperty("gridSize")
    public long getGridSize() { return gridSize; }
    @JsonProperty("gridSize")
    public void setGridSize(long value) { this.gridSize = value; }

    /**
     * Unique String identifier
     */
    @JsonProperty("identifier")
    public String getIdentifier() { return identifier; }
    @JsonProperty("identifier")
    public void setIdentifier(String value) { this.identifier = value; }

    /**
     * An array that defines extra optional info for each IntGrid value. The array is sorted
     * using value (ascending).
     */
    @JsonProperty("intGridValues")
    public List<IntGridValueDefinition> getIntGridValues() { return intGridValues; }
    @JsonProperty("intGridValues")
    public void setIntGridValues(List<IntGridValueDefinition> value) { this.intGridValues = value; }

    /**
     * X offset of the layer, in pixels (IMPORTANT: this should be added to the `LayerInstance`
     * optional offset)
     */
    @JsonProperty("pxOffsetX")
    public long getPxOffsetX() { return pxOffsetX; }
    @JsonProperty("pxOffsetX")
    public void setPxOffsetX(long value) { this.pxOffsetX = value; }

    /**
     * Y offset of the layer, in pixels (IMPORTANT: this should be added to the `LayerInstance`
     * optional offset)
     */
    @JsonProperty("pxOffsetY")
    public long getPxOffsetY() { return pxOffsetY; }
    @JsonProperty("pxOffsetY")
    public void setPxOffsetY(long value) { this.pxOffsetY = value; }

    /**
     * An array of tags to filter Entities that can be added to this layer
     */
    @JsonProperty("requiredTags")
    public List<String> getRequiredTags() { return requiredTags; }
    @JsonProperty("requiredTags")
    public void setRequiredTags(List<String> value) { this.requiredTags = value; }

    /**
     * If the tiles are smaller or larger than the layer grid, the pivot value will be used to
     * position the tile relatively its grid cell.
     */
    @JsonProperty("tilePivotX")
    public double getTilePivotX() { return tilePivotX; }
    @JsonProperty("tilePivotX")
    public void setTilePivotX(double value) { this.tilePivotX = value; }

    /**
     * If the tiles are smaller or larger than the layer grid, the pivot value will be used to
     * position the tile relatively its grid cell.
     */
    @JsonProperty("tilePivotY")
    public double getTilePivotY() { return tilePivotY; }
    @JsonProperty("tilePivotY")
    public void setTilePivotY(double value) { this.tilePivotY = value; }

    /**
     * Reference to the Tileset UID being used by this Tile layer. WARNING: some layer
     * *instances* might use a different tileset. So most of the time, you should probably use
     * the `__tilesetDefUid` value from layer instances.
     */
    @JsonProperty("tilesetDefUid")
    public Long getTilesetDefUid() { return tilesetDefUid; }
    @JsonProperty("tilesetDefUid")
    public void setTilesetDefUid(Long value) { this.tilesetDefUid = value; }

    /**
     * Type of the layer as Haxe Enum Possible values: `IntGrid`, `Entities`, `Tiles`,
     * `AutoLayer`
     */
    @JsonProperty("type")
    public Type getLayerDefinitionType() { return layerDefinitionType; }
    @JsonProperty("type")
    public void setLayerDefinitionType(Type value) { this.layerDefinitionType = value; }

    /**
     * Unique Int identifier
     */
    @JsonProperty("uid")
    public long getUid() { return uid; }
    @JsonProperty("uid")
    public void setUid(long value) { this.uid = value; }
}

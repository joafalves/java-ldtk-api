package io.github.joafalves.ldtk.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EntityDefinition {
    private String color;
    private List<FieldDefinition> fieldDefs;
    private double fillOpacity;
    private long height;
    private boolean hollow;
    private String identifier;
    private boolean keepAspectRatio;
    private LimitBehavior limitBehavior;
    private LimitScope limitScope;
    private double lineOpacity;
    private long maxCount;
    private double pivotX;
    private double pivotY;
    private RenderMode renderMode;
    private boolean resizableX;
    private boolean resizableY;
    private boolean showName;
    private List<String> tags;
    private Long tileID;
    private TileRenderMode tileRenderMode;
    private Long tilesetID;
    private long uid;
    private long width;

    /**
     * Base entity color
     */
    @JsonProperty("color")
    public String getColor() { return color; }
    @JsonProperty("color")
    public void setColor(String value) { this.color = value; }

    /**
     * Array of field definitions
     */
    @JsonProperty("fieldDefs")
    public List<FieldDefinition> getFieldDefs() { return fieldDefs; }
    @JsonProperty("fieldDefs")
    public void setFieldDefs(List<FieldDefinition> value) { this.fieldDefs = value; }

    @JsonProperty("fillOpacity")
    public double getFillOpacity() { return fillOpacity; }
    @JsonProperty("fillOpacity")
    public void setFillOpacity(double value) { this.fillOpacity = value; }

    /**
     * Pixel height
     */
    @JsonProperty("height")
    public long getHeight() { return height; }
    @JsonProperty("height")
    public void setHeight(long value) { this.height = value; }

    @JsonProperty("hollow")
    public boolean getHollow() { return hollow; }
    @JsonProperty("hollow")
    public void setHollow(boolean value) { this.hollow = value; }

    /**
     * Unique String identifier
     */
    @JsonProperty("identifier")
    public String getIdentifier() { return identifier; }
    @JsonProperty("identifier")
    public void setIdentifier(String value) { this.identifier = value; }

    /**
     * Only applies to entities resizable on both X/Y. If TRUE, the entity instance width/height
     * will keep the same aspect ratio as the definition.
     */
    @JsonProperty("keepAspectRatio")
    public boolean getKeepAspectRatio() { return keepAspectRatio; }
    @JsonProperty("keepAspectRatio")
    public void setKeepAspectRatio(boolean value) { this.keepAspectRatio = value; }

    /**
     * Possible values: `DiscardOldOnes`, `PreventAdding`, `MoveLastOne`
     */
    @JsonProperty("limitBehavior")
    public LimitBehavior getLimitBehavior() { return limitBehavior; }
    @JsonProperty("limitBehavior")
    public void setLimitBehavior(LimitBehavior value) { this.limitBehavior = value; }

    /**
     * If TRUE, the maxCount is a "per world" limit, if FALSE, it's a "per level". Possible
     * values: `PerLayer`, `PerLevel`, `PerWorld`
     */
    @JsonProperty("limitScope")
    public LimitScope getLimitScope() { return limitScope; }
    @JsonProperty("limitScope")
    public void setLimitScope(LimitScope value) { this.limitScope = value; }

    @JsonProperty("lineOpacity")
    public double getLineOpacity() { return lineOpacity; }
    @JsonProperty("lineOpacity")
    public void setLineOpacity(double value) { this.lineOpacity = value; }

    /**
     * Max instances count
     */
    @JsonProperty("maxCount")
    public long getMaxCount() { return maxCount; }
    @JsonProperty("maxCount")
    public void setMaxCount(long value) { this.maxCount = value; }

    /**
     * Pivot X coordinate (from 0 to 1.0)
     */
    @JsonProperty("pivotX")
    public double getPivotX() { return pivotX; }
    @JsonProperty("pivotX")
    public void setPivotX(double value) { this.pivotX = value; }

    /**
     * Pivot Y coordinate (from 0 to 1.0)
     */
    @JsonProperty("pivotY")
    public double getPivotY() { return pivotY; }
    @JsonProperty("pivotY")
    public void setPivotY(double value) { this.pivotY = value; }

    /**
     * Possible values: `Rectangle`, `Ellipse`, `Tile`, `Cross`
     */
    @JsonProperty("renderMode")
    public RenderMode getRenderMode() { return renderMode; }
    @JsonProperty("renderMode")
    public void setRenderMode(RenderMode value) { this.renderMode = value; }

    /**
     * If TRUE, the entity instances will be resizable horizontally
     */
    @JsonProperty("resizableX")
    public boolean getResizableX() { return resizableX; }
    @JsonProperty("resizableX")
    public void setResizableX(boolean value) { this.resizableX = value; }

    /**
     * If TRUE, the entity instances will be resizable vertically
     */
    @JsonProperty("resizableY")
    public boolean getResizableY() { return resizableY; }
    @JsonProperty("resizableY")
    public void setResizableY(boolean value) { this.resizableY = value; }

    /**
     * Display entity name in editor
     */
    @JsonProperty("showName")
    public boolean getShowName() { return showName; }
    @JsonProperty("showName")
    public void setShowName(boolean value) { this.showName = value; }

    /**
     * An array of strings that classifies this entity
     */
    @JsonProperty("tags")
    public List<String> getTags() { return tags; }
    @JsonProperty("tags")
    public void setTags(List<String> value) { this.tags = value; }

    /**
     * Tile ID used for optional tile display
     */
    @JsonProperty("tileId")
    public Long getTileID() { return tileID; }
    @JsonProperty("tileId")
    public void setTileID(Long value) { this.tileID = value; }

    /**
     * Possible values: `Cover`, `FitInside`, `Repeat`, `Stretch`
     */
    @JsonProperty("tileRenderMode")
    public TileRenderMode getTileRenderMode() { return tileRenderMode; }
    @JsonProperty("tileRenderMode")
    public void setTileRenderMode(TileRenderMode value) { this.tileRenderMode = value; }

    /**
     * Tileset ID used for optional tile display
     */
    @JsonProperty("tilesetId")
    public Long getTilesetID() { return tilesetID; }
    @JsonProperty("tilesetId")
    public void setTilesetID(Long value) { this.tilesetID = value; }

    /**
     * Unique Int identifier
     */
    @JsonProperty("uid")
    public long getUid() { return uid; }
    @JsonProperty("uid")
    public void setUid(long value) { this.uid = value; }

    /**
     * Pixel width
     */
    @JsonProperty("width")
    public long getWidth() { return width; }
    @JsonProperty("width")
    public void setWidth(long value) { this.width = value; }
}

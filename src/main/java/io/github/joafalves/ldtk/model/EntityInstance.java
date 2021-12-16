package io.github.joafalves.ldtk.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EntityInstance {
    private List<Long> grid;
    private String identifier;
    private List<Double> pivot;
    private EntityInstanceTile tile;
    private long defUid;
    private List<FieldInstance> fieldInstances;
    private long height;
    private List<Long> px;
    private long width;

    /**
     * Grid-based coordinates (`[x,y]` format)
     */
    @JsonProperty("__grid")
    public List<Long> getGrid() { return grid; }
    @JsonProperty("__grid")
    public void setGrid(List<Long> value) { this.grid = value; }

    /**
     * Entity definition identifier
     */
    @JsonProperty("__identifier")
    public String getIdentifier() { return identifier; }
    @JsonProperty("__identifier")
    public void setIdentifier(String value) { this.identifier = value; }

    /**
     * Pivot coordinates  (`[x,y]` format, values are from 0 to 1) of the Entity
     */
    @JsonProperty("__pivot")
    public List<Double> getPivot() { return pivot; }
    @JsonProperty("__pivot")
    public void setPivot(List<Double> value) { this.pivot = value; }

    /**
     * Optional Tile used to display this entity (it could either be the default Entity tile, or
     * some tile provided by a field value, like an Enum).
     */
    @JsonProperty("__tile")
    public EntityInstanceTile getTile() { return tile; }
    @JsonProperty("__tile")
    public void setTile(EntityInstanceTile value) { this.tile = value; }

    /**
     * Reference of the **Entity definition** UID
     */
    @JsonProperty("defUid")
    public long getDefUid() { return defUid; }
    @JsonProperty("defUid")
    public void setDefUid(long value) { this.defUid = value; }

    /**
     * An array of all custom fields and their values.
     */
    @JsonProperty("fieldInstances")
    public List<FieldInstance> getFieldInstances() { return fieldInstances; }
    @JsonProperty("fieldInstances")
    public void setFieldInstances(List<FieldInstance> value) { this.fieldInstances = value; }

    /**
     * Entity height in pixels. For non-resizable entities, it will be the same as Entity
     * definition.
     */
    @JsonProperty("height")
    public long getHeight() { return height; }
    @JsonProperty("height")
    public void setHeight(long value) { this.height = value; }

    /**
     * Pixel coordinates (`[x,y]` format) in current level coordinate space. Don't forget
     * optional layer offsets, if they exist!
     */
    @JsonProperty("px")
    public List<Long> getPx() { return px; }
    @JsonProperty("px")
    public void setPx(List<Long> value) { this.px = value; }

    /**
     * Entity width in pixels. For non-resizable entities, it will be the same as Entity
     * definition.
     */
    @JsonProperty("width")
    public long getWidth() { return width; }
    @JsonProperty("width")
    public void setWidth(long value) { this.width = value; }
}

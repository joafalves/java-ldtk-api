package io.github.joafalves.ldtk.model;

import com.fasterxml.jackson.annotation.*;

public class EnumValueDefinition {
    private long[] tileSrcRect;
    private long color;
    private String id;
    private Long tileId;

    /**
     * An array of 4 Int values that refers to the tile in the tileset image: `[ x, y, width,
     * height ]`
     */
    @JsonProperty("__tileSrcRect")
    public long[] getTileSrcRect() { return tileSrcRect; }
    @JsonProperty("__tileSrcRect")
    public void setTileSrcRect(long[] value) { this.tileSrcRect = value; }

    /**
     * Optional color
     */
    @JsonProperty("color")
    public long getColor() { return color; }
    @JsonProperty("color")
    public void setColor(long value) { this.color = value; }

    /**
     * Enum value
     */
    @JsonProperty("id")
    public String getid() { return id; }
    @JsonProperty("id")
    public void setid(String value) { this.id = value; }

    /**
     * The optional ID of the tile
     */
    @JsonProperty("tileId")
    public Long getTileId() { return tileId; }
    @JsonProperty("tileId")
    public void setTileId(Long value) { this.tileId = value; }
}

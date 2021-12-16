package io.github.joafalves.ldtk.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EnumValueDefinition {
    private List<Long> tileSrcRect;
    private long color;
    private String id;
    private Long tileID;

    /**
     * An array of 4 Int values that refers to the tile in the tileset image: `[ x, y, width,
     * height ]`
     */
    @JsonProperty("__tileSrcRect")
    public List<Long> getTileSrcRect() { return tileSrcRect; }
    @JsonProperty("__tileSrcRect")
    public void setTileSrcRect(List<Long> value) { this.tileSrcRect = value; }

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
    public String getID() { return id; }
    @JsonProperty("id")
    public void setID(String value) { this.id = value; }

    /**
     * The optional ID of the tile
     */
    @JsonProperty("tileId")
    public Long getTileID() { return tileID; }
    @JsonProperty("tileId")
    public void setTileID(Long value) { this.tileID = value; }
}

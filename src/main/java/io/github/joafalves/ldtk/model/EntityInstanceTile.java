package io.github.joafalves.ldtk.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

/**
 * Tile data in an Entity instance
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class EntityInstanceTile {
    private List<Long> srcRect;
    private long tilesetUid;

    /**
     * An array of 4 Int values that refers to the tile in the tileset image: `[ x, y, width,
     * height ]`
     */
    @JsonProperty("srcRect")
    public List<Long> getSrcRect() { return srcRect; }
    @JsonProperty("srcRect")
    public void setSrcRect(List<Long> value) { this.srcRect = value; }

    /**
     * Tileset ID
     */
    @JsonProperty("tilesetUid")
    public long getTilesetUid() { return tilesetUid; }
    @JsonProperty("tilesetUid")
    public void setTilesetUid(long value) { this.tilesetUid = value; }
}

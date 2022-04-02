package io.github.joafalves.ldtk.model;

import com.fasterxml.jackson.annotation.*;

/**
 * In a tileset definition, user defined meta-data of a tile.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TileCustomMetadata {
    private String data;
    private long tileId;

    @JsonProperty("data")
    public String getData() { return data; }
    @JsonProperty("data")
    public void setData(String value) { this.data = value; }

    @JsonProperty("tileId")
    public long getTileId() { return tileId; }
    @JsonProperty("tileId")
    public void setTileId(long value) { this.tileId = value; }
}

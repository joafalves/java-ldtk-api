package io.github.joafalves.ldtk.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

/**
 * This structure represents a single tile from a given Tileset.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TileInstance {
    private List<Long> d;
    private long f;
    private List<Long> px;
    private List<Long> src;
    private long t;

    /**
     * Internal data used by the editor. For auto-layer tiles: `[ruleId, coordId]`.
     * For tile-layer tiles: `[coordId]`.
     */
    @JsonProperty("d")
    public List<Long> getD() { return d; }
    @JsonProperty("d")
    public void setD(List<Long> value) { this.d = value; }

    /**
     * "Flip bits", a 2-bits integer to represent the mirror transformations of the tile.
     * - Bit 0 = X flip - Bit 1 = Y flip. Examples: f=0 (no flip), f=1 (X flip
     * only), f=2 (Y flip only), f=3 (both flips)
     */
    @JsonProperty("f")
    public long getF() { return f; }
    @JsonProperty("f")
    public void setF(long value) { this.f = value; }

    /**
     * Pixel coordinates of the tile in the **layer** (`[x,y]` format). Don't forget optional
     * layer offsets, if they exist!
     */
    @JsonProperty("px")
    public List<Long> getPx() { return px; }
    @JsonProperty("px")
    public void setPx(List<Long> value) { this.px = value; }

    /**
     * Pixel coordinates of the tile in the **tileset** (`[x,y]` format)
     */
    @JsonProperty("src")
    public List<Long> getSrc() { return src; }
    @JsonProperty("src")
    public void setSrc(List<Long> value) { this.src = value; }

    /**
     * The *Tile ID* in the corresponding tileset.
     */
    @JsonProperty("t")
    public long getT() { return t; }
    @JsonProperty("t")
    public void setT(long value) { this.t = value; }
}

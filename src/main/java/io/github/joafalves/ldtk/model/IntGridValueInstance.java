package io.github.joafalves.ldtk.model;

import com.fasterxml.jackson.annotation.*;

/**
 * IntGrid value instance
 */
public class IntGridValueInstance {
    private long coordId;
    private long v;

    /**
     * Coordinate ID in the layer grid
     */
    @JsonProperty("coordId")
    public long getCoordId() { return coordId; }
    @JsonProperty("coordId")
    public void setCoordId(long value) { this.coordId = value; }

    /**
     * IntGrid value
     */
    @JsonProperty("v")
    public long getV() { return v; }
    @JsonProperty("v")
    public void setV(long value) { this.v = value; }
}

package io.github.joafalves.ldtk.model;

import com.fasterxml.jackson.annotation.*;

/**
 * Nearby level info
 */
public class NeighbourLevel {
    private String dir;
    private String levelIid;
    private Long levelUid;

    /**
     * A single lowercase character tipping on the level location (`n`orth, `s`outh, `w`est,
     * `e`ast).
     */
    @JsonProperty("dir")
    public String getDir() { return dir; }
    @JsonProperty("dir")
    public void setDir(String value) { this.dir = value; }

    /**
     * Neighbour Instance Identifier
     */
    @JsonProperty("levelIid")
    public String getLevelIid() { return levelIid; }
    @JsonProperty("levelIid")
    public void setLevelIid(String value) { this.levelIid = value; }

    /**
     * **WARNING**: this deprecated value will be *removed* completely on version 1.2.0+
     * Replaced by: `levelIid`
     */
    @JsonProperty("levelUid")
    public Long getLevelUid() { return levelUid; }
    @JsonProperty("levelUid")
    public void setLevelUid(Long value) { this.levelUid = value; }
}

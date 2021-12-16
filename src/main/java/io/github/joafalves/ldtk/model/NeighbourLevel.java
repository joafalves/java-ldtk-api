package io.github.joafalves.ldtk.model;

import com.fasterxml.jackson.annotation.*;

/**
 * Nearby level info
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class NeighbourLevel {
    private String dir;
    private long levelUid;

    /**
     * A single lowercase character tipping on the level location (`n`orth, `s`outh, `w`est,
     * `e`ast).
     */
    @JsonProperty("dir")
    public String getDir() { return dir; }
    @JsonProperty("dir")
    public void setDir(String value) { this.dir = value; }

    @JsonProperty("levelUid")
    public long getLevelUid() { return levelUid; }
    @JsonProperty("levelUid")
    public void setLevelUid(long value) { this.levelUid = value; }
}

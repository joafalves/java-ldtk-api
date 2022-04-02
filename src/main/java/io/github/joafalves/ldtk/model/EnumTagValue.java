package io.github.joafalves.ldtk.model;

import com.fasterxml.jackson.annotation.*;

/**
 * In a tileset definition, enum based tag infos
 */
public class EnumTagValue {
    private String enumValueId;
    private long[] tileIds;

    @JsonProperty("enumValueId")
    public String getEnumValueId() { return enumValueId; }
    @JsonProperty("enumValueId")
    public void setEnumValueId(String value) { this.enumValueId = value; }

    @JsonProperty("tileIds")
    public long[] getTileIds() { return tileIds; }
    @JsonProperty("tileIds")
    public void setTileIds(long[] value) { this.tileIds = value; }
}

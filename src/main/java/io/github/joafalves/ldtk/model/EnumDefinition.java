package io.github.joafalves.ldtk.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EnumDefinition {
    private String externalFileChecksum;
    private String externalRelPath;
    private Long iconTilesetUid;
    private String identifier;
    private long uid;
    private List<EnumValueDefinition> values;

    @JsonProperty("externalFileChecksum")
    public String getExternalFileChecksum() { return externalFileChecksum; }
    @JsonProperty("externalFileChecksum")
    public void setExternalFileChecksum(String value) { this.externalFileChecksum = value; }

    /**
     * Relative path to the external file providing this Enum
     */
    @JsonProperty("externalRelPath")
    public String getExternalRelPath() { return externalRelPath; }
    @JsonProperty("externalRelPath")
    public void setExternalRelPath(String value) { this.externalRelPath = value; }

    /**
     * Tileset UID if provided
     */
    @JsonProperty("iconTilesetUid")
    public Long getIconTilesetUid() { return iconTilesetUid; }
    @JsonProperty("iconTilesetUid")
    public void setIconTilesetUid(Long value) { this.iconTilesetUid = value; }

    /**
     * Unique String identifier
     */
    @JsonProperty("identifier")
    public String getIdentifier() { return identifier; }
    @JsonProperty("identifier")
    public void setIdentifier(String value) { this.identifier = value; }

    /**
     * Unique Int identifier
     */
    @JsonProperty("uid")
    public long getUid() { return uid; }
    @JsonProperty("uid")
    public void setUid(long value) { this.uid = value; }

    /**
     * All possible enum values, with their optional Tile infos.
     */
    @JsonProperty("values")
    public List<EnumValueDefinition> getValues() { return values; }
    @JsonProperty("values")
    public void setValues(List<EnumValueDefinition> value) { this.values = value; }
}

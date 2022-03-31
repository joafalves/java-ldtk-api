package io.github.joafalves.ldtk.model;

import com.fasterxml.jackson.annotation.*;

/**
 * This object is used in Field Instances to describe an EntityRef value.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class FieldInstanceEntityReference {
    private String entityIid;
    private String layerIid;
    private String levelIid;
    private String worldIid;

    /**
     * IID of the refered EntityInstance
     */
    @JsonProperty("entityIid")
    public String getEntityIid() { return entityIid; }
    @JsonProperty("entityIid")
    public void setEntityIid(String value) { this.entityIid = value; }

    /**
     * IID of the LayerInstance containing the refered EntityInstance
     */
    @JsonProperty("layerIid")
    public String getLayerIid() { return layerIid; }
    @JsonProperty("layerIid")
    public void setLayerIid(String value) { this.layerIid = value; }

    /**
     * IID of the Level containing the refered EntityInstance
     */
    @JsonProperty("levelIid")
    public String getLevelIid() { return levelIid; }
    @JsonProperty("levelIid")
    public void setLevelIid(String value) { this.levelIid = value; }

    /**
     * IID of the World containing the refered EntityInstance
     */
    @JsonProperty("worldIid")
    public String getWorldIid() { return worldIid; }
    @JsonProperty("worldIid")
    public void setWorldIid(String value) { this.worldIid = value; }
}

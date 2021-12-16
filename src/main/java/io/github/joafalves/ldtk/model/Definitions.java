package io.github.joafalves.ldtk.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

/**
 * A structure containing all the definitions of this project
 *
 * If you're writing your own LDtk importer, you should probably just ignore *most* stuff in
 * the `defs` section, as it contains data that are mostly important to the editor. To keep
 * you away from the `defs` section and avoid some unnecessary JSON parsing, important data
 * from definitions is often duplicated in fields prefixed with a double underscore (eg.
 * `__identifier` or `__type`).  The 2 only definition types you might need here are
 * **Tilesets** and **Enums**.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Definitions {
    private List<EntityDefinition> entities;
    private List<EnumDefinition> enums;
    private List<EnumDefinition> externalEnums;
    private List<LayerDefinition> layers;
    private List<FieldDefinition> levelFields;
    private List<TilesetDefinition> tilesets;

    /**
     * All entities definitions, including their custom fields
     */
    @JsonProperty("entities")
    public List<EntityDefinition> getEntities() { return entities; }
    @JsonProperty("entities")
    public void setEntities(List<EntityDefinition> value) { this.entities = value; }

    /**
     * All internal enums
     */
    @JsonProperty("enums")
    public List<EnumDefinition> getEnums() { return enums; }
    @JsonProperty("enums")
    public void setEnums(List<EnumDefinition> value) { this.enums = value; }

    /**
     * Note: external enums are exactly the same as `enums`, except they have a `relPath` to
     * point to an external source file.
     */
    @JsonProperty("externalEnums")
    public List<EnumDefinition> getExternalEnums() { return externalEnums; }
    @JsonProperty("externalEnums")
    public void setExternalEnums(List<EnumDefinition> value) { this.externalEnums = value; }

    /**
     * All layer definitions
     */
    @JsonProperty("layers")
    public List<LayerDefinition> getLayers() { return layers; }
    @JsonProperty("layers")
    public void setLayers(List<LayerDefinition> value) { this.layers = value; }

    /**
     * All custom fields available to all levels.
     */
    @JsonProperty("levelFields")
    public List<FieldDefinition> getLevelFields() { return levelFields; }
    @JsonProperty("levelFields")
    public void setLevelFields(List<FieldDefinition> value) { this.levelFields = value; }

    /**
     * All tilesets
     */
    @JsonProperty("tilesets")
    public List<TilesetDefinition> getTilesets() { return tilesets; }
    @JsonProperty("tilesets")
    public void setTilesets(List<TilesetDefinition> value) { this.tilesets = value; }
}

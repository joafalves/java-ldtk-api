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
@lombok.Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Definitions {
    @lombok.Getter(onMethod_ = {@JsonProperty("entities")})
    @lombok.Setter(onMethod_ = {@JsonProperty("entities")})
    private List<EntityDefinition> entities;
    @lombok.Getter(onMethod_ = {@JsonProperty("enums")})
    @lombok.Setter(onMethod_ = {@JsonProperty("enums")})
    private List<EnumDefinition> enums;
    @lombok.Getter(onMethod_ = {@JsonProperty("externalEnums")})
    @lombok.Setter(onMethod_ = {@JsonProperty("externalEnums")})
    private List<EnumDefinition> externalEnums;
    @lombok.Getter(onMethod_ = {@JsonProperty("layers")})
    @lombok.Setter(onMethod_ = {@JsonProperty("layers")})
    private List<LayerDefinition> layers;
    @lombok.Getter(onMethod_ = {@JsonProperty("levelFields")})
    @lombok.Setter(onMethod_ = {@JsonProperty("levelFields")})
    private List<FieldDefinition> levelFields;
    @lombok.Getter(onMethod_ = {@JsonProperty("tilesets")})
    @lombok.Setter(onMethod_ = {@JsonProperty("tilesets")})
    private List<TilesetDefinition> tilesets;
}

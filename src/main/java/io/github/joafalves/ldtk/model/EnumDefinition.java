package io.github.joafalves.ldtk.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@lombok.Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class EnumDefinition {
    @lombok.Getter(onMethod_ = {@JsonProperty("externalFileChecksum")})
    @lombok.Setter(onMethod_ = {@JsonProperty("externalFileChecksum")})
    private String externalFileChecksum;
    @lombok.Getter(onMethod_ = {@JsonProperty("externalRelPath")})
    @lombok.Setter(onMethod_ = {@JsonProperty("externalRelPath")})
    private String externalRelPath;
    @lombok.Getter(onMethod_ = {@JsonProperty("iconTilesetUid")})
    @lombok.Setter(onMethod_ = {@JsonProperty("iconTilesetUid")})
    private Long iconTilesetUid;
    @lombok.Getter(onMethod_ = {@JsonProperty("identifier")})
    @lombok.Setter(onMethod_ = {@JsonProperty("identifier")})
    private String identifier;
    @lombok.Getter(onMethod_ = {@JsonProperty("uid")})
    @lombok.Setter(onMethod_ = {@JsonProperty("uid")})
    private long uid;
    @lombok.Getter(onMethod_ = {@JsonProperty("values")})
    @lombok.Setter(onMethod_ = {@JsonProperty("values")})
    private List<EnumValueDefinition> values;
}

package io.github.joafalves.ldtk.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@lombok.Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AutoLayerRuleGroup {
    @lombok.Getter(onMethod_ = {@JsonProperty("active")})
    @lombok.Setter(onMethod_ = {@JsonProperty("active")})
    private boolean active;
    @lombok.Getter(onMethod_ = {@JsonProperty("collapsed")})
    @lombok.Setter(onMethod_ = {@JsonProperty("collapsed")})
    private boolean collapsed;
    @lombok.Getter(onMethod_ = {@JsonProperty("isOptional")})
    @lombok.Setter(onMethod_ = {@JsonProperty("isOptional")})
    private boolean isOptional;
    @lombok.Getter(onMethod_ = {@JsonProperty("name")})
    @lombok.Setter(onMethod_ = {@JsonProperty("name")})
    private String name;
    @lombok.Getter(onMethod_ = {@JsonProperty("rules")})
    @lombok.Setter(onMethod_ = {@JsonProperty("rules")})
    private List<AutoLayerRuleDefinition> rules;
    @lombok.Getter(onMethod_ = {@JsonProperty("uid")})
    @lombok.Setter(onMethod_ = {@JsonProperty("uid")})
    private long uid;
}

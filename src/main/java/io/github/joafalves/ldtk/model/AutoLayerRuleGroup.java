package io.github.joafalves.ldtk.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AutoLayerRuleGroup {
    private boolean active;
    private boolean collapsed;
    private boolean isOptional;
    private String name;
    private List<AutoLayerRuleDefinition> rules;
    private long uid;

    @JsonProperty("active")
    public boolean getActive() { return active; }
    @JsonProperty("active")
    public void setActive(boolean value) { this.active = value; }

    @JsonProperty("collapsed")
    public boolean getCollapsed() { return collapsed; }
    @JsonProperty("collapsed")
    public void setCollapsed(boolean value) { this.collapsed = value; }

    @JsonProperty("isOptional")
    public boolean getIsOptional() { return isOptional; }
    @JsonProperty("isOptional")
    public void setIsOptional(boolean value) { this.isOptional = value; }

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("rules")
    public List<AutoLayerRuleDefinition> getRules() { return rules; }
    @JsonProperty("rules")
    public void setRules(List<AutoLayerRuleDefinition> value) { this.rules = value; }

    @JsonProperty("uid")
    public long getUid() { return uid; }
    @JsonProperty("uid")
    public void setUid(long value) { this.uid = value; }
}

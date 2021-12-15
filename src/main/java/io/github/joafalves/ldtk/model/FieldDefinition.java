package io.github.joafalves.ldtk.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

/**
 * This section is mostly only intended for the LDtk editor app itself. You can safely
 * ignore it.
 */
@lombok.Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class FieldDefinition {
    @lombok.Getter(onMethod_ = {@JsonProperty("__type")})
    @lombok.Setter(onMethod_ = {@JsonProperty("__type")})
    private String type;
    @lombok.Getter(onMethod_ = {@JsonProperty("acceptFileTypes")})
    @lombok.Setter(onMethod_ = {@JsonProperty("acceptFileTypes")})
    private List<String> acceptFileTypes;
    @lombok.Getter(onMethod_ = {@JsonProperty("arrayMaxLength")})
    @lombok.Setter(onMethod_ = {@JsonProperty("arrayMaxLength")})
    private Long arrayMaxLength;
    @lombok.Getter(onMethod_ = {@JsonProperty("arrayMinLength")})
    @lombok.Setter(onMethod_ = {@JsonProperty("arrayMinLength")})
    private Long arrayMinLength;
    @lombok.Getter(onMethod_ = {@JsonProperty("canBeNull")})
    @lombok.Setter(onMethod_ = {@JsonProperty("canBeNull")})
    private boolean canBeNull;
    @lombok.Getter(onMethod_ = {@JsonProperty("defaultOverride")})
    @lombok.Setter(onMethod_ = {@JsonProperty("defaultOverride")})
    private Object defaultOverride;
    @lombok.Getter(onMethod_ = {@JsonProperty("editorAlwaysShow")})
    @lombok.Setter(onMethod_ = {@JsonProperty("editorAlwaysShow")})
    private boolean editorAlwaysShow;
    @lombok.Getter(onMethod_ = {@JsonProperty("editorCutLongValues")})
    @lombok.Setter(onMethod_ = {@JsonProperty("editorCutLongValues")})
    private boolean editorCutLongValues;
    @lombok.Getter(onMethod_ = {@JsonProperty("editorDisplayMode")})
    @lombok.Setter(onMethod_ = {@JsonProperty("editorDisplayMode")})
    private EditorDisplayMode editorDisplayMode;
    @lombok.Getter(onMethod_ = {@JsonProperty("editorDisplayPos")})
    @lombok.Setter(onMethod_ = {@JsonProperty("editorDisplayPos")})
    private EditorDisplayPos editorDisplayPos;
    @lombok.Getter(onMethod_ = {@JsonProperty("identifier")})
    @lombok.Setter(onMethod_ = {@JsonProperty("identifier")})
    private String identifier;
    @lombok.Getter(onMethod_ = {@JsonProperty("isArray")})
    @lombok.Setter(onMethod_ = {@JsonProperty("isArray")})
    private boolean isArray;
    @lombok.Getter(onMethod_ = {@JsonProperty("max")})
    @lombok.Setter(onMethod_ = {@JsonProperty("max")})
    private Double max;
    @lombok.Getter(onMethod_ = {@JsonProperty("min")})
    @lombok.Setter(onMethod_ = {@JsonProperty("min")})
    private Double min;
    @lombok.Getter(onMethod_ = {@JsonProperty("regex")})
    @lombok.Setter(onMethod_ = {@JsonProperty("regex")})
    private String regex;
    @lombok.Getter(onMethod_ = {@JsonProperty("textLanguageMode")})
    @lombok.Setter(onMethod_ = {@JsonProperty("textLanguageMode")})
    private TextLanguageMode textLanguageMode;
    @lombok.Getter(onMethod_ = {@JsonProperty("type")})
    @lombok.Setter(onMethod_ = {@JsonProperty("type")})
    private Object fieldDefinitionType;
    @lombok.Getter(onMethod_ = {@JsonProperty("uid")})
    @lombok.Setter(onMethod_ = {@JsonProperty("uid")})
    private long uid;
}

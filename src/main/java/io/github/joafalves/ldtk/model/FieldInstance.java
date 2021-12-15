package io.github.joafalves.ldtk.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@lombok.Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class FieldInstance {
    @lombok.Getter(onMethod_ = {@JsonProperty("__identifier")})
    @lombok.Setter(onMethod_ = {@JsonProperty("__identifier")})
    private String identifier;
    @lombok.Getter(onMethod_ = {@JsonProperty("__type")})
    @lombok.Setter(onMethod_ = {@JsonProperty("__type")})
    private String type;
    @lombok.Getter(onMethod_ = {@JsonProperty("__value")})
    @lombok.Setter(onMethod_ = {@JsonProperty("__value")})
    private Object value;
    @lombok.Getter(onMethod_ = {@JsonProperty("defUid")})
    @lombok.Setter(onMethod_ = {@JsonProperty("defUid")})
    private long defUid;
    @lombok.Getter(onMethod_ = {@JsonProperty("realEditorValues")})
    @lombok.Setter(onMethod_ = {@JsonProperty("realEditorValues")})
    private List<Object> realEditorValues;
}

package io.github.joafalves.ldtk.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FieldInstance {
    private String identifier;
    private String type;
    private Object value;
    private long defUid;
    private List<Object> realEditorValues;

    /**
     * Field definition identifier
     */
    @JsonProperty("__identifier")
    public String getIdentifier() { return identifier; }
    @JsonProperty("__identifier")
    public void setIdentifier(String value) { this.identifier = value; }

    /**
     * Type of the field, such as `Int`, `Float`, `Enum(my_enum_name)`, `Bool`, etc.
     */
    @JsonProperty("__type")
    public String getType() { return type; }
    @JsonProperty("__type")
    public void setType(String value) { this.type = value; }

    /**
     * Actual value of the field instance. The value type may vary, depending on `__type`
     * (Integer, Boolean, String etc.).  It can also be an `Array` of those same types.
     */
    @JsonProperty("__value")
    public Object getValue() { return value; }
    @JsonProperty("__value")
    public void setValue(Object value) { this.value = value; }

    /**
     * Reference of the **Field definition** UID
     */
    @JsonProperty("defUid")
    public long getDefUid() { return defUid; }
    @JsonProperty("defUid")
    public void setDefUid(long value) { this.defUid = value; }

    /**
     * Editor internal raw values
     */
    @JsonProperty("realEditorValues")
    public List<Object> getRealEditorValues() { return realEditorValues; }
    @JsonProperty("realEditorValues")
    public void setRealEditorValues(List<Object> value) { this.realEditorValues = value; }
}

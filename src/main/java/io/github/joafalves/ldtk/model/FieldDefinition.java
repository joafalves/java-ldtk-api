package io.github.joafalves.ldtk.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

/**
 * This section is mostly only intended for the LDtk editor app itself. You can safely
 * ignore it.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class FieldDefinition {
    private String type;
    private List<String> acceptFileTypes;
    private Long arrayMaxLength;
    private Long arrayMinLength;
    private boolean canBeNull;
    private Object defaultOverride;
    private boolean editorAlwaysShow;
    private boolean editorCutLongValues;
    private EditorDisplayMode editorDisplayMode;
    private EditorDisplayPos editorDisplayPos;
    private String identifier;
    private boolean isArray;
    private Double max;
    private Double min;
    private String regex;
    private TextLanguageMode textLanguageMode;
    private Object fieldDefinitionType;
    private long uid;

    /**
     * Human readable value type (eg. `Int`, `Float`, `Point`, etc.). If the field is an array,
     * this field will look like `Array` (eg. `Array`, `Array` etc.)
     */
    @JsonProperty("__type")
    public String getType() { return type; }
    @JsonProperty("__type")
    public void setType(String value) { this.type = value; }

    /**
     * Optional list of accepted file extensions for FilePath value type. Includes the dot:
     * `.ext`
     */
    @JsonProperty("acceptFileTypes")
    public List<String> getAcceptFileTypes() { return acceptFileTypes; }
    @JsonProperty("acceptFileTypes")
    public void setAcceptFileTypes(List<String> value) { this.acceptFileTypes = value; }

    /**
     * Array max length
     */
    @JsonProperty("arrayMaxLength")
    public Long getArrayMaxLength() { return arrayMaxLength; }
    @JsonProperty("arrayMaxLength")
    public void setArrayMaxLength(Long value) { this.arrayMaxLength = value; }

    /**
     * Array min length
     */
    @JsonProperty("arrayMinLength")
    public Long getArrayMinLength() { return arrayMinLength; }
    @JsonProperty("arrayMinLength")
    public void setArrayMinLength(Long value) { this.arrayMinLength = value; }

    /**
     * TRUE if the value can be null. For arrays, TRUE means it can contain null values
     * (exception: array of Points can't have null values).
     */
    @JsonProperty("canBeNull")
    public boolean getCanBeNull() { return canBeNull; }
    @JsonProperty("canBeNull")
    public void setCanBeNull(boolean value) { this.canBeNull = value; }

    /**
     * Default value if selected value is null or invalid.
     */
    @JsonProperty("defaultOverride")
    public Object getDefaultOverride() { return defaultOverride; }
    @JsonProperty("defaultOverride")
    public void setDefaultOverride(Object value) { this.defaultOverride = value; }

    @JsonProperty("editorAlwaysShow")
    public boolean getEditorAlwaysShow() { return editorAlwaysShow; }
    @JsonProperty("editorAlwaysShow")
    public void setEditorAlwaysShow(boolean value) { this.editorAlwaysShow = value; }

    @JsonProperty("editorCutLongValues")
    public boolean getEditorCutLongValues() { return editorCutLongValues; }
    @JsonProperty("editorCutLongValues")
    public void setEditorCutLongValues(boolean value) { this.editorCutLongValues = value; }

    /**
     * Possible values: `Hidden`, `ValueOnly`, `NameAndValue`, `EntityTile`, `Points`,
     * `PointStar`, `PointPath`, `PointPathLoop`, `RadiusPx`, `RadiusGrid`
     */
    @JsonProperty("editorDisplayMode")
    public EditorDisplayMode getEditorDisplayMode() { return editorDisplayMode; }
    @JsonProperty("editorDisplayMode")
    public void setEditorDisplayMode(EditorDisplayMode value) { this.editorDisplayMode = value; }

    /**
     * Possible values: `Above`, `Center`, `Beneath`
     */
    @JsonProperty("editorDisplayPos")
    public EditorDisplayPos getEditorDisplayPos() { return editorDisplayPos; }
    @JsonProperty("editorDisplayPos")
    public void setEditorDisplayPos(EditorDisplayPos value) { this.editorDisplayPos = value; }

    /**
     * Unique String identifier
     */
    @JsonProperty("identifier")
    public String getIdentifier() { return identifier; }
    @JsonProperty("identifier")
    public void setIdentifier(String value) { this.identifier = value; }

    /**
     * TRUE if the value is an array of multiple values
     */
    @JsonProperty("isArray")
    public boolean getIsArray() { return isArray; }
    @JsonProperty("isArray")
    public void setIsArray(boolean value) { this.isArray = value; }

    /**
     * Max limit for value, if applicable
     */
    @JsonProperty("max")
    public Double getMax() { return max; }
    @JsonProperty("max")
    public void setMax(Double value) { this.max = value; }

    /**
     * Min limit for value, if applicable
     */
    @JsonProperty("min")
    public Double getMin() { return min; }
    @JsonProperty("min")
    public void setMin(Double value) { this.min = value; }

    /**
     * Optional regular expression that needs to be matched to accept values. Expected format:
     * `/some_reg_ex/g`, with optional "i" flag.
     */
    @JsonProperty("regex")
    public String getRegex() { return regex; }
    @JsonProperty("regex")
    public void setRegex(String value) { this.regex = value; }

    /**
     * Possible values: &lt;`null`&gt;, `LangPython`, `LangRuby`, `LangJS`, `LangLua`, `LangC`,
     * `LangHaxe`, `LangMarkdown`, `LangJson`, `LangXml`
     */
    @JsonProperty("textLanguageMode")
    public TextLanguageMode getTextLanguageMode() { return textLanguageMode; }
    @JsonProperty("textLanguageMode")
    public void setTextLanguageMode(TextLanguageMode value) { this.textLanguageMode = value; }

    /**
     * Internal type enum
     */
    @JsonProperty("type")
    public Object getFieldDefinitionType() { return fieldDefinitionType; }
    @JsonProperty("type")
    public void setFieldDefinitionType(Object value) { this.fieldDefinitionType = value; }

    /**
     * Unique Int identifier
     */
    @JsonProperty("uid")
    public long getUid() { return uid; }
    @JsonProperty("uid")
    public void setUid(long value) { this.uid = value; }
}

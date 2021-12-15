package io.github.joafalves.ldtk.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

/**
 * This file is a JSON schema of files created by LDtk level editor (https://ldtk.io).
 * <p>
 * This is the root of any Project JSON file. It contains:  - the project settings, - an array of levels, - a group of
 * definitions (that can probably be safely ignored for most users).
 */
@lombok.Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Project {

    @lombok.Getter(onMethod_ = {@JsonProperty("backupLimit")})
    @lombok.Setter(onMethod_ = {@JsonProperty("backupLimit")})
    private long backupLimit;
    @lombok.Getter(onMethod_ = {@JsonProperty("backupOnSave")})
    @lombok.Setter(onMethod_ = {@JsonProperty("backupOnSave")})
    private boolean backupOnSave;
    @lombok.Getter(onMethod_ = {@JsonProperty("bgColor")})
    @lombok.Setter(onMethod_ = {@JsonProperty("bgColor")})
    private String bgColor;
    @lombok.Getter(onMethod_ = {@JsonProperty("defaultGridSize")})
    @lombok.Setter(onMethod_ = {@JsonProperty("defaultGridSize")})
    private long defaultGridSize;
    @lombok.Getter(onMethod_ = {@JsonProperty("defaultLevelBgColor")})
    @lombok.Setter(onMethod_ = {@JsonProperty("defaultLevelBgColor")})
    private String defaultLevelBgColor;
    @lombok.Getter(onMethod_ = {@JsonProperty("defaultLevelHeight")})
    @lombok.Setter(onMethod_ = {@JsonProperty("defaultLevelHeight")})
    private long defaultLevelHeight;
    @lombok.Getter(onMethod_ = {@JsonProperty("defaultLevelWidth")})
    @lombok.Setter(onMethod_ = {@JsonProperty("defaultLevelWidth")})
    private long defaultLevelWidth;
    @lombok.Getter(onMethod_ = {@JsonProperty("defaultPivotX")})
    @lombok.Setter(onMethod_ = {@JsonProperty("defaultPivotX")})
    private double defaultPivotX;
    @lombok.Getter(onMethod_ = {@JsonProperty("defaultPivotY")})
    @lombok.Setter(onMethod_ = {@JsonProperty("defaultPivotY")})
    private double defaultPivotY;
    @lombok.Getter(onMethod_ = {@JsonProperty("defs")})
    @lombok.Setter(onMethod_ = {@JsonProperty("defs")})
    private Definitions defs;
    @lombok.Getter(onMethod_ = {@JsonProperty("exportPng")})
    @lombok.Setter(onMethod_ = {@JsonProperty("exportPng")})
    private Boolean exportPNG;
    @lombok.Getter(onMethod_ = {@JsonProperty("exportTiled")})
    @lombok.Setter(onMethod_ = {@JsonProperty("exportTiled")})
    private boolean exportTiled;
    @lombok.Getter(onMethod_ = {@JsonProperty("externalLevels")})
    @lombok.Setter(onMethod_ = {@JsonProperty("externalLevels")})
    private boolean externalLevels;
    @lombok.Getter(onMethod_ = {@JsonProperty("flags")})
    @lombok.Setter(onMethod_ = {@JsonProperty("flags")})
    private List<Flag> flags;
    @lombok.Getter(onMethod_ = {@JsonProperty("imageExportMode")})
    @lombok.Setter(onMethod_ = {@JsonProperty("imageExportMode")})
    private ImageExportMode imageExportMode;
    @lombok.Getter(onMethod_ = {@JsonProperty("jsonVersion")})
    @lombok.Setter(onMethod_ = {@JsonProperty("jsonVersion")})
    private String jsonVersion;
    @lombok.Getter(onMethod_ = {@JsonProperty("levelNamePattern")})
    @lombok.Setter(onMethod_ = {@JsonProperty("levelNamePattern")})
    private String levelNamePattern;
    @lombok.Getter(onMethod_ = {@JsonProperty("levels")})
    @lombok.Setter(onMethod_ = {@JsonProperty("levels")})
    private List<Level> levels;
    @lombok.Getter(onMethod_ = {@JsonProperty("minifyJson")})
    @lombok.Setter(onMethod_ = {@JsonProperty("minifyJson")})
    private boolean minifyJSON;
    @lombok.Getter(onMethod_ = {@JsonProperty("nextUid")})
    @lombok.Setter(onMethod_ = {@JsonProperty("nextUid")})
    private long nextUid;
    @lombok.Getter(onMethod_ = {@JsonProperty("pngFilePattern")})
    @lombok.Setter(onMethod_ = {@JsonProperty("pngFilePattern")})
    private String pngFilePattern;
    @lombok.Getter(onMethod_ = {@JsonProperty("worldGridHeight")})
    @lombok.Setter(onMethod_ = {@JsonProperty("worldGridHeight")})
    private long worldGridHeight;
    @lombok.Getter(onMethod_ = {@JsonProperty("worldGridWidth")})
    @lombok.Setter(onMethod_ = {@JsonProperty("worldGridWidth")})
    private long worldGridWidth;
    @lombok.Getter(onMethod_ = {@JsonProperty("worldLayout")})
    @lombok.Setter(onMethod_ = {@JsonProperty("worldLayout")})
    private WorldLayout worldLayout;
}

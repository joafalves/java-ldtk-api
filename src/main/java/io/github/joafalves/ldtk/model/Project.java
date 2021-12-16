package io.github.joafalves.ldtk.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

/**
 * This file is a JSON schema of files created by LDtk level editor (https://ldtk.io).
 *
 * This is the root of any Project JSON file. It contains:  - the project settings, - an
 * array of levels, - a group of definitions (that can probably be safely ignored for most
 * users).
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Project {
    private long backupLimit;
    private boolean backupOnSave;
    private String bgColor;
    private long defaultGridSize;
    private String defaultLevelBgColor;
    private long defaultLevelHeight;
    private long defaultLevelWidth;
    private double defaultPivotX;
    private double defaultPivotY;
    private Definitions defs;
    private Boolean exportPNG;
    private boolean exportTiled;
    private boolean externalLevels;
    private List<Flag> flags;
    private ImageExportMode imageExportMode;
    private String jsonVersion;
    private String levelNamePattern;
    private List<Level> levels;
    private boolean minifyJSON;
    private long nextUid;
    private String pngFilePattern;
    private long worldGridHeight;
    private long worldGridWidth;
    private WorldLayout worldLayout;

    /**
     * Number of backup files to keep, if the `backupOnSave` is TRUE
     */
    @JsonProperty("backupLimit")
    public long getBackupLimit() { return backupLimit; }
    @JsonProperty("backupLimit")
    public void setBackupLimit(long value) { this.backupLimit = value; }

    /**
     * If TRUE, an extra copy of the project will be created in a sub folder, when saving.
     */
    @JsonProperty("backupOnSave")
    public boolean getBackupOnSave() { return backupOnSave; }
    @JsonProperty("backupOnSave")
    public void setBackupOnSave(boolean value) { this.backupOnSave = value; }

    /**
     * Project background color
     */
    @JsonProperty("bgColor")
    public String getBgColor() { return bgColor; }
    @JsonProperty("bgColor")
    public void setBgColor(String value) { this.bgColor = value; }

    /**
     * Default grid size for new layers
     */
    @JsonProperty("defaultGridSize")
    public long getDefaultGridSize() { return defaultGridSize; }
    @JsonProperty("defaultGridSize")
    public void setDefaultGridSize(long value) { this.defaultGridSize = value; }

    /**
     * Default background color of levels
     */
    @JsonProperty("defaultLevelBgColor")
    public String getDefaultLevelBgColor() { return defaultLevelBgColor; }
    @JsonProperty("defaultLevelBgColor")
    public void setDefaultLevelBgColor(String value) { this.defaultLevelBgColor = value; }

    /**
     * Default new level height
     */
    @JsonProperty("defaultLevelHeight")
    public long getDefaultLevelHeight() { return defaultLevelHeight; }
    @JsonProperty("defaultLevelHeight")
    public void setDefaultLevelHeight(long value) { this.defaultLevelHeight = value; }

    /**
     * Default new level width
     */
    @JsonProperty("defaultLevelWidth")
    public long getDefaultLevelWidth() { return defaultLevelWidth; }
    @JsonProperty("defaultLevelWidth")
    public void setDefaultLevelWidth(long value) { this.defaultLevelWidth = value; }

    /**
     * Default X pivot (0 to 1) for new entities
     */
    @JsonProperty("defaultPivotX")
    public double getDefaultPivotX() { return defaultPivotX; }
    @JsonProperty("defaultPivotX")
    public void setDefaultPivotX(double value) { this.defaultPivotX = value; }

    /**
     * Default Y pivot (0 to 1) for new entities
     */
    @JsonProperty("defaultPivotY")
    public double getDefaultPivotY() { return defaultPivotY; }
    @JsonProperty("defaultPivotY")
    public void setDefaultPivotY(double value) { this.defaultPivotY = value; }

    /**
     * A structure containing all the definitions of this project
     */
    @JsonProperty("defs")
    public Definitions getDefs() { return defs; }
    @JsonProperty("defs")
    public void setDefs(Definitions value) { this.defs = value; }

    /**
     * **WARNING**: this deprecated value is no longer exported since version 0.9.3  Replaced
     * by: `imageExportMode`
     */
    @JsonProperty("exportPng")
    public Boolean getExportPNG() { return exportPNG; }
    @JsonProperty("exportPng")
    public void setExportPNG(Boolean value) { this.exportPNG = value; }

    /**
     * If TRUE, a Tiled compatible file will also be generated along with the LDtk JSON file
     * (default is FALSE)
     */
    @JsonProperty("exportTiled")
    public boolean getExportTiled() { return exportTiled; }
    @JsonProperty("exportTiled")
    public void setExportTiled(boolean value) { this.exportTiled = value; }

    /**
     * If TRUE, one file will be saved for the project (incl. all its definitions) and one file
     * in a sub-folder for each level.
     */
    @JsonProperty("externalLevels")
    public boolean getExternalLevels() { return externalLevels; }
    @JsonProperty("externalLevels")
    public void setExternalLevels(boolean value) { this.externalLevels = value; }

    /**
     * An array containing various advanced flags (ie. options or other states). Possible
     * values: `DiscardPreCsvIntGrid`, `IgnoreBackupSuggest`
     */
    @JsonProperty("flags")
    public List<Flag> getFlags() { return flags; }
    @JsonProperty("flags")
    public void setFlags(List<Flag> value) { this.flags = value; }

    /**
     * "Image export" option when saving project. Possible values: `None`, `OneImagePerLayer`,
     * `OneImagePerLevel`
     */
    @JsonProperty("imageExportMode")
    public ImageExportMode getImageExportMode() { return imageExportMode; }
    @JsonProperty("imageExportMode")
    public void setImageExportMode(ImageExportMode value) { this.imageExportMode = value; }

    /**
     * File format version
     */
    @JsonProperty("jsonVersion")
    public String getJSONVersion() { return jsonVersion; }
    @JsonProperty("jsonVersion")
    public void setJSONVersion(String value) { this.jsonVersion = value; }

    /**
     * The default naming convention for level identifiers.
     */
    @JsonProperty("levelNamePattern")
    public String getLevelNamePattern() { return levelNamePattern; }
    @JsonProperty("levelNamePattern")
    public void setLevelNamePattern(String value) { this.levelNamePattern = value; }

    /**
     * All levels. The order of this array is only relevant in `LinearHorizontal` and
     * `linearVertical` world layouts (see `worldLayout` value). Otherwise, you should refer to
     * the `worldX`,`worldY` coordinates of each Level.
     */
    @JsonProperty("levels")
    public List<Level> getLevels() { return levels; }
    @JsonProperty("levels")
    public void setLevels(List<Level> value) { this.levels = value; }

    /**
     * If TRUE, the Json is partially minified (no indentation, nor line breaks, default is
     * FALSE)
     */
    @JsonProperty("minifyJson")
    public boolean getMinifyJSON() { return minifyJSON; }
    @JsonProperty("minifyJson")
    public void setMinifyJSON(boolean value) { this.minifyJSON = value; }

    /**
     * Next Unique integer ID available
     */
    @JsonProperty("nextUid")
    public long getNextUid() { return nextUid; }
    @JsonProperty("nextUid")
    public void setNextUid(long value) { this.nextUid = value; }

    /**
     * File naming pattern for exported PNGs
     */
    @JsonProperty("pngFilePattern")
    public String getPNGFilePattern() { return pngFilePattern; }
    @JsonProperty("pngFilePattern")
    public void setPNGFilePattern(String value) { this.pngFilePattern = value; }

    /**
     * Height of the world grid in pixels.
     */
    @JsonProperty("worldGridHeight")
    public long getWorldGridHeight() { return worldGridHeight; }
    @JsonProperty("worldGridHeight")
    public void setWorldGridHeight(long value) { this.worldGridHeight = value; }

    /**
     * Width of the world grid in pixels.
     */
    @JsonProperty("worldGridWidth")
    public long getWorldGridWidth() { return worldGridWidth; }
    @JsonProperty("worldGridWidth")
    public void setWorldGridWidth(long value) { this.worldGridWidth = value; }

    /**
     * An enum that describes how levels are organized in this project (ie. linearly or in a 2D
     * space). Possible values: `Free`, `GridVania`, `LinearHorizontal`, `LinearVertical`
     */
    @JsonProperty("worldLayout")
    public WorldLayout getWorldLayout() { return worldLayout; }
    @JsonProperty("worldLayout")
    public void setWorldLayout(WorldLayout value) { this.worldLayout = value; }
}

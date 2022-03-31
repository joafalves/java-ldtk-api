package io.github.joafalves.ldtk.model;

import com.fasterxml.jackson.annotation.*;

/**
 * This object is not actually used by LDtk. It ONLY exists to force explicit references to
 * all types, to make sure QuickType finds them and integrate all of them. Otherwise,
 * Quicktype will drop types that are not explicitely used.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ForcedRefs {
    private AutoLayerRuleGroup autoLayerRuleGroup;
    private AutoLayerRuleDefinition autoRuleDef;
    private Definitions definitions;
    private EntityDefinition entityDef;
    private EntityInstance entityInstance;
    private FieldInstanceEntityReference entityReferenceInfos;
    private EnumDefinition enumDef;
    private EnumValueDefinition enumDefValues;
    private EnumTagValue enumTagValue;
    private FieldDefinition fieldDef;
    private FieldInstance fieldInstance;
    private FieldInstanceGridPoint gridPoint;
    private IntGridValueDefinition intGridValueDef;
    private IntGridValueInstance intGridValueInstance;
    private LayerDefinition layerDef;
    private LayerInstance layerInstance;
    private Level level;
    private LevelBackgroundPosition levelBgPosInfos;
    private NeighbourLevel neighbourLevel;
    private TileInstance tile;
    private TileCustomMetadata tileCustomMetadata;
    private TilesetDefinition tilesetDef;
    private TilesetRectangle tilesetRect;
    private World world;

    @JsonProperty("AutoLayerRuleGroup")
    public AutoLayerRuleGroup getAutoLayerRuleGroup() { return autoLayerRuleGroup; }
    @JsonProperty("AutoLayerRuleGroup")
    public void setAutoLayerRuleGroup(AutoLayerRuleGroup value) { this.autoLayerRuleGroup = value; }

    @JsonProperty("AutoRuleDef")
    public AutoLayerRuleDefinition getAutoRuleDef() { return autoRuleDef; }
    @JsonProperty("AutoRuleDef")
    public void setAutoRuleDef(AutoLayerRuleDefinition value) { this.autoRuleDef = value; }

    @JsonProperty("Definitions")
    public Definitions getDefinitions() { return definitions; }
    @JsonProperty("Definitions")
    public void setDefinitions(Definitions value) { this.definitions = value; }

    @JsonProperty("EntityDef")
    public EntityDefinition getEntityDef() { return entityDef; }
    @JsonProperty("EntityDef")
    public void setEntityDef(EntityDefinition value) { this.entityDef = value; }

    @JsonProperty("EntityInstance")
    public EntityInstance getEntityInstance() { return entityInstance; }
    @JsonProperty("EntityInstance")
    public void setEntityInstance(EntityInstance value) { this.entityInstance = value; }

    @JsonProperty("EntityReferenceInfos")
    public FieldInstanceEntityReference getEntityReferenceInfos() { return entityReferenceInfos; }
    @JsonProperty("EntityReferenceInfos")
    public void setEntityReferenceInfos(FieldInstanceEntityReference value) { this.entityReferenceInfos = value; }

    @JsonProperty("EnumDef")
    public EnumDefinition getEnumDef() { return enumDef; }
    @JsonProperty("EnumDef")
    public void setEnumDef(EnumDefinition value) { this.enumDef = value; }

    @JsonProperty("EnumDefValues")
    public EnumValueDefinition getEnumDefValues() { return enumDefValues; }
    @JsonProperty("EnumDefValues")
    public void setEnumDefValues(EnumValueDefinition value) { this.enumDefValues = value; }

    @JsonProperty("EnumTagValue")
    public EnumTagValue getEnumTagValue() { return enumTagValue; }
    @JsonProperty("EnumTagValue")
    public void setEnumTagValue(EnumTagValue value) { this.enumTagValue = value; }

    @JsonProperty("FieldDef")
    public FieldDefinition getFieldDef() { return fieldDef; }
    @JsonProperty("FieldDef")
    public void setFieldDef(FieldDefinition value) { this.fieldDef = value; }

    @JsonProperty("FieldInstance")
    public FieldInstance getFieldInstance() { return fieldInstance; }
    @JsonProperty("FieldInstance")
    public void setFieldInstance(FieldInstance value) { this.fieldInstance = value; }

    @JsonProperty("GridPoint")
    public FieldInstanceGridPoint getGridPoint() { return gridPoint; }
    @JsonProperty("GridPoint")
    public void setGridPoint(FieldInstanceGridPoint value) { this.gridPoint = value; }

    @JsonProperty("IntGridValueDef")
    public IntGridValueDefinition getIntGridValueDef() { return intGridValueDef; }
    @JsonProperty("IntGridValueDef")
    public void setIntGridValueDef(IntGridValueDefinition value) { this.intGridValueDef = value; }

    @JsonProperty("IntGridValueInstance")
    public IntGridValueInstance getIntGridValueInstance() { return intGridValueInstance; }
    @JsonProperty("IntGridValueInstance")
    public void setIntGridValueInstance(IntGridValueInstance value) { this.intGridValueInstance = value; }

    @JsonProperty("LayerDef")
    public LayerDefinition getLayerDef() { return layerDef; }
    @JsonProperty("LayerDef")
    public void setLayerDef(LayerDefinition value) { this.layerDef = value; }

    @JsonProperty("LayerInstance")
    public LayerInstance getLayerInstance() { return layerInstance; }
    @JsonProperty("LayerInstance")
    public void setLayerInstance(LayerInstance value) { this.layerInstance = value; }

    @JsonProperty("Level")
    public Level getLevel() { return level; }
    @JsonProperty("Level")
    public void setLevel(Level value) { this.level = value; }

    @JsonProperty("LevelBgPosInfos")
    public LevelBackgroundPosition getLevelBgPosInfos() { return levelBgPosInfos; }
    @JsonProperty("LevelBgPosInfos")
    public void setLevelBgPosInfos(LevelBackgroundPosition value) { this.levelBgPosInfos = value; }

    @JsonProperty("NeighbourLevel")
    public NeighbourLevel getNeighbourLevel() { return neighbourLevel; }
    @JsonProperty("NeighbourLevel")
    public void setNeighbourLevel(NeighbourLevel value) { this.neighbourLevel = value; }

    @JsonProperty("Tile")
    public TileInstance getTile() { return tile; }
    @JsonProperty("Tile")
    public void setTile(TileInstance value) { this.tile = value; }

    @JsonProperty("TileCustomMetadata")
    public TileCustomMetadata getTileCustomMetadata() { return tileCustomMetadata; }
    @JsonProperty("TileCustomMetadata")
    public void setTileCustomMetadata(TileCustomMetadata value) { this.tileCustomMetadata = value; }

    @JsonProperty("TilesetDef")
    public TilesetDefinition getTilesetDef() { return tilesetDef; }
    @JsonProperty("TilesetDef")
    public void setTilesetDef(TilesetDefinition value) { this.tilesetDef = value; }

    @JsonProperty("TilesetRect")
    public TilesetRectangle getTilesetRect() { return tilesetRect; }
    @JsonProperty("TilesetRect")
    public void setTilesetRect(TilesetRectangle value) { this.tilesetRect = value; }

    @JsonProperty("World")
    public World getWorld() { return world; }
    @JsonProperty("World")
    public void setWorld(World value) { this.world = value; }
}

package io.github.joafalves.ldtk.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * An enum that describes how levels are organized in this project (ie. linearly or in a 2D
 * space). Possible values: `Free`, `GridVania`, `LinearHorizontal`, `LinearVertical`
 */
public enum WorldLayout {
    FREE, GRID_VANIA, LINEAR_HORIZONTAL, LINEAR_VERTICAL;

    @JsonValue
    public String toValue() {
        switch (this) {
            case FREE: return "Free";
            case GRID_VANIA: return "GridVania";
            case LINEAR_HORIZONTAL: return "LinearHorizontal";
            case LINEAR_VERTICAL: return "LinearVertical";
        }
        return null;
    }

    @JsonCreator
    public static WorldLayout forValue(String value) throws IOException {
        if (value.equals("Free")) return FREE;
        if (value.equals("GridVania")) return GRID_VANIA;
        if (value.equals("LinearHorizontal")) return LINEAR_HORIZONTAL;
        if (value.equals("LinearVertical")) return LINEAR_VERTICAL;
        throw new IOException("Cannot deserialize WorldLayout");
    }
}

package io.github.joafalves.ldtk.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

/**
 * Possible values: `Cover`, `FitInside`, `Repeat`, `Stretch`
 */
public enum TileRenderMode {
    COVER, FIT_INSIDE, REPEAT, STRETCH;

    @JsonValue
    public String toValue() {
        switch (this) {
            case COVER: return "Cover";
            case FIT_INSIDE: return "FitInside";
            case REPEAT: return "Repeat";
            case STRETCH: return "Stretch";
        }
        return null;
    }

    @JsonCreator
    public static TileRenderMode forValue(String value) throws IOException {
        if (value.equals("Cover")) return COVER;
        if (value.equals("FitInside")) return FIT_INSIDE;
        if (value.equals("Repeat")) return REPEAT;
        if (value.equals("Stretch")) return STRETCH;
        throw new IOException("Cannot deserialize TileRenderMode");
    }
}

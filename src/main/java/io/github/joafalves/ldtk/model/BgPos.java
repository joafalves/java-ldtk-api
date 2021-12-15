package io.github.joafalves.ldtk.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum BgPos {
    CONTAIN, COVER, COVER_DIRTY, UNSCALED;

    @JsonValue
    public String toValue() {
        switch (this) {
            case CONTAIN: return "Contain";
            case COVER: return "Cover";
            case COVER_DIRTY: return "CoverDirty";
            case UNSCALED: return "Unscaled";
        }
        return null;
    }

    @JsonCreator
    public static BgPos forValue(String value) throws IOException {
        if (value.equals("Contain")) return CONTAIN;
        if (value.equals("Cover")) return COVER;
        if (value.equals("CoverDirty")) return COVER_DIRTY;
        if (value.equals("Unscaled")) return UNSCALED;
        throw new IOException("Cannot deserialize BgPos");
    }
}

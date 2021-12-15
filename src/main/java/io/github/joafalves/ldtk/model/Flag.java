package io.github.joafalves.ldtk.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum Flag {
    DISCARD_PRE_CSV_INT_GRID, IGNORE_BACKUP_SUGGEST;

    @JsonValue
    public String toValue() {
        switch (this) {
            case DISCARD_PRE_CSV_INT_GRID: return "DiscardPreCsvIntGrid";
            case IGNORE_BACKUP_SUGGEST: return "IgnoreBackupSuggest";
        }
        return null;
    }

    @JsonCreator
    public static Flag forValue(String value) throws IOException {
        if (value.equals("DiscardPreCsvIntGrid")) return DISCARD_PRE_CSV_INT_GRID;
        if (value.equals("IgnoreBackupSuggest")) return IGNORE_BACKUP_SUGGEST;
        throw new IOException("Cannot deserialize Flag");
    }
}

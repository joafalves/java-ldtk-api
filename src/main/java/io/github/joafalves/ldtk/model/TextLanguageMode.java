package io.github.joafalves.ldtk.model;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum TextLanguageMode {
    LANG_C, LANG_HAXE, LANG_JS, LANG_Json, LANG_LOG, LANG_LUA, LANG_MARKDOWN, LANG_PYTHON, LANG_RUBY, LANG_Xml;

    @JsonValue
    public String toValue() {
        switch (this) {
            case LANG_C: return "LangC";
            case LANG_HAXE: return "LangHaxe";
            case LANG_JS: return "LangJS";
            case LANG_Json: return "LangJson";
            case LANG_LOG: return "LangLog";
            case LANG_LUA: return "LangLua";
            case LANG_MARKDOWN: return "LangMarkdown";
            case LANG_PYTHON: return "LangPython";
            case LANG_RUBY: return "LangRuby";
            case LANG_Xml: return "LangXml";
        }
        return null;
    }

    @JsonCreator
    public static TextLanguageMode forValue(String value) throws IOException {
        if (value.equals("LangC")) return LANG_C;
        if (value.equals("LangHaxe")) return LANG_HAXE;
        if (value.equals("LangJS")) return LANG_JS;
        if (value.equals("LangJson")) return LANG_Json;
        if (value.equals("LangLog")) return LANG_LOG;
        if (value.equals("LangLua")) return LANG_LUA;
        if (value.equals("LangMarkdown")) return LANG_MARKDOWN;
        if (value.equals("LangPython")) return LANG_PYTHON;
        if (value.equals("LangRuby")) return LANG_RUBY;
        if (value.equals("LangXml")) return LANG_Xml;
        throw new IOException("Cannot deserialize TextLanguageMode");
    }
}

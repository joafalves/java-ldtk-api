package io.github.joafalves.ldtk.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

/**
 * Level background image position info
 */
@lombok.Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class LevelBackgroundPosition {
    @lombok.Getter(onMethod_ = {@JsonProperty("cropRect")})
    @lombok.Setter(onMethod_ = {@JsonProperty("cropRect")})
    private List<Double> cropRect;
    @lombok.Getter(onMethod_ = {@JsonProperty("scale")})
    @lombok.Setter(onMethod_ = {@JsonProperty("scale")})
    private List<Double> scale;
    @lombok.Getter(onMethod_ = {@JsonProperty("topLeftPx")})
    @lombok.Setter(onMethod_ = {@JsonProperty("topLeftPx")})
    private List<Long> topLeftPx;
}

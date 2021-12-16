package io.github.joafalves.ldtk.model;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

/**
 * Level background image position info
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class LevelBackgroundPosition {
    private List<Double> cropRect;
    private List<Double> scale;
    private List<Long> topLeftPx;

    /**
     * An array of 4 float values describing the cropped sub-rectangle of the displayed
     * background image. This cropping happens when original is larger than the level bounds.
     * Array format: `[ cropX, cropY, cropWidth, cropHeight ]`
     */
    @JsonProperty("cropRect")
    public List<Double> getCropRect() { return cropRect; }
    @JsonProperty("cropRect")
    public void setCropRect(List<Double> value) { this.cropRect = value; }

    /**
     * An array containing the `[scaleX,scaleY]` values of the **cropped** background image,
     * depending on `bgPos` option.
     */
    @JsonProperty("scale")
    public List<Double> getScale() { return scale; }
    @JsonProperty("scale")
    public void setScale(List<Double> value) { this.scale = value; }

    /**
     * An array containing the `[x,y]` pixel coordinates of the top-left corner of the
     * **cropped** background image, depending on `bgPos` option.
     */
    @JsonProperty("topLeftPx")
    public List<Long> getTopLeftPx() { return topLeftPx; }
    @JsonProperty("topLeftPx")
    public void setTopLeftPx(List<Long> value) { this.topLeftPx = value; }
}

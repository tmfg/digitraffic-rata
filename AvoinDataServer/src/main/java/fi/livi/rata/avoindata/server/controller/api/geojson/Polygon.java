package fi.livi.rata.avoindata.server.controller.api.geojson;

import java.util.List;
import java.util.stream.Collectors;

public final class Polygon implements Geometry<List<List<List<Double>>>> {

    private final List<LineString> lines;

    public Polygon(final List<LineString> lines) {
        this.lines = lines;
    }

    @Override
    public List<List<List<Double>>> getCoordinates() {
        return lines.stream().map(LineString::getCoordinates).collect(Collectors.toList());
    }

    @Override
    public String getType() {
        return "Polygon";
    }
}

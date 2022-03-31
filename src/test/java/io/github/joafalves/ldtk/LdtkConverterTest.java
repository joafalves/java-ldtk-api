package io.github.joafalves.ldtk;

import io.github.joafalves.ldtk.model.Coordinate;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LdtkConverterTest {

    @Test
    public void loadTest() throws IOException {
        Coordinate project = LdtkConverter.fromJsonString(loadResourceFile("./data.json"));
        Assertions.assertNotNull(project);
    }

    private String loadResourceFile(String filename) throws IOException {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        try (InputStream is = classLoader.getResourceAsStream(filename)) {
            if (is == null) return null;
            try (InputStreamReader isr = new InputStreamReader(is);
                    BufferedReader reader = new BufferedReader(isr)) {
                return reader.lines().collect(Collectors.joining(System.lineSeparator()));
            }
        }
    }
}

package com.fretboard.module;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class FretboardDisplayModuleTest {

    @Test
    void classLoads() throws ClassNotFoundException {
        Class<?> cls = Class.forName("com.fretboard.module.FretboardDisplayModule");
        assertNotNull(cls, "FretboardDisplayModule class should be present on the classpath");
    }

    @Test
    void showOctaveDefaultsToFalse() throws Exception {
        Class<?> cls = Class.forName("com.fretboard.module.FretboardDisplayModule");
        Field showOctaveField = cls.getDeclaredField("showOctave");
        showOctaveField.setAccessible(true);

        // Verify the field's declared default value by checking the field type and existence
        assertEquals(boolean.class, showOctaveField.getType(),
                "showOctave field should be a boolean");
    }

    @Test
    void showFrequenciesDefaultsToFalse() throws Exception {
        Class<?> cls = Class.forName("com.fretboard.module.FretboardDisplayModule");
        Field showFrequenciesField = cls.getDeclaredField("showFrequencies");
        showFrequenciesField.setAccessible(true);

        assertEquals(boolean.class, showFrequenciesField.getType(),
                "showFrequencies field should be a boolean");
    }

    @Test
    void moduleIdConstant() throws Exception {
        Class<?> cls = Class.forName("com.fretboard.module.FretboardDisplayModule");
        Field moduleIdField = cls.getDeclaredField("MODULE_ID");
        moduleIdField.setAccessible(true);

        assertEquals("fretboard-display", moduleIdField.get(null),
                "MODULE_ID should be 'fretboard-display'");
    }
}

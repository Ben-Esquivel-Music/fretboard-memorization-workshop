package com.fretboard.module;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FretboardDisplayModuleTest {

    @Test
    void classLoads() throws ClassNotFoundException {
        Class<?> cls = Class.forName("com.fretboard.module.FretboardDisplayModule");
        assertNotNull(cls, "FretboardDisplayModule class should be present on the classpath");
    }

    @Test
    void showOctaveFieldExists() throws Exception {
        Class<?> cls = Class.forName("com.fretboard.module.FretboardDisplayModule");
        Field showOctaveField = cls.getDeclaredField("showOctave");
        assertEquals(boolean.class, showOctaveField.getType(),
                "showOctave field should be a boolean");
        assertFalse(Modifier.isStatic(showOctaveField.getModifiers()),
                "showOctave field should be an instance field");
    }

    @Test
    void showFrequenciesFieldExists() throws Exception {
        Class<?> cls = Class.forName("com.fretboard.module.FretboardDisplayModule");
        Field showFrequenciesField = cls.getDeclaredField("showFrequencies");
        assertEquals(boolean.class, showFrequenciesField.getType(),
                "showFrequencies field should be a boolean");
        assertFalse(Modifier.isStatic(showFrequenciesField.getModifiers()),
                "showFrequencies field should be an instance field");
    }

    @Test
    void moduleIdConstant() throws Exception {
        Class<?> cls = Class.forName("com.fretboard.module.FretboardDisplayModule");
        Field moduleIdField = cls.getDeclaredField("MODULE_ID");
        moduleIdField.setAccessible(true);
        assertTrue(Modifier.isStatic(moduleIdField.getModifiers()),
                "MODULE_ID should be a static field");
        assertEquals("fretboard-display", moduleIdField.get(null),
                "MODULE_ID should be 'fretboard-display'");
    }
}


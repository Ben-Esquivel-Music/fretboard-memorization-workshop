package com.fretboard.constants;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for the {@link ColorPalette} constants class.
 * Verifies that all palette colors are defined and have expected hex values.
 */
public class ColorPaletteTest {

    @Test
    public void blackColorsShouldNotBeNull() {
        assertNotNull(ColorPalette.BLACK);
        assertNotNull(ColorPalette.BLACK_LIGHT);
        assertNotNull(ColorPalette.BLACK_SURFACE);
    }

    @Test
    public void redColorsShouldNotBeNull() {
        assertNotNull(ColorPalette.RED);
        assertNotNull(ColorPalette.RED_LIGHT);
        assertNotNull(ColorPalette.RED_DARK);
    }

    @Test
    public void greenColorsShouldNotBeNull() {
        assertNotNull(ColorPalette.GREEN);
        assertNotNull(ColorPalette.GREEN_LIGHT);
        assertNotNull(ColorPalette.GREEN_DARK);
    }

    @Test
    public void purpleColorsShouldNotBeNull() {
        assertNotNull(ColorPalette.PURPLE);
        assertNotNull(ColorPalette.PURPLE_LIGHT);
        assertNotNull(ColorPalette.PURPLE_DARK);
    }

    @Test
    public void orangeColorsShouldNotBeNull() {
        assertNotNull(ColorPalette.ORANGE);
        assertNotNull(ColorPalette.ORANGE_LIGHT);
        assertNotNull(ColorPalette.ORANGE_DARK);
    }

    @Test
    public void textColorsShouldNotBeNull() {
        assertNotNull(ColorPalette.TEXT_PRIMARY);
        assertNotNull(ColorPalette.TEXT_SECONDARY);
        assertNotNull(ColorPalette.TEXT_MUTED);
    }

    @Test
    public void hexStringsShouldNotBeNull() {
        assertNotNull(ColorPalette.BLACK_HEX);
        assertNotNull(ColorPalette.BLACK_LIGHT_HEX);
        assertNotNull(ColorPalette.BLACK_SURFACE_HEX);
        assertNotNull(ColorPalette.RED_HEX);
        assertNotNull(ColorPalette.GREEN_HEX);
        assertNotNull(ColorPalette.PURPLE_HEX);
        assertNotNull(ColorPalette.PURPLE_LIGHT_HEX);
        assertNotNull(ColorPalette.PURPLE_DARK_HEX);
        assertNotNull(ColorPalette.ORANGE_HEX);
    }

    @Test
    public void hexStringsShouldStartWithHash() {
        assertTrue(ColorPalette.BLACK_HEX.startsWith("#"));
        assertTrue(ColorPalette.RED_HEX.startsWith("#"));
        assertTrue(ColorPalette.GREEN_HEX.startsWith("#"));
        assertTrue(ColorPalette.PURPLE_HEX.startsWith("#"));
        assertTrue(ColorPalette.ORANGE_HEX.startsWith("#"));
    }

    @Test
    public void paletteContainsFivePrimaryColors() {
        // Verify the five required palette colors exist: Black, Red, Green, Purple, Orange
        assertNotNull(ColorPalette.BLACK, "Palette must include Black");
        assertNotNull(ColorPalette.RED, "Palette must include Red");
        assertNotNull(ColorPalette.GREEN, "Palette must include Green");
        assertNotNull(ColorPalette.PURPLE, "Palette must include Purple");
        assertNotNull(ColorPalette.ORANGE, "Palette must include Orange");
    }
}

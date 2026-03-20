package com.fretboard.constants;

import javafx.scene.paint.Color;

/**
 * Application color palette constants.
 * Defines the core colors used throughout the Fretboard Memorization Workshop.
 * 
 * <p>The palette consists of five primary colors:
 * <ul>
 *   <li><strong>Black</strong> – used for backgrounds and base surfaces</li>
 *   <li><strong>Red</strong> – used for warnings, stop buttons, and over-target indicators</li>
 *   <li><strong>Green</strong> – used for success states, start buttons, and positive feedback</li>
 *   <li><strong>Purple</strong> – used for accents, highlights, and branding</li>
 *   <li><strong>Orange</strong> – used for caution states, hover effects, and warm accents</li>
 * </ul>
 */
public final class ColorPalette {

    // === Black – Backgrounds and base surfaces ===
    /** Deep black for primary backgrounds. Hex: #121212 */
    public static final Color BLACK = Color.web("#121212");
    /** Slightly lighter black for elevated surfaces. Hex: #1a1a1a */
    public static final Color BLACK_LIGHT = Color.web("#1a1a1a");
    /** Medium dark for cards and containers. Hex: #242424 */
    public static final Color BLACK_SURFACE = Color.web("#242424");
    /** Hex string for BLACK. */
    public static final String BLACK_HEX = "#121212";
    /** Hex string for BLACK_LIGHT. */
    public static final String BLACK_LIGHT_HEX = "#1a1a1a";
    /** Hex string for BLACK_SURFACE. */
    public static final String BLACK_SURFACE_HEX = "#242424";

    // === Red – Warnings, stop actions, and error states ===
    /** Vibrant red for stop buttons and errors. Hex: #e53935 */
    public static final Color RED = Color.web("#e53935");
    /** Lighter red for hover states. Hex: #ef5350 */
    public static final Color RED_LIGHT = Color.web("#ef5350");
    /** Darker red for pressed states. Hex: #c62828 */
    public static final Color RED_DARK = Color.web("#c62828");
    /** Hex string for RED. */
    public static final String RED_HEX = "#e53935";

    // === Green – Success states and positive actions ===
    /** Vibrant green for start buttons and success. Hex: #43a047 */
    public static final Color GREEN = Color.web("#43a047");
    /** Lighter green for hover states. Hex: #66bb6a */
    public static final Color GREEN_LIGHT = Color.web("#66bb6a");
    /** Darker green for pressed states. Hex: #2e7d32 */
    public static final Color GREEN_DARK = Color.web("#2e7d32");
    /** Hex string for GREEN. */
    public static final String GREEN_HEX = "#43a047";

    // === Purple – Accents, highlights, and branding ===
    /** Vibrant purple for primary accents. Hex: #ab47bc */
    public static final Color PURPLE = Color.web("#ab47bc");
    /** Lighter purple for hover effects. Hex: #ce93d8 */
    public static final Color PURPLE_LIGHT = Color.web("#ce93d8");
    /** Darker purple for pressed states. Hex: #7b1fa2 */
    public static final Color PURPLE_DARK = Color.web("#7b1fa2");
    /** Hex string for PURPLE. */
    public static final String PURPLE_HEX = "#ab47bc";
    /** Hex string for PURPLE_LIGHT. */
    public static final String PURPLE_LIGHT_HEX = "#ce93d8";
    /** Hex string for PURPLE_DARK. */
    public static final String PURPLE_DARK_HEX = "#7b1fa2";

    // === Orange – Caution states, warm accents ===
    /** Vibrant orange for caution and hover accents. Hex: #fb8c00 */
    public static final Color ORANGE = Color.web("#fb8c00");
    /** Lighter orange for hover states. Hex: #ffa726 */
    public static final Color ORANGE_LIGHT = Color.web("#ffa726");
    /** Darker orange for pressed states. Hex: #e65100 */
    public static final Color ORANGE_DARK = Color.web("#e65100");
    /** Hex string for ORANGE. */
    public static final String ORANGE_HEX = "#fb8c00";

    // === Text colors ===
    /** Primary text color – bright white. */
    public static final Color TEXT_PRIMARY = Color.WHITE;
    /** Secondary text color – light gray for descriptions. Hex: #d0d0d0 */
    public static final Color TEXT_SECONDARY = Color.web("#d0d0d0");
    /** Muted text color – dim gray for hints. Hex: #888888 */
    public static final Color TEXT_MUTED = Color.web("#888888");

    private ColorPalette() {
        // Utility class – prevent instantiation
    }
}

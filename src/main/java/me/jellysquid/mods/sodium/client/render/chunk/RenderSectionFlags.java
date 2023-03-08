package me.jellysquid.mods.sodium.client.render.chunk;

public class RenderSectionFlags {
    public static final int IS_LOADED = 1 << 0;
    public static final int HAS_BLOCK_GEOMETRY = 1 << 1;
    public static final int HAS_BLOCK_ENTITIES = 1 << 2;
    public static final int HAS_ANIMATED_SPRITES = 1 << 3;
}
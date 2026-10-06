package eighty_six.content;

import mindustry.world.Block;

public class EightySixBlocks {
    public static Block morpho, howitzer155mm;

    public static void load() {
        morpho = eighty_six.content.MorphoTurret.load();
        howitzer155mm = eighty_six.content.Howitzer155mm.load();
    }
}
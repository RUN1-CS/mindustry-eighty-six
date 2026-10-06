package eighty_six;

import eighty_six.content.EightySixBlocks;
import eighty_six.content.EightySixTechTree;
import mindustry.mod.Mod;

/** Entry point that loads the Eighty Six mod content. */
public class eighty_six extends Mod {
    /** Loads blocks, units, and their research tree entries. */
    @Override
    public void loadContent() {
        EightySixBlocks.load();
        EightySixTechTree.load();
    }
}
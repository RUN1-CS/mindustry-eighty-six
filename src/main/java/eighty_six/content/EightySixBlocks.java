package eighty_six.content;

import mindustry.world.Block;

import eighty_six.content.Humankind.Howitzer155mm;
import eighty_six.content.Humankind.PointAirDefense;
import eighty_six.content.Legion.LegionReconstructors;
import eighty_six.content.Legion.MorphoTurret;

/** Registry and loader for all custom blocks. */
public class EightySixBlocks {
    public static Block morphoTurret;
    public static Block howitzer155mm;
    public static Block pointAirDefense;
    public static Block mechaFactory;

    /** Loads custom blocks and registers unit upgrades on the Legion reconstructors. */
    public static void load() {
        EightySixUnits.load();

        morphoTurret = MorphoTurret.load();
        howitzer155mm = Howitzer155mm.load();
        pointAirDefense = PointAirDefense.load();

        mechaFactory = MechaFactory.load();
        LegionReconstructors.load();
    }
}
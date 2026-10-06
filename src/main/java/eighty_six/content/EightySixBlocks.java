package eighty_six.content;

import mindustry.content.Blocks;
import mindustry.type.UnitType;
import mindustry.world.Block;
import mindustry.world.blocks.units.Reconstructor;

/** Registry and loader for all custom blocks. */
public class EightySixBlocks {
    public static Block morphoTurret;
    public static Block howitzer155mm;
    public static Block pointAirDefense;
    public static Block mechaFactory;

        /** Loads custom blocks and registers unit upgrades on the vanilla reconstructors. */
        public static void load() {
        eighty_six.content.EightySixUnits.load();

        morphoTurret = eighty_six.content.MorphoTurret.load();
        howitzer155mm = eighty_six.content.Howitzer155mm.load();
        pointAirDefense = eighty_six.content.PointAirDefense.load();

        mechaFactory = eighty_six.content.MechaFactory.load();

        ((Reconstructor) Blocks.additiveReconstructor).upgrades.add(
                new UnitType[]{ eighty_six.content.EightySixUnits.ameise, eighty_six.content.EightySixUnits.lowe }
        );
        ((Reconstructor) Blocks.multiplicativeReconstructor).upgrades.add(
                new UnitType[]{ eighty_six.content.EightySixUnits.lowe, eighty_six.content.EightySixUnits.dinosauria }
        );
        ((Reconstructor) Blocks.exponentialReconstructor).upgrades.add(
                new UnitType[]{ eighty_six.content.EightySixUnits.dinosauria, eighty_six.content.EightySixUnits.zentaur }
        );
        ((Reconstructor) Blocks.tetrativeReconstructor).upgrades.add(
                new UnitType[]{ eighty_six.content.EightySixUnits.zentaur, eighty_six.content.EightySixUnits.morpho }
        );
    }
}
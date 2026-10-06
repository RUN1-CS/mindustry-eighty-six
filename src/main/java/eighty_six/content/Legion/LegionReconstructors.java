package eighty_six.content.Legion;

import mindustry.content.Items;
import mindustry.content.Liquids;
import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.type.UnitType;
import mindustry.world.Block;
import eighty_six.content.EightySixUnits;
import mindustry.world.blocks.units.Reconstructor;

/** Defines the reconstructor progression for the Legion unit line. */
public class LegionReconstructors {
    public static Block refitter;
    public static Block assembler;
    public static Block fabricationCore;
    public static Block commandHive;

        /** Creates all Legion reconstructors and connects their unit upgrades. */
        public static void load() {
        // T2: Legion Refitter (Ameise -> Löwe)
        refitter = new Reconstructor("legion-refitter") {{
            requirements(Category.units, ItemStack.with(
                    Items.copper, 200,
                    Items.lead, 120,
                    Items.silicon, 90,
                    Items.titanium, 70
            ));

            size = 3;
            health = 600;
            constructTime = 60f * 15f; // 15 seconds
            consumePower(3f);

            consumeItems(ItemStack.with(
                    Items.silicon, 40,
                    Items.titanium, 30
            ));

            upgrades.add(new UnitType[]{ EightySixUnits.ameise, EightySixUnits.lowe });
        }};

        // T3: Legion Assembler (Löwe -> Dinosauria)
        assembler = new Reconstructor("legion-assembler") {{
            requirements(Category.units, ItemStack.with(
                    Items.copper, 500,
                    Items.lead, 400,
                    Items.silicon, 250,
                    Items.titanium, 200,
                    Items.thorium, 100
            ));

            size = 5;
            health = 1400;
            constructTime = 60f * 30f; // 30 seconds
            consumePower(6f);

            consumeItems(ItemStack.with(
                    Items.silicon, 80,
                    Items.thorium, 60,
                    Items.plastanium, 40
            ));

            upgrades.add(new UnitType[]{ EightySixUnits.lowe, EightySixUnits.dinosauria });
        }};

        // T4: Legion Fabrication Core (Dinosauria -> Zentaur)
        fabricationCore = new Reconstructor("legion-fabrication-core") {{
            requirements(Category.units, ItemStack.with(
                    Items.copper, 1200,
                    Items.lead, 1000,
                    Items.silicon, 600,
                    Items.thorium, 400,
                    Items.plastanium, 250,
                    Items.surgeAlloy, 150
            ));

            size = 7;
            health = 3200;
            constructTime = 60f * 60f; // 60 seconds
            consumePower(14f);

            consumeItems(ItemStack.with(
                    Items.silicon, 150,
                    Items.surgeAlloy, 80,
                    Items.phaseFabric, 50
            ));

            upgrades.add(new UnitType[]{ EightySixUnits.dinosauria, EightySixUnits.zentaur });
        }};

        // T5: Legion Command Hive (Zentaur -> Morpho)
        commandHive = new Reconstructor("legion-command-hive") {{
            requirements(Category.units, ItemStack.with(
                    Items.copper, 3000,
                    Items.lead, 2500,
                    Items.silicon, 1500,
                    Items.thorium, 1000,
                    Items.plastanium, 800,
                    Items.surgeAlloy, 500,
                    Items.phaseFabric, 400
            ));

            size = 9;
            health = 7500;
            constructTime = 60f * 120f; // 120 seconds
            consumePower(35f);

            consumeItems(ItemStack.with(
                    Items.silicon, 400,
                    Items.surgeAlloy, 250,
                    Items.phaseFabric, 180
            ));
            consumeLiquid(Liquids.cryofluid, 1.0f); // High thermal cooling for railgun integration

            upgrades.add(new UnitType[]{ EightySixUnits.zentaur, EightySixUnits.morpho });
        }};
    }
}
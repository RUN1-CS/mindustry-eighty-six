package eighty_six.content;

import mindustry.content.Items;
import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.world.Block;
import mindustry.world.blocks.units.UnitFactory;
import mindustry.world.blocks.units.UnitFactory.UnitPlan;

/** Defines the factory that produces the mod's mecha and Ameise units. */
public class MechaFactory {
        /** Creates and configures the mecha factory and its production plans. */
    public static Block load() {
        return new UnitFactory("mecha-factory") {{
            requirements(Category.units, ItemStack.with(
                    Items.copper, 80,
                    Items.lead, 120,
                    Items.silicon, 80,
                    Items.titanium, 50
            ));

            size = 3;
            health = 450;
            consumePower(2f);

            // Configure unit production recipe
            plans.add(new UnitPlan(
                    EightySixUnits.juggernaut,
                    60f * 25f,
                    ItemStack.with(
                            Items.silicon, 20,
                            Items.titanium, 15
                    )
            ));
            plans.add(new UnitPlan(
                    EightySixUnits.vanagandr,
                    60f * 40f,
                    ItemStack.with(
                            Items.silicon, 25,
                            Items.titanium, 30
                    )
            ));
            plans.add(new UnitPlan(
                    EightySixUnits.reginleif,
                    60f * 30f,
                    ItemStack.with(
                            Items.silicon, 25,
                            Items.titanium, 25
                    )
            ));
            plans.add(new UnitPlan(
                    EightySixUnits.ameise,
                    60f * 10f,
                    ItemStack.with(
                            Items.silicon, 10,
                            Items.titanium, 5
                    )
            ));
        }};
    }
}
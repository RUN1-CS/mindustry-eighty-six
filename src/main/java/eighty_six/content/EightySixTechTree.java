package eighty_six.content;

import eighty_six.content.Legion.LegionReconstructors;
import mindustry.content.Blocks;
import mindustry.content.Items;
import mindustry.content.TechTree;
import mindustry.content.TechTree.TechNode;
import mindustry.ctype.Content;
import mindustry.type.ItemStack;

/** Adds the mod's factory, unit, and turret progression to the vanilla tech tree. */
public class EightySixTechTree {

        /** Registers all custom content under its corresponding vanilla or mod parent. */
    public static void load() {
        // --- 1. FACTORIES & BUILDINGS ---

        // Attach Mecha Factory under Ground Factory
        node(Blocks.groundFactory, EightySixBlocks.mechaFactory, ItemStack.with(
                Items.copper, 1000,
                Items.lead, 800,
                Items.silicon, 500
        ));

        // Reconstructors branching from Mecha Factory
        node(EightySixBlocks.mechaFactory, LegionReconstructors.refitter, ItemStack.with(
                Items.copper, 1200, Items.lead, 1000, Items.silicon, 600
        ));

        node(LegionReconstructors.refitter, LegionReconstructors.assembler, ItemStack.with(
                Items.silicon, 2000, Items.titanium, 1500, Items.thorium, 800
        ));

        node(LegionReconstructors.assembler, LegionReconstructors.fabricationCore, ItemStack.with(
                Items.silicon, 5000, Items.thorium, 3000, Items.surgeAlloy, 1000
        ));

        node(LegionReconstructors.fabricationCore, LegionReconstructors.commandHive, ItemStack.with(
                Items.silicon, 15000, Items.surgeAlloy, 8000, Items.phaseFabric, 5000
        ));

        // Units produced directly by Mecha Factory
        node(EightySixBlocks.mechaFactory, EightySixUnits.juggernaut, ItemStack.with(
                Items.silicon, 800,
                Items.graphite, 500
        ));

        node(EightySixBlocks.mechaFactory, EightySixUnits.vanagandr, ItemStack.with(
                Items.silicon, 1200,
                Items.titanium, 800
        ));

        node(EightySixBlocks.mechaFactory, EightySixUnits.reginleif, ItemStack.with(
                Items.silicon, 1500,
                Items.titanium, 1000,
                Items.thorium, 400
        ));

        // Base T1 Legion Unit under Mecha Factory
        node(EightySixBlocks.mechaFactory, EightySixUnits.ameise, ItemStack.with(
                Items.silicon, 600,
                Items.copper, 1000
        ));


        // --- 2. LEGION RECONSTRUCTOR EVOLUTION TREE ---

        node(EightySixUnits.ameise, EightySixUnits.lowe, ItemStack.with(
                Items.silicon, 2000,
                Items.titanium, 1500,
                Items.graphite, 1000
        ));

        node(EightySixUnits.lowe, EightySixUnits.dinosauria, ItemStack.with(
                Items.silicon, 5000,
                Items.thorium, 3000,
                Items.plastanium, 2000
        ));

        node(EightySixUnits.dinosauria, EightySixUnits.zentaur, ItemStack.with(
                Items.silicon, 12000,
                Items.phaseFabric, 4000,
                Items.surgeAlloy, 3000
        ));

        node(EightySixUnits.zentaur, EightySixUnits.morpho, ItemStack.with(
                Items.silicon, 25000,
                Items.surgeAlloy, 10000,
                Items.phaseFabric, 8000
        ));


        // --- 3. CAMPAIGN TURRETS ---

        // Howitzer under Ripple
        node(Blocks.ripple, EightySixBlocks.howitzer155mm, ItemStack.with(
                Items.copper, 1200,
                Items.graphite, 800,
                Items.titanium, 500
        ));

        // Morpho Coilgun under Foreshadow
        node(Blocks.foreshadow, EightySixBlocks.morphoTurret, ItemStack.with(
                Items.copper, 5000,
                Items.silicon, 4000,
                Items.surgeAlloy, 2000
        ));

        // Point Air Defense Turret under Salvo
        node(Blocks.salvo, EightySixBlocks.pointAirDefense, ItemStack.with(
                Items.copper, 2500,
                Items.silicon, 1300,
                Items.titanium, 850
        ));
    }

        /** Creates a tech-tree node with a parent, unlockable content, and research costs. */
    private static TechNode node(Content parent, Content content, ItemStack[] requirements) {
        TechNode parentNode = TechTree.all.find(n -> n.content == parent);
        TechNode node = new TechNode(parentNode, (mindustry.ctype.UnlockableContent) content, requirements);
        return node;
    }
}
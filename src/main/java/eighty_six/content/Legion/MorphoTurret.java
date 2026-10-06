package eighty_six.content.Legion;

import mindustry.content.Fx;
import mindustry.content.Items;
import mindustry.content.StatusEffects;
import mindustry.entities.bullet.PointBulletType;
import mindustry.gen.Sounds;
import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.world.Block;
import mindustry.world.blocks.defense.turrets.ItemTurret;
import mindustry.world.consumers.ConsumeCoolant;

/** Defines the Morpho coilgun turret and its piercing ammunition. */
public class MorphoTurret {
    /** Creates and configures the Morpho coilgun block. */
    public static Block load() {
        return new ItemTurret("morpho-coilgun") {{
            requirements(Category.turret, ItemStack.with(
                    Items.copper, 350,
                    Items.lead, 200,
                    Items.silicon, 180,
                    Items.titanium, 150,
                    Items.surgeAlloy, 100
            ));

            // Turret statistics.
            size = 4;
            health = 4600;
            reload = 120f;
            range = 800f;
            inaccuracy = 0f;
            rotateSpeed = 2.5f;
            recoil = 6f;
            shake = 0f;
            shootSound = Sounds.shootForeshadow;

            warmupMaintainTime = 90f;
            shootWarmupSpeed /= 5f;
            minWarmup = 0.9f;
            shootCone = 15f;

            // Power consumption.
            consumePower(25f);

            // Liquid cooling.
            hasLiquids = true;
            liquidCapacity = 30f;
            coolantMultiplier = 2.5f;
            coolant = new ConsumeCoolant(0.4f);

            canOverdrive = true;

            // Target types.
            targetGround = true;
            targetAir = true;

            // Ammunition.
            ammo(
                    Items.surgeAlloy, new PointBulletType() {{
                        shootEffect = Fx.instHit;
                        smokeEffect = Fx.smokeCloud;
                        trailEffect = Fx.railTrail;
                        speed = 520f;
                        damage = 22755f;
                        buildingDamageMultiplier = 2f;
                        pierce = true;
                        pierceBuilding = true;
                        pierceCap = 8;
                        ammoMultiplier = 1f;
                        status = StatusEffects.shocked;
                        statusDuration = 180f;
                    }},
                    Items.phaseFabric, new PointBulletType() {{
                        shootEffect = Fx.instHit;
                        smokeEffect = Fx.smokeCloud;
                        trailEffect = Fx.railTrail;
                        speed = 520f;
                        damage = 45510f;
                        buildingDamageMultiplier = 2.5f;
                        pierce = true;
                        pierceBuilding = true;
                        pierceCap = 15;
                        ammoMultiplier = 2f;
                        status = StatusEffects.blasted;
                        statusDuration = 240f;
                    }}
            );
        }};
    }
}
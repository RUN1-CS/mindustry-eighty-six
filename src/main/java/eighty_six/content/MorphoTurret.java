package eighty_six.content;

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

public class MorphoTurret {
    public static Block load() {
        return new ItemTurret("morpho-coilgun") {{
            requirements(Category.turret, ItemStack.with(
                    Items.copper, 350,
                    Items.lead, 200,
                    Items.silicon, 180,
                    Items.titanium, 150,
                    Items.surgeAlloy, 100
            ));
            size = 4;
            health = 3200;
            reload = 120f;
            range = 520f;
            inaccuracy = 0f;
            rotateSpeed = 2.5f;
            recoil = 6f;
            shake = 8f;
            shootSound = Sounds.shootForeshadow;

            // Power consumption
            consumePower(25f);

            // Liquid Cooling
            hasLiquids = true;
            liquidCapacity = 30f;
            coolantMultiplier = 2.5f;
            coolant = new ConsumeCoolant(0.4f);

            // Bullet Types
            ammo(
                    Items.surgeAlloy, new PointBulletType() {{
                        shootEffect = Fx.instHit;
                        smokeEffect = Fx.smokeCloud;
                        trailEffect = Fx.railTrail;
                        speed = 520f;
                        damage = 22755f;
                        buildingDamageMultiplier = 0.5f;
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
                        buildingDamageMultiplier = 0.5f;
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
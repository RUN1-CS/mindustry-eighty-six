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

public class PointAirDefense {
    public static Block load() {
        return new ItemTurret("point-air-defense") {{
            requirements(Category.turret, ItemStack.with(
                    Items.copper, 300,
                    Items.lead, 140,
                    Items.silicon, 120,
                    Items.titanium, 200
            ));

            // Default Turret Values
            size = 2;
            health = 2100;
            reload = 40f;
            range = 600f;
            inaccuracy = 0f;
            rotateSpeed = 1f;
            recoil = 2f;
            shake = 0f;
            shootSound = Sounds.shootAlpha;

            // Power consumption
            consumePower(15f);

            // Liquid Cooling
            hasLiquids = true;
            liquidCapacity = 30f;
            coolantMultiplier = 2.5f;
            coolant = new ConsumeCoolant(0.4f);

            // Overdrive
            canOverdrive = true;

            // Targets
            targetGround = false;
            targetAir = true;

            // Bullet Types
            ammo(
                    Items.surgeAlloy, new PointBulletType() {{
                        shootEffect = Fx.instHit;
                        smokeEffect = Fx.lancerLaserShootSmoke;
                        trailEffect = Fx.disperseTrail;
                        speed = 380f;
                        damage = 1000f;
                        pierce = true;
                        pierceCap = 8;
                        ammoMultiplier = 1f;
                        status = StatusEffects.shocked;
                        statusDuration = 180f;
                    }},
                    Items.phaseFabric, new PointBulletType() {{
                        shootEffect = Fx.lancerLaserShoot;
                        smokeEffect = Fx.lancerLaserShootSmoke;
                        trailEffect = Fx.disperseTrail;
                        speed = 520f;
                        damage = 2000f;
                        pierce = true;
                        pierceCap = 15;
                        ammoMultiplier = 2f;
                        status = StatusEffects.blasted;
                        statusDuration = 240f;
                    }},
                    Items.silicon, new PointBulletType() {{
                        shootEffect = Fx.lancerLaserShoot;
                        smokeEffect = Fx.lancerLaserShootSmoke;
                        trailEffect = Fx.disperseTrail;
                        speed = 520f;
                        damage = 500f;
                        pierce = true;
                        pierceCap = 15;
                        ammoMultiplier = 2f;
                    }},
                    Items.graphite, new PointBulletType() {{
                        shootEffect = Fx.lancerLaserShoot;
                        smokeEffect = Fx.lancerLaserShootSmoke;
                        trailEffect = Fx.disperseTrail;
                        speed = 520f;
                        damage = 200f;
                        pierce = true;
                        pierceCap = 15;
                        ammoMultiplier = 2f;
                    }}
            );
        }};
    }
}

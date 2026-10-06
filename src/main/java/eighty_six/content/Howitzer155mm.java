package eighty_six.content;

import mindustry.content.Items;
import mindustry.entities.bullet.ArtilleryBulletType;
import mindustry.gen.Sounds;
import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.world.Block;
import mindustry.world.blocks.defense.turrets.ItemTurret;
import mindustry.world.consumers.ConsumeCoolant;
import mindustry.world.meta.Env;

public class Howitzer155mm {
    public static Block load() {
        return new ItemTurret("howitzer-155mm") {{
            requirements(Category.turret, ItemStack.with(
                    Items.copper, 120,
                    Items.lead, 90,
                    Items.graphite, 60
            ));

            // Default Turret Values
            size = 3;
            health = 3200;
            reload = 240f;
            range = 500f;
            inaccuracy = 5f;
            rotateSpeed = 4f;
            recoil = 6f;
            shake = 2f;
            shootSound = Sounds.shootArtillerySapBig;

            // Power consumption
            consumePower(25f);

            // Liquid Cooling
            hasLiquids = true;
            liquidCapacity = 30f;
            coolantMultiplier = 2.5f;
            coolant = new ConsumeCoolant(0.4f);

            // Overdrive
            canOverdrive = true;

            // Targets
            targetGround = true;
            targetAir = false;

            ammo(
                    Items.graphite, new ArtilleryBulletType(3f, 45) {{
                        lifetime = 100f;
                        width = 10f;
                        height = 10f;
                        splashDamage = 100f;
                        splashDamageRadius = 30f;
                    }},
                    Items.pyratite, new ArtilleryBulletType(3.2f, 55) {{
                        lifetime = 100f;
                        width = 10f;
                        height = 10f;
                        splashDamage = 120f;
                        splashDamageRadius = 35f;
                        makeFire = true;
                    }},
                    Items.blastCompound, new ArtilleryBulletType(3.5f, 65) {{
                        lifetime = 100f;
                        width = 10f;
                        height = 10f;
                        splashDamage = 140f;
                        splashDamageRadius = 40f;
                        makeFire = true;
                    }},
                    Items.plastanium, new ArtilleryBulletType(4f, 75) {{
                        lifetime = 100f;
                        width = 10f;
                        height = 10f;
                        splashDamage = 120f;
                        splashDamageRadius = 45f;
                        fragBullets = 4;
                        fragLifeMin = 20f;
                        fragLifeMax = 40f;
                        fragBullet = new ArtilleryBulletType(2f, 20) {{
                            lifetime = 40f;
                            width = 6f;
                            height = 6f;
                            splashDamage = 40f;
                            splashDamageRadius = 15f;
                        }};
                    }}
            );
        }};
    }
}
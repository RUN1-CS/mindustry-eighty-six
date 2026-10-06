package eighty_six.content;

import mindustry.content.Fx;
import mindustry.entities.bullet.ArtilleryBulletType;
import mindustry.entities.bullet.BasicBulletType;
import mindustry.gen.Sounds;
import mindustry.type.UnitType;
import mindustry.type.Weapon;

/** Defines the Vanagandr mecha and its cannon and heavy machine gun. */
public class VanagandrUnit {
    /** Creates and configures the Vanagandr unit type. */
    public static UnitType load() {
        return new UnitType("vanagandr") {{
            health = 2200f;
            armor = 12f;
            hitSize = 22f;

            speed = 0.85f;
            rotateSpeed = 1.2f;
            accel = 0.04f;

            targetAir = false;

            weapons.add(new Weapon("eighty_six-120mm-cannon") {{
                top = true;
                x = 0f;
                y = 1f;
                reload = 70f;
                recoil = 4f;
                shake = 4f;
                mirror = false;
                inaccuracy = 4f;
                range = 220f;
                shootSound = Sounds.shootArtillery;

                bullet = new ArtilleryBulletType(5f, 180) {{
                    lifetime = 70f;
                    width = 14f;
                    height = 16f;
                    splashDamage = 260f;
                    splashDamageRadius = 36f;
                    hitEffect = Fx.blastExplosion;
                    knockback = 2f;
                }};
            }});

            weapons.add(new Weapon("eighty_six-12mm-hmg") {{
                top = false;
                x = 8.5f;
                y = -1f;
                reload = 10f;
                recoil = 1.5f;
                mirror = true;
                range = 150f;
                ejectEffect = Fx.casing1;
                shootSound = Sounds.shoot;

                bullet = new BasicBulletType(6f, 22) {{
                    width = 5f;
                    height = 8f;
                    lifetime = 35f;
                }};
            }});
        }};
    }
}
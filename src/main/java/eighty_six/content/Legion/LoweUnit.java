package eighty_six.content.Legion;

import mindustry.content.Fx;
import mindustry.entities.bullet.ArtilleryBulletType;
import mindustry.entities.bullet.BasicBulletType;
import mindustry.gen.Sounds;
import mindustry.type.UnitType;
import mindustry.type.Weapon;

/** Defines the Lowe Legion unit and its cannon and coaxial machine gun. */
public class LoweUnit {
    /** Creates and configures the Lowe unit type. */
    public static UnitType load() {
        return new UnitType("lowe") {{
            health = 2600f;
            armor = 13f;
            hitSize = 20f;

            speed = 0.75f;
            accel = 0.05f;
            rotateSpeed = 1.5f;

            fogRadius = 18f;

            canBoost = false;
            hovering = false;

            weapons.add(new Weapon("eighty_six-120mm-lowe-cannon") {{
                top = true;
                x = 0f;
                y = 1.5f;
                reload = 65f;
                recoil = 4f;
                shake = 4f;
                mirror = false;
                inaccuracy = 3f;
                shootSound = Sounds.shootArtillery;

                bullet = new ArtilleryBulletType(6f, 220) {{
                    lifetime = 50f;
                    width = 14f;
                    height = 18f;
                    splashDamage = 280f;
                    splashDamageRadius = 40f;
                    hitEffect = Fx.blastExplosion;
                    knockback = 2.5f;
                }};
            }});

            weapons.add(new Weapon("eighty_six-coaxial-mg") {{
                top = true;
                x = 2f;
                y = 3f;
                reload = 9f;
                recoil = 1f;
                mirror = false;
                ejectEffect = Fx.casing1;
                shootSound = Sounds.shoot;

                bullet = new BasicBulletType(6f, 20) {{
                    width = 4f;
                    height = 7f;
                    lifetime = 30f;
                }};
            }});
        }};
    }
}
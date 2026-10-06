package eighty_six.content;

import mindustry.content.Fx;
import mindustry.entities.bullet.BasicBulletType;
import mindustry.gen.Sounds;
import mindustry.type.UnitType;
import mindustry.type.Weapon;

/** Defines the Ameise light Legion unit and its machine gun. */
public class AmeiseUnit {
    /** Creates and configures the Ameise unit type. */
    public static UnitType load() {
        return new UnitType("ameise") {{
            health = 180f;
            armor = 1f;
            hitSize = 9f;

            speed = 1.3f;
            accel = 0.12f;
            rotateSpeed = 4f;

            fogRadius = 35f;

            canBoost = false;
            hovering = false;

            weapons.add(new Weapon("eighty_six-14mm-machine-gun") {{
                top = false;
                x = 4f;
                y = 1f;
                reload = 6f;
                recoil = 1f;
                mirror = true;
                ejectEffect = Fx.casing1;
                shootSound = Sounds.shoot;

                bullet = new BasicBulletType(7f, 16) {{
                    width = 4f;
                    height = 7f;
                    lifetime = 28f;
                    buildingDamageMultiplier = 0.5f;
                }};
            }});
        }};
    }
}
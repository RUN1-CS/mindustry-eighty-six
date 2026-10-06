package eighty_six.content;

import mindustry.content.Fx;
import mindustry.entities.bullet.ArtilleryBulletType;
import mindustry.gen.Sounds;
import mindustry.type.UnitType;
import mindustry.type.Weapon;

/** Defines the Zentaur Legion unit and its electromagnetic catapult. */
public class ZentaurUnit {
    /** Creates and configures the Zentaur unit type. */
    public static UnitType load() {
        return new UnitType("zentaur") {{
            health = 12000f;
            armor = 25f;
            hitSize = 48f;

            speed = 0.35f;
            accel = 0.02f;
            rotateSpeed = 0.6f;

            fogRadius = 40f;

            canBoost = false;
            hovering = false;

            weapons.add(new Weapon("eighty_six-electromagnetic-catapult") {{
                top = true;
                x = 0f;
                y = 0f;
                reload = 240f;
                recoil = 10f;
                shake = 12f;
                mirror = false;
                shootSound = Sounds.shootArtillery;

                bullet = new ArtilleryBulletType(8f, 850) {{
                    lifetime = 120f;
                    width = 24f;
                    height = 28f;
                    splashDamage = 950f;
                    splashDamageRadius = 80f;
                    hitEffect = Fx.reactorExplosion;
                    shootEffect = Fx.shootBig;
                    smokeEffect = Fx.smokeCloud;
                    knockback = 8f;
                }};
            }});
        }};
    }
}
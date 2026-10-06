package eighty_six.content.Humankind;

import mindustry.content.Fx;
import mindustry.content.StatusEffects;
import mindustry.entities.bullet.BasicBulletType;
import mindustry.entities.bullet.PointBulletType;
import mindustry.gen.Sounds;
import mindustry.type.UnitType;
import mindustry.type.Weapon;

/** Defines the Juggernaut mecha and its cannon, machine gun, and blade. */
public class JuggernautUnit {
    /** Creates and configures the Juggernaut unit type. */
    public static UnitType load() {
        return new UnitType("juggernaut") {{
            speed = 1.15f;
            hitSize = 10f;
            health = 140f;
            armor = 0.5f;

            canBoost = false;
            hovering = false;

            weapons.add(new Weapon("eighty_six-57mm-smoothbore") {{
                top = true;
                x = 0f;
                y = 2f;
                reload = 45f;
                recoil = 3f;
                shake = 2f;
                mirror = false;
                shootSound = Sounds.shootArtillery;

                bullet = new PointBulletType() {{
                    speed = 280f;
                    damage = 320f;
                    rangeOverride = 280f;
                    pierce = true;
                    pierceCap = 2;
                    buildingDamageMultiplier = 1.5f;
                    shootEffect = Fx.shootBig;
                    smokeEffect = Fx.smokeCloud;
                    hitEffect = Fx.blastExplosion;
                    trailEffect = Fx.railTrail;
                }};
            }});

            weapons.add(new Weapon("eighty_six-12mm-hmg") {{
                top = false;
                x = 4.5f;
                y = 0f;
                reload = 8f;
                recoil = 1f;
                ejectEffect = Fx.casing1;
                shootSound = Sounds.shoot;
                mirror = true;

                bullet = new BasicBulletType(6f, 18) {{
                    width = 5f;
                    height = 8f;
                    lifetime = 30f;
                    rangeOverride = 180f;
                    incendAmount = 0;
                }};
            }});

            weapons.add(new Weapon("eighty_six-hf-blade") {{
                top = false;
                x = 3.5f;
                y = 3f;
                reload = 30f;
                recoil = 0f;
                mirror = true;
                shootSound = Sounds.shootArc;

                bullet = new BasicBulletType(0f, 0) {{
                    lifetime = 1f;
                    rangeOverride = 16f;
                    splashDamage = 450f;
                    splashDamageRadius = 16f;
                    hitEffect = Fx.colorSpark;
                    status = StatusEffects.corroded;
                }};
            }});
        }};
    }
}
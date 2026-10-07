package eighty_six.content.Humankind;

import mindustry.content.Fx;
import mindustry.entities.bullet.BasicBulletType;
import mindustry.entities.bullet.PointBulletType;
import mindustry.gen.Sounds;
import mindustry.gen.LegsUnit;
import mindustry.type.UnitType;
import mindustry.type.Weapon;

/** Defines the Reginleif mecha and its cannon and close-range weapons. */
public class ReginleifUnit {
    /** Creates and configures the Reginleif unit type. */
    public static UnitType load() {
        return new UnitType("reginleif") {{

            localizedName = "XM2 Reginleif";

            health = 380f;
            armor = 3f;
            hitSize = 12f;

            speed = 1.4f;
            accel = 0.15f;
            rotateSpeed = 3.5f;

            canBoost = false;
            hovering = false;

            weapons.add(new Weapon("eighty_six-eighty_six-88mm-smoothbore") {{
                top = true;
                x = 0f;
                y = 2f;
                reload = 35f;
                recoil = 3.5f;
                shake = 3f;
                mirror = false;
                shootSound = Sounds.shootArtillery;

                name = "eighty_six-eighty_six-88mm-smoothbore";

                bullet = new PointBulletType() {{
                    speed = 320f;
                    rangeOverride = 320f;
                    damage = 210f;
                    pierce = true;
                    pierceCap = 3;
                    buildingDamageMultiplier = 1.2f;
                    shootEffect = Fx.shootBig;
                    smokeEffect = Fx.smokeCloud;
                    hitEffect = Fx.blastExplosion;
                    trailEffect = Fx.railTrail;
                }};
            }});

            weapons.add(new Weapon("eighty_six-eighty_six-leg-piledriver") {{
                top = false;
                x = 5f;
                y = 0f;
                reload = 20f;
                recoil = 0f;
                mirror = true;
                shootSound = Sounds.shootBreach;

                bullet = new BasicBulletType(0f, 0) {{
                    lifetime = 1f;
                    rangeOverride = 12f;
                    splashDamage = 180f;
                    splashDamageRadius = 12f;
                    hitEffect = Fx.hitLancer;
                }};
            }});

            weapons.add(new Weapon("eighty_six-eighty_six-reginleif-hf-blade") {{
                top = false;
                x = 4f;
                y = 3f;
                reload = 25f;
                mirror = true;
                shootSound = Sounds.shootArc;

                name = "eighty_six-eighty_six-reginleif-hf-blade";

                bullet = new BasicBulletType(0f, 0) {{
                    lifetime = 1f;
                    rangeOverride = 16f;
                    splashDamage = 350f;
                    splashDamageRadius = 16f;
                    hitEffect = Fx.colorSpark;
                }};
            }});

            constructor = LegsUnit::create;

            legCount = 4;
            legLength = 16f;
            legGroupSize = 2;
            legSpeed = 1.2f;
            legMoveSpace = 1.0f;
            legPairOffset = 0.8f;
            legExtension = -2f;
            legBaseOffset = 3f;

            allowLegStep = true;
            shadowElevation = 0.35f;
        }};
    }
}
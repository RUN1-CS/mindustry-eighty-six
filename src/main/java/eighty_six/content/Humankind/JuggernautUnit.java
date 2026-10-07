package eighty_six.content.Humankind;

import arc.Core;
import mindustry.content.Fx;
import mindustry.content.StatusEffects;
import mindustry.entities.bullet.BasicBulletType;
import mindustry.entities.bullet.PointBulletType;
import mindustry.gen.Sounds;
import mindustry.gen.LegsUnit;
import mindustry.type.UnitType;
import mindustry.type.Weapon;

/** Defines the Juggernaut mecha and its cannon, machine gun, and blade. */
public class JuggernautUnit {
    /** Creates and configures the Juggernaut unit type. */
    public static UnitType load() {
        return new UnitType("juggernaut") {{

            localizedName = "M1A4 Juggernaut";

            speed = 1.15f;
            hitSize = 10f;
            health = 140f;
            armor = 0.5f;

            canBoost = false;
            hovering = false;

            weapons.add(new Weapon("eighty_six-eighty_six-57mm-smoothbore") {{
                top = true;
                x = 0f;
                y = 2f;
                reload = 45f;
                recoil = 3f;
                shake = 2f;
                mirror = false;
                shootSound = Sounds.shootArtillery;

                name = "eighty_six-eighty_six-57mm-smoothbore";

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

            weapons.add(new Weapon("eighty_six-eighty_six-12mm-hmg") {{
                top = false;
                x = 4.5f;
                y = 0f;
                reload = 8f;
                recoil = 1f;
                ejectEffect = Fx.casing1;
                shootSound = Sounds.shoot;
                mirror = true;

                name = "eighty_six-eighty_six-12mm-hmg";

                bullet = new BasicBulletType(6f, 18) {{
                    width = 5f;
                    height = 8f;
                    lifetime = 30f;
                    rangeOverride = 180f;
                    incendAmount = 0;
                }};
            }});

            weapons.add(new Weapon("eighty_six-eighty_six-hf-blade") {{
                top = false;
                x = 3.5f;
                y = 3f;
                reload = 30f;
                recoil = 0f;
                mirror = true;
                shootSound = Sounds.shootArc;

                name = "eighty_six-eighty_six-hf-blade";

                bullet = new BasicBulletType(0f, 0) {{
                    lifetime = 1f;
                    rangeOverride = 16f;
                    splashDamage = 450f;
                    splashDamageRadius = 16f;
                    hitEffect = Fx.colorSpark;
                    status = StatusEffects.corroded;
                }};
            }});

            constructor = LegsUnit::create;

            drawCell = false;
            outlineRadius = 0;

            // Quadrupedal Setup
            legCount = 4;
            legLength = 14f;
            legGroupSize = 2;
            legSpeed = 0.8f;
            legMoveSpace = 1.2f;
            legPairOffset = 0.8f;
            legExtension = -2f;
            legBaseOffset = 3f;

            allowLegStep = true;
            shadowElevation = 0.35f;
        }};
    }
}
package eighty_six.content.Legion;

import mindustry.content.Fx;
import mindustry.entities.bullet.ArtilleryBulletType;
import mindustry.entities.bullet.BasicBulletType;
import mindustry.gen.Sounds;
import mindustry.type.UnitType;
import mindustry.type.Weapon;

/** Defines the Morpho super-heavy Legion unit and its long-range armament. */
public class MorphoUnit {
    /** Creates and configures the Morpho unit type. */
    public static UnitType load() {
        return new UnitType("morpho") {{
            health = 28000f;
            armor = 35f;
            hitSize = 64f;

            speed = 0.25f;
            accel = 0.01f;
            rotateSpeed = 0.4f;

            fogRadius = 60f;

            canBoost = false;
            hovering = false;

            weapons.add(new Weapon("eighty_six-800mm-railgun") {{
                top = true;
                x = 0f;
                y = 0f;
                reload = 450f;
                recoil = 12f;
                shake = 20f;
                mirror = false;
                shootSound = Sounds.shootBeamPlasma;

                bullet = new ArtilleryBulletType(16f, 2500) {{
                    lifetime = 120f;
                    width = 30f;
                    height = 40f;
                    splashDamage = 2200f;
                    splashDamageRadius = 120f;
                    buildingDamageMultiplier = 3.0f;
                    hitEffect = Fx.reactorExplosion;
                    shootEffect = Fx.shootBig;
                    smokeEffect = Fx.smokeCloud;
                    trailEffect = Fx.railTrail;
                    knockback = 12f;
                }};
            }});

            weapons.add(new Weapon("eighty_six-40mm-vulcan") {{
                top = true;
                x = 12f;
                y = 8f;
                reload = 4f;
                recoil = 1f;
                mirror = true;
                ejectEffect = Fx.casing2;
                shootSound = Sounds.shoot;

                bullet = new BasicBulletType(8f, 35) {{
                    width = 6f;
                    height = 10f;
                    lifetime = 30f;
                }};
            }});

            weapons.add(new Weapon("eighty_six-40mm-vulcan-rear") {{
                top = true;
                x = 16f;
                y = -10f;
                reload = 4f;
                recoil = 1f;
                mirror = true;
                ejectEffect = Fx.casing2;
                shootSound = Sounds.shoot;

                bullet = new BasicBulletType(8f, 35) {{
                    width = 6f;
                    height = 10f;
                    lifetime = 30f;
                }};
            }});

            weapons.add(new Weapon("eighty_six-wire-wings") {{
                top = false;
                x = 20f;
                y = 0f;
                reload = 15f;
                mirror = true;
                shootSound = Sounds.shootArc;

                bullet = new BasicBulletType(0f, 0) {{
                    lifetime = 1f;
                    rangeOverride = 32f;
                    splashDamage = 120f;
                    splashDamageRadius = 32f;
                    hitEffect = Fx.colorSpark;
                }};
            }});
        }};
    }
}
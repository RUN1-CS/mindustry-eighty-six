package eighty_six.content;

import mindustry.content.Fx;
import mindustry.entities.bullet.ArtilleryBulletType;
import mindustry.entities.bullet.BasicBulletType;
import mindustry.gen.Sounds;
import mindustry.type.UnitType;
import mindustry.type.Weapon;

/** Defines the Dinosauria heavy Legion unit and its three weapons. */
public class DinosauriaUnit {
    /** Creates and configures the Dinosauria unit type. */
    public static UnitType load() {
        return new UnitType("dinosauria") {{
            health = 5500f;
            armor = 20f;
            hitSize = 32f;

            speed = 0.5f;
            accel = 0.03f;
            rotateSpeed = 0.9f;

            fogRadius = 22f;

            canBoost = false;
            hovering = false;

            weapons.add(new Weapon("eighty_six-155mm-dinosauria-cannon") {{
                top = true;
                x = 0f;
                y = 2f;
                reload = 90f;
                recoil = 6f;
                shake = 6f;
                mirror = false;
                shootSound = Sounds.shootArtillerySapBig;

                bullet = new ArtilleryBulletType(7f, 450) {{
                    lifetime = 60f;
                    width = 18f;
                    height = 22f;
                    splashDamage = 400f;
                    splashDamageRadius = 50f;
                    hitEffect = Fx.reactorExplosion;
                    knockback = 4f;
                }};
            }});

            weapons.add(new Weapon("eighty_six-75mm-coaxial") {{
                top = true;
                x = 4f;
                y = 3f;
                reload = 35f;
                recoil = 2.5f;
                mirror = false;
                shootSound = Sounds.shootArtillery;

                bullet = new BasicBulletType(6f, 120) {{
                    width = 10f;
                    height = 14f;
                    lifetime = 45f;
                    splashDamage = 60f;
                    splashDamageRadius = 20f;
                }};
            }});

            weapons.add(new Weapon("eighty_six-dinosauria-hmg") {{
                top = false;
                x = 10f;
                y = -2f;
                reload = 8f;
                recoil = 1f;
                mirror = true;
                ejectEffect = Fx.casing1;
                shootSound = Sounds.shoot;

                bullet = new BasicBulletType(6f, 22) {{
                    width = 5f;
                    height = 8f;
                    lifetime = 32f;
                }};
            }});
        }};
    }
}
package eighty_six.content;

import mindustry.content.Items;
import mindustry.entities.bullet.ArtilleryBulletType;
import mindustry.gen.Sounds;
import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.world.Block;
import mindustry.world.blocks.defense.turrets.ItemTurret;
import mindustry.world.meta.Env;

public class Howitzer155mm {
    public static Block load() {
        return new ItemTurret("howitzer-155mm") {{
            requirements(Category.turret, ItemStack.with(
                    Items.copper, 120,
                    Items.lead, 90,
                    Items.graphite, 60
            ));

            ammo(
                    Items.graphite, new ArtilleryBulletType(3f, 45) {{
                        lifetime = 100f;
                        width = 10f;
                        height = 10f;
                        splashDamage = 50f;
                        splashDamageRadius = 30f;
                    }},
                    Items.pyratite, new ArtilleryBulletType(3.2f, 55) {{
                        lifetime = 100f;
                        width = 10f;
                        height = 10f;
                        splashDamage = 60f;
                        splashDamageRadius = 35f;
                        makeFire = true;
                    }}
            );

            size = 3;
            reload = 110f;
            range = 300f;
            targetAir = false;
            targetGround = true;
            inaccuracy = 4f;
            shootSound = Sounds.shootArtillerySapBig;
            envEnabled |= Env.terrestrial;
        }};
    }
}
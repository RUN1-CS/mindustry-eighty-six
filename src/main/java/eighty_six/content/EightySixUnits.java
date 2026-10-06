package eighty_six.content;

import eighty_six.content.Humankind.JuggernautUnit;
import eighty_six.content.Humankind.ReginleifUnit;
import eighty_six.content.Humankind.VanagandrUnit;
import eighty_six.content.Legion.AmeiseUnit;
import eighty_six.content.Legion.DinosauriaUnit;
import eighty_six.content.Legion.LoweUnit;
import eighty_six.content.Legion.MorphoUnit;
import eighty_six.content.Legion.ZentaurUnit;
import mindustry.type.UnitType;

/** Registry and loader for the mod's mecha and Legion units. */
public class EightySixUnits {
    // Mecha units.
    public static UnitType juggernaut;
    public static UnitType vanagandr;
    public static UnitType reginleif;

    // Legion units.
    public static UnitType ameise;
    public static UnitType lowe;
    public static UnitType dinosauria;
    public static UnitType zentaur;
    public static UnitType morpho;

    /** Creates every unit in load order for use by factories and the tech tree. */
    public static void load() {
        juggernaut = JuggernautUnit.load();
        vanagandr = VanagandrUnit.load();
        reginleif = ReginleifUnit.load();

        ameise = AmeiseUnit.load();
        lowe = LoweUnit.load();
        dinosauria = DinosauriaUnit.load();
        zentaur = ZentaurUnit.load();
        morpho = MorphoUnit.load();
    }
}
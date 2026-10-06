# Eighty Six (86) - Mindustry Mod

Eighty Six is a Mindustry Java mod inspired by the _Eighty Six_ light novel and anime series by Asato Asato. It adds military units, production buildings, and turrets from the Republic of San Magnolia and the Giad Empire.

---

## Content

### Units

- **Mecha:** Juggernaut, Vanagandr, and Reginleif.
- **Legion:** Ameise, Lowe, Dinosauria, Zentaur, and Morpho.

The Legion units form a reconstructor progression from Ameise through Morpho. The Mecha Factory produces the mecha units and Ameise directly.

### Blocks

- **Morpho Coilgun** (`morpho-coilgun`): A long-range, piercing turret using Surge Alloy and Phase Fabric ammunition.
- **155mm Howitzer** (`howitzer-155mm`): A ground-only artillery turret with graphite, Pyratite, Blast Compound, and Plastanium shells.
- **Point Air Defense** (`point-air-defense`): An anti-air turret with four ammunition options.
- **Mecha Factory** (`mecha-factory`): Produces the mod's mecha and the Ameise.

---

## Installation

### Option 1: Automatic (In-Game)

1. Launch **Mindustry**.
2. Open **Mods** and choose **Import Mod**.
3. Select **Import Github Repository**.
4. Enter `RUN1-CS/mindustry-eighty-six` and confirm.

### Option 2: Manual Build

1. Clone the repository:
   ```bash
   git clone https://github.com/RUN1-CS/mindustry-eighty-six
   cd mindustry-eighty-six
   ./gradlew install
   ```

## Project Structure

The Java source follows a consistent content-loading structure:

```text
src/main/java/eighty_six/
   eighty_six.java              Mod entry point
   content/
      EightySixBlocks.java       Block registry and loader
      EightySixUnits.java        Unit registry and loader
      EightySixTechTree.java     Tech-tree registration
      *Unit.java                  Unit definitions
      *Turret.java                Turret definitions
      *Factory.java               Production-block definitions
```

Each content class documents its purpose and exposes a `load()` method. Registry classes call those loaders in dependency order before the tech tree is built.

## Requirements

- Java 17 or newer
- A local Mindustry installation for testing
- Android SDK only when producing an Android-compatible jar

## Build and Install

Build the desktop jar with:

```bash
./gradlew build
```

Build the release jar and copy it to the local Mindustry mods directory with:

```bash
./gradlew install
```

The desktop jar is written to `build/libs/eighty-sixDesktop.jar`. The universal release jar is written to `build/libs/eighty-six.jar` when the Android build is available.

## License

This project is an independent fan-made mod and is not affiliated with the creators or rights holders of _Eighty Six_.

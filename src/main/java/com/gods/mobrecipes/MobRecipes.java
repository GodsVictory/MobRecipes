package gods.mobrecipes;

import net.minecraftforge.fml.common.Mod;

@Mod(modid = MobRecipes.MODID, version = MobRecipes.VERSION, name = MobRecipes.NAME)
public class MobRecipes {
  public static final String MODID = "mobrecipes";
  public static final String NAME = "mobrecipes";
  public static final String VERSION = "1.0.0";

  @Mod.Instance(MODID)
  public static MobRecipes instance;
}

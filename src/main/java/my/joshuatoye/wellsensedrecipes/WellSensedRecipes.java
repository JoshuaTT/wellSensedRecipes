package my.joshuatoye.wellsensedrecipes;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public final class WellSensedRecipes extends JavaPlugin {


    @Override
    public void onEnable() {
        // Plugin startup logic

       SensibleRecipeBook srb = new SensibleRecipeBook();
       srb.addAllRecipes(this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

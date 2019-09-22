package my.joshuatoye.wellsensedrecipes;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.Tag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.plugin.Plugin;

import java.util.EnumSet;
import java.util.Set;

public class SensibleRecipeBook {

    private void addSaddleRecipe(WellSensedRecipes thisParent)
    {
        ItemStack saddle = new ItemStack(Material.SADDLE);
        NamespacedKey saddleKey = new NamespacedKey(thisParent, "saddle");
        ShapedRecipe saddleRecipe = new ShapedRecipe(saddleKey, saddle);
        saddleRecipe.shape("LLL", "ILI", "LLL");
        saddleRecipe.setIngredient('L', Material.LEATHER);
        saddleRecipe.setIngredient('I', Material.IRON_INGOT);

        Bukkit.addRecipe(saddleRecipe);

    }

    private void addStringRecipe(WellSensedRecipes thisParent)
    {
        ItemStack stringStack = new ItemStack(Material.STRING, 3);
        Set<Material> ALL_WOOL = Tag.WOOL.getValues();

        int i = 0;
        for(Material wool : ALL_WOOL)
        {
           String stringName = "string" + i;
           NamespacedKey stringKey = new NamespacedKey(thisParent, stringName);
           ShapelessRecipe stringRecipe = new ShapelessRecipe(stringKey, stringStack);
           stringRecipe.addIngredient(wool);
           Bukkit.addRecipe(stringRecipe);
           ++i;
        }
    }

    public void addAllRecipes(WellSensedRecipes thisParent)
    {
        addSaddleRecipe(thisParent);
        addStringRecipe(thisParent);
    }
}

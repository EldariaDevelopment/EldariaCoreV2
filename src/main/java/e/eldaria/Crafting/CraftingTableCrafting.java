package e.eldaria.Crafting;

import e.eldaria.Eldaria;
import org.bukkit.Bukkit;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.ShapelessRecipe;

import java.util.List;

public class CraftingTableCrafting {
    public static void RegisterRecipe(List<ItemStack> items, boolean RecipeType, String RecipeName) {
        if (items.size() != 10) {
            throw new IllegalArgumentException("Exactly 10 items are required");
        }
        //0 returns a shaped recipe
        //1 returns a shapeless recipe
        ItemStack ResultItem = items.get(9);
        switch (RecipeType){
            case 0:
                ShapedRecipe recipe = new ShapedRecipe(new NamespacedKey(Eldaria.GetInstance(), RecipeName),ResultItem);
                recipe.setIngredient('e', items.get(1));
                Bukkit.addRecipe(recipe);
                break;
            case 1:
                ShapelessRecipe recipe = new ShapelessRecipe(Key, );
                break;
        }
    }

    public static void UnregisterRecipe(int ID) {
        if (items.size() != 10) {
            throw new IllegalArgumentException("Exactly 10 items are required");
        }
    }

}


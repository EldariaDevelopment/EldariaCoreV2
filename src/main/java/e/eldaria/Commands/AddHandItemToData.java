package e.eldaria.Commands;

import e.eldaria.DataStorage.DataOperators;
import e.eldaria.Eldaria;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public class AddHandItemToData implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        if (!(sender instanceof Player)){
            sender.sendMessage("Only Players can run this command.");
            return true;
        }
        Eldaria.getConfigHandler().getConfig().set("potato", 2);
        Eldaria.getConfigHandler().saveConfig();

        Player player = (Player) sender;
        ItemStack itemInHand = player.getInventory().getItemInMainHand();
        if (itemInHand == null || itemInHand.getType().isAir()) {
            player.sendMessage("You must hold an item in your main hand to use this command.");

            return true;
        }


        return true;
    }
}

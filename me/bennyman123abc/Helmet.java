package me.bennyman123abc;
 
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffectType;
 
public class Helmet extends org.bukkit.plugin.java.JavaPlugin implements org.bukkit.event.Listener
{
  public void onEnable()
  {
    getLogger().info("Plugin Made by bennyman123abc");
     
    Bukkit.getPluginManager().registerEvents(this, this);
    checkHelmet();
  }
   
  public void checkHelmet() {
    Bukkit.getScheduler().scheduleSyncRepeatingTask(this, new Runnable()
    {
      public void run()
      {
        for (Player player : Bukkit.getServer().getOnlinePlayers())
        {
 
 
          if ((player.getInventory().getHelmet() != null) && (player.getInventory().getHelmet().getType() == Material.GOLD_HELMET)) {
            player.addPotionEffect(new org.bukkit.potion.PotionEffect(PotionEffectType.NIGHT_VISION, 1000000, 0));
 
 
 
          }
          else
          {
 
 
            player.removePotionEffect(PotionEffectType.NIGHT_VISION);
          }
          
        }
         
      }
    }, 0L, 2L);
  }
   
 
  public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
  {
    if (cmd.getName().equalsIgnoreCase("minerhelmets")) {
      sender.sendMessage(ChatColor.GOLD + "Miner Helmets");
      sender.sendMessage(ChatColor.GOLD + "Plugin Made by bennyman123abc");
      sender.sendMessage(ChatColor.GREEN + "Version: 1.1");
      return true;
    }
     
    return false;
  }
}
/*    */ package me.bennyman123abc;
/*    */ 
/*    */ import org.bukkit.Bukkit;
/*    */ import org.bukkit.ChatColor;
/*    */ import org.bukkit.Material;
/*    */ import org.bukkit.Server;
/*    */ import org.bukkit.command.Command;
/*    */ import org.bukkit.command.CommandSender;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.inventory.PlayerInventory;
/*    */ import org.bukkit.plugin.PluginManager;
/*    */ import org.bukkit.potion.PotionEffectType;
/*    */ import org.bukkit.scheduler.BukkitScheduler;
/*    */ 
/*    */ public class Helmet extends org.bukkit.plugin.java.JavaPlugin implements org.bukkit.event.Listener
/*    */ {
/*    */   public void onEnable()
/*    */   {
/* 19 */     getLogger().info("Plugin Made by bennyman123abc");
/*    */     
/* 21 */     Bukkit.getPluginManager().registerEvents(this, this);
/* 22 */     checkHelmet();
/*    */   }
/*    */   
/*    */   public void checkHelmet() {
/* 26 */     Bukkit.getScheduler().scheduleSyncRepeatingTask(this, new Runnable()
/*    */     {
/*    */       public void run()
/*    */       {
/* 30 */         for (Player player : Bukkit.getServer().getOnlinePlayers())
/*    */         {
/*    */ 
/*    */ 
/* 34 */           if ((player.getInventory().getHelmet() != null) && (player.getInventory().getHelmet().getType() == Material.GOLD_HELMET)) {
/* 35 */             player.addPotionEffect(new org.bukkit.potion.PotionEffect(PotionEffectType.NIGHT_VISION, 1000000, 0));
/*    */ 
/*    */ 
/*    */ 
/*    */           }
/*    */           else
/*    */           {
/*    */ 
/*    */ 
/* 44 */             player.removePotionEffect(PotionEffectType.NIGHT_VISION);
/*    */           }
/*    */           
/*    */         }
/*    */         
/*    */       }
/* 50 */     }, 0L, 2L);
/*    */   }
/*    */   
/*    */ 
/*    */   public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
/*    */   {
/* 56 */     if (cmd.getName().equalsIgnoreCase("minerhelmets")) {
/* 57 */       sender.sendMessage(ChatColor.GOLD + "Miner Helmets");
/* 58 */       sender.sendMessage(ChatColor.GOLD + "Plugin Made by bennyman123abc");
/* 59 */       sender.sendMessage(ChatColor.GREEN + "Version: 1.1");
/*    */     }
/*    */     
/* 62 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\autocad\Downloads\MinerHelmetsPlus.jar!\me\bennyman123abc\Helmet.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */
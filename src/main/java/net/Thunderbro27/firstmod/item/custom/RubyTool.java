package net.Thunderbro27.firstmod.item.custom;



import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.extensions.IForgeItemStack;

public class RubyTool extends SwordItem {


    public RubyTool(Tier p_43269_, Properties pProperties) {
        super(p_43269_, pProperties);
    }

    @Override
     public void onInventoryTick(ItemStack stack, Level level, Player player, int slotIndex, int selectedIndex) {
        int yLevel = (int)player.getY();

            if(!level.isClientSide() && yLevel>= 48){

            }

        }

    }
    /*private boolean hasRubyTool(Player player){
        boolean rubyTool = player.getInventory().contains(ModTags.Items.RUBY_TOOL);
                if(rubyTool == true){
                    return true;
                }
        return false;
       }
    }*/


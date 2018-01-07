package com.ayutaki.chinjufumod.init.kitchen;

import java.util.List;

import javax.annotation.Nullable;

import com.ayutaki.chinjufumod.init.ASDecoModKitchen;
import com.ayutaki.chinjufumod.init.blocks.BlockFacingSapo;
import com.ayutaki.chinjufumod.inventory.ContainerKitBoard;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.IInteractionObject;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockKit_board extends BlockFacingSapo {

    public BlockKit_board() {

        super(Material.WOOD);

		/*木製*/
		this.setSoundType(SoundType.WOOD);
		this.setHardness(1.0F);
		this.setResistance(10.0F);

    }

    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand,
    		@Nullable ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ) {

        if (worldIn.isRemote) {

            return true;
        }

        else {

            /*書き換え*/
            playerIn.displayGui(new BlockKit_board.InterfaceCraftingTable(worldIn, pos));
            playerIn.addStat(StatList.CRAFTING_TABLE_INTERACTION);
            return true;
        }
    }

    public static class InterfaceCraftingTable implements IInteractionObject {

    	private final World world;
    	private final BlockPos position;

    	public InterfaceCraftingTable(World worldIn, BlockPos pos) {

    	    this.world = worldIn;
    	    this.position = pos;
    	}

    	/**
    	 * Get the name of this object. For players this returns their username
    	 */
    	public String getName() {
    	    return null;
    	}

    	/**
    	 * Returns true if this thing is named
    	 */
    	public boolean hasCustomName() {
    	    return false;
    	}

    	/**
    	 * Get the formatted ChatComponent that will be used for the sender's username in chat
    	 */
        /*書き換え*/
    	public ITextComponent getDisplayName() {

    	    return new TextComponentTranslation(ASDecoModKitchen.KIT_BOARD.getUnlocalizedName() + ".name", new Object[0]);
    	}

    	public Container createContainer(InventoryPlayer playerInventory, EntityPlayer playerIn) {
    	    return new ContainerKitBoard(playerInventory, this.world, this.position);
    	}

    	public String getGuiID() {

            /*書き換えずにマイクラのを引っ張ってくる*/
    	    return "minecraft:crafting_table";
    	}
    }

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, EntityPlayer player, List<String> tooltip, boolean advanced) {
		int meta = stack.getMetadata();
		tooltip.add(I18n.format("tips.tile.block_kit_board.name", meta));
	}

}

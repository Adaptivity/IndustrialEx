package xbony2.IndustrialEx.crossmod.te.ic2recipes;

import java.util.Arrays;
import java.util.List;

import thermalfoundation.block.BlockOre;
import net.minecraft.item.ItemStack;
import ic2.api.recipe.IRecipeInput;

public class FerrousOreInput1 implements IRecipeInput{

	@Override
	public boolean matches(ItemStack subject){
		if(BlockOre.oreNickel.getItem() == subject.getItem() && subject.getItemDamage() == 4){
			return true;
		}
		return false;
	}

	@Override
	public int getAmount(){
		return 1;
	}

	@Override
	public List<ItemStack> getInputs() {
		List<ItemStack> list = Arrays.asList(new ItemStack(BlockOre.oreNickel.getItem(), 1, 4));
		return list;
	}

}
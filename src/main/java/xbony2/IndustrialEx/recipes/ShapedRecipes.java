package xbony2.IndustrialEx.recipes;

import ic2.api.item.IC2Items;
import xbony2.IndustrialEx.registery.RegBlocks;
import xbony2.IndustrialEx.registery.RegItems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;

public class ShapedRecipes {

	private static final String[] helmet = new String[]{"xxx", "x x"};
	private static final String[] chestplate = new String[]{"x x", "xxx", "xxx"};
	private static final String[] leggings = new String[]{"xxx", "x x", "x x"};
	private static final String[] boots = new String[]{"x x", "x x"};
	private static final String[] pickaxe = new String[]{"xxx", " s ", " s "};
	private static final String[] sword = new String[]{" x ", " x ", " s "};
	private static final String[] shovel = new String[]{"x", "s", "s"};
	private static final String[] axe = new String[]{"xx", "xs", " s"};
	private static final String[] block = new String[]{"xxx", "xxx", "xxx"};
	
	/**
	 * Adds all the shaped recipes.
	 * 
	 * @author xbony2
	 */
	public static void addRecipes(){
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(RegBlocks.darkSteelBlock), new Object[]{
			block, 'x', "ingotDarkSteel"}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(RegItems.darkSteelKinRotor), new Object[]{
				" b ",
				"bsb",
				" b ", 's', IC2Items.getItem("steelshaft"), 'b', RegItems.darkSteelRotorBlade}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(RegItems.darkSteelRotorBlade), new Object[]{
			"pip",
			"pip",
			"pip", 'p', "plateDarkSteel", 'i', "ingotDarkSteel"}));
	}
}

package mezz.jei.plugins.vanilla.crafting;

import mezz.jei.api.recipe.IRecipeHandler;
import mezz.jei.api.recipe.IRecipeWrapper;
import mezz.jei.api.recipe.VanillaRecipeCategoryUid;

import javax.annotation.Nonnull;

public class TippedArrowRecipeHandler implements IRecipeHandler<TippedArrowRecipeWrapper> {
	@Nonnull
	@Override
	public Class<TippedArrowRecipeWrapper> getRecipeClass() {
		return TippedArrowRecipeWrapper.class;
	}

	@Nonnull
	@Override
	public String getRecipeCategoryUid() {
		return VanillaRecipeCategoryUid.CRAFTING;
	}

	@Nonnull
	@Override
	public IRecipeWrapper getRecipeWrapper(@Nonnull TippedArrowRecipeWrapper recipe) {
		return recipe;
	}

	@Override
	public boolean isRecipeValid(@Nonnull TippedArrowRecipeWrapper recipe) {
		return true;
	}
}

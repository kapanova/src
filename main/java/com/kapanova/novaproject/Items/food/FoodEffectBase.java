package com.kapanova.novaproject.Items.food;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class FoodEffectBase extends FoodBase

{
	PotionEffect effect;
	public FoodEffectBase(String name, int amount, float saturation, boolean isAnimalFood)
	{
		super(name, amount, saturation, isAnimalFood);
		setAlwaysEdible();
	}
	
	@Override
	public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase entityLiving)
	{

		entityLiving.addPotionEffect(new PotionEffect(MobEffects.SPEED, 2*(20*60), 1, false, true));
		entityLiving.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 2*(20*60), 1, false, true));
		return super.onItemUseFinish(stack, worldIn, entityLiving);
		
	}
	@Override
    public boolean hasEffect(ItemStack stack) 
    {
        return true;
    }
}
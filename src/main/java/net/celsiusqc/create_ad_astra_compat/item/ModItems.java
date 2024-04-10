package net.celsiusqc.create_ad_astra_compat.item;

import net.celsiusqc.create_ad_astra_compat.CreateAdAstraCompat;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CreateAdAstraCompat.MOD_ID);

    public static final RegistryObject<Item> CRUSHED_CALORITE_ORE = ITEMS.register("crushed_calorite_ore",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CRUSHED_DESH_ORE = ITEMS.register("crushed_desh_ore",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CRUSHED_OSTRUM_ORE = ITEMS.register("crushed_ostrum_ore",
            () -> new Item(new Item.Properties()));





    public static void register (IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}

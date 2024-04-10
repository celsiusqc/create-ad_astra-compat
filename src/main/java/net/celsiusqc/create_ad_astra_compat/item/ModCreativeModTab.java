package net.celsiusqc.create_ad_astra_compat.item;

import net.celsiusqc.create_ad_astra_compat.CreateAdAstraCompat;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;


public class ModCreativeModTab {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CreateAdAstraCompat.MOD_ID);


    public static final RegistryObject<CreativeModeTab> CREATE_AD_ASTRA_COMPAT_TAB = CREATIVE_MODE_TABS.register("create_ad_astra_compat",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CRUSHED_CALORITE_ORE.get()))
                    .title(Component.translatable("creativetab.create_ad_astra_compat_tab"))
                    .displayItems((pParameters, pOutput) -> {


                        if (ModList.get().isLoaded("ad_astra") && ModList.get().isLoaded("create")) {
                            pOutput.accept(ModItems.CRUSHED_CALORITE_ORE.get());
                            pOutput.accept(ModItems.CRUSHED_DESH_ORE.get());
                            pOutput.accept(ModItems.CRUSHED_OSTRUM_ORE.get());
                        }


                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register((eventBus));
    }


}

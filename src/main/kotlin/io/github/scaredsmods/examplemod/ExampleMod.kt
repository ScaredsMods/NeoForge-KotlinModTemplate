package io.github.scaredsmods.io.github.scaredsmods.examplemod

import com.mojang.logging.LogUtils
import net.neoforged.bus.EventBus
import net.neoforged.bus.api.IEventBus
import net.neoforged.fml.ModContainer
import net.neoforged.fml.common.Mod
import net.neoforged.neoforge.common.NeoForge
import org.apache.logging.log4j.LogManager
import org.slf4j.Logger
import thedarkcolour.kotlinforforge.neoforge.forge.MOD_BUS


@Mod(ExampleMod.MOD_ID)
class ExampleMod(modEventBus: IEventBus, modContainer: ModContainer) {

    companion object {
        const val MOD_ID : String = "example_mod"
        val LOGGER : Logger = LogUtils.getLogger()
    }


}
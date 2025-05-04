package com.thecashmoney.orthocontrols.client;

import net.fabricmc.api.ClientModInitializer;

import net.minecraft.client.MinecraftClient;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;

public class OrthocontrolsClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
//        MinecraftClient client = MinecraftClient.getInstance();
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if (client.mouse != null && client.player != null) {
                client.mouse.unlockCursor();  // Safe here
            }
        });
    }
}

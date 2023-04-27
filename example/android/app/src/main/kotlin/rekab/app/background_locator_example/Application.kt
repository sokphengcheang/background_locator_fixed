package com.yukams.background_locator_2

import io.flutter.app.FlutterApplication
import io.flutter.plugin.common.PluginRegistry
import io.flutter.plugin.common.PluginRegistry.PluginRegistrantCallback
import io.flutter.plugins.pathprovider.PathProviderPlugin
import io.flutter.view.FlutterMain
import com.yukams.background_locator_2.IsolateHolderService

//class Application : FlutterApplication(), PluginRegistrantCallback {
//    override fun onCreate() {
//        super.onCreate()
//        IsolateHolderService.setPluginRegistrant(this)
//        FlutterMain.startInitialization(this)
//    }
//
//    override fun registerWith(registry: PluginRegistry?) {
//        if (!registry!!.hasPlugin("io.flutter.plugins.pathprovider")) {
//            PathProviderPlugin.registerWith(registry.registrarFor("io.flutter.plugins.pathprovider"))
//        }
//    }
//}

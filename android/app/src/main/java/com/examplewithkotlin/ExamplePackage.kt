package com.examplewithkotlin

import android.view.View
import com.facebook.react.ReactPackage
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.uimanager.ReactShadowNode
import com.facebook.react.uimanager.ViewManager

class ExamplePackage : ReactPackage {
  /**
   * Add your native modules here
   */
  override fun createNativeModules(reactContext: ReactApplicationContext) =
    listOf<NativeModule>(ExampleToastModule(reactContext));

  /**
   * Add your native components here
   */
  override fun createViewManagers(reactContext: ReactApplicationContext) =
    emptyList<ViewManager<View, ReactShadowNode<*>>>()
}
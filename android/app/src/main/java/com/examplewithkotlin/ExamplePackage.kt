package com.examplewithkotlin

import com.facebook.react.ReactPackage
import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactApplicationContext

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
    listOf(ExampleImageView(reactContext))
}
package com.examplewithkotlin

import android.app.Application
import android.content.Context
import com.facebook.react.*
import com.facebook.soloader.SoLoader

class MainApplication : Application(), ReactApplication {
  private val mReactNativeHost: ReactNativeHost = object : ReactNativeHost(this) {
    override fun getUseDeveloperSupport() = BuildConfig.DEBUG;
    override fun getJSMainModuleName() = "index";

    override fun getPackages(): MutableList<ReactPackage> {
      val packages = PackageList(this).packages;
      /**
       * Regsiter your packages here.
       */
      packages.add(ExamplePackage());
      return packages;
    }
  }

  override fun getReactNativeHost(): ReactNativeHost = mReactNativeHost;

  override fun onCreate() {
    super.onCreate();
    SoLoader.init(this, false);
    initializeFlipper(this, reactNativeHost.reactInstanceManager);
  }

  companion object {
    private fun initializeFlipper(context: Context, reactInstanceManager: ReactInstanceManager) {
      if (BuildConfig.DEBUG) {
        try {
          val aClass = Class.forName("com.examplewithkotlin.ReactNativeFlipper");
          aClass
            .getMethod("initializeFlipper", Context::class.java, ReactInstanceManager::class.java)
            .invoke(null, context, reactInstanceManager);
        } catch (err: Error) {
          err.printStackTrace();
        }
      }
    }
  }
}
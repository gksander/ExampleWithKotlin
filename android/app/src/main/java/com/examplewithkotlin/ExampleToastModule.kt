package com.examplewithkotlin

import android.widget.Toast
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod

class ExampleToastModule(context: ReactApplicationContext) : ReactContextBaseJavaModule(context) {
  private val context = context;
  private var toastCount = 0;

  override fun getName() = "ExampleToastModule";

  @ReactMethod
  fun showToast(message: String) {
    toastCount += 1;
    Toast.makeText(context, "Toast $toastCount: $message", Toast.LENGTH_SHORT).show();
  }
}
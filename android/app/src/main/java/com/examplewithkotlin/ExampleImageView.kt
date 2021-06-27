package com.examplewithkotlin

import com.facebook.drawee.backends.pipeline.Fresco
import com.facebook.react.bridge.Arguments
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.uimanager.SimpleViewManager
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.annotations.ReactProp
import com.facebook.react.views.image.ImageResizeMode
import com.facebook.react.views.image.ReactImageView

class ExampleImageView(context: ReactApplicationContext) : SimpleViewManager<ReactImageView>() {
  private val context = context;

  override fun getName() = "ExampleImageView";

  /**
   * Method to create a view instance
   * We'll just spawn a ReactImageView instance, and set resizeMode on it.
   */
  override fun createViewInstance(reactContext: ThemedReactContext): ReactImageView {
    val view = ReactImageView(reactContext, Fresco.newDraweeControllerBuilder(), null, context)
    view.setScaleType(ImageResizeMode.toScaleType("contain"));
    return view;
  }

  /**
   * Exposed prop `src` that controls URI for displayed image
   */
  @ReactProp(name = "src")
  public fun setSrc(view: ReactImageView, src: String?) {
    val source = Arguments.createMap();
    source.putString("uri", src);

    val sources = Arguments.createArray();
    sources.pushMap(source);

    view.setSource(sources);
  }
}
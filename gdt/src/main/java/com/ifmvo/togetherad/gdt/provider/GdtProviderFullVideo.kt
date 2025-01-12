package com.ifmvo.togetherad.gdt.provider

import android.app.Activity
import com.ifmvo.togetherad.core.listener.FullVideoListener

/**
 *
 * Created by Matthew Chen on 2020/12/2.
 */
abstract class GdtProviderFullVideo : GdtProviderBanner() {

  override fun requestFullVideoAd(
    activity: Activity,
    adProviderType: String,
    alias: String,
    listener: FullVideoListener
  ) {
    callbackFullVideoStartRequest(adProviderType, alias, listener)
    callbackFullVideoFailed(adProviderType, alias, listener, null, "优量汇不支持全屏视频广告")
  }

  override fun showFullVideoAd(activity: Activity) {}
}
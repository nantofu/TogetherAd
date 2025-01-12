package com.ifmvo.togetherad.demo.extend

import android.app.Activity
import android.view.ViewGroup
import com.ifmvo.togetherad.core.listener.BannerListener
import com.ifmvo.togetherad.core.listener.FullVideoListener
import com.ifmvo.togetherad.core.listener.InterListener
import com.ifmvo.togetherad.core.listener.NativeExpress2Listener
import com.ifmvo.togetherad.core.listener.NativeExpressListener
import com.ifmvo.togetherad.core.listener.NativeListener
import com.ifmvo.togetherad.core.listener.RewardListener
import com.ifmvo.togetherad.core.listener.SplashListener
import com.ifmvo.togetherad.core.provider.BaseAdProvider

/**
 * 自定义小米广告提供商
 *
 * 根据其他 Provider 可自行实现广告请求逻辑
 *
 * Created by Matthew Chen on 2020/10/23.
 */
class XiaomiProvider : BaseAdProvider() {

  override fun loadOnlySplashAd(
    activity: Activity,
    adProviderType: String,
    alias: String,
    listener: SplashListener
  ) {
  }

  override fun showSplashAd(container: ViewGroup): Boolean {
    return false
  }

  override fun loadAndShowSplashAd(
    activity: Activity,
    adProviderType: String,
    alias: String,
    container: ViewGroup,
    listener: SplashListener
  ) {
  }

  override fun showBannerAd(
    activity: Activity,
    adProviderType: String,
    alias: String,
    container: ViewGroup,
    listener: BannerListener
  ) {
  }

  override fun destroyBannerAd() {}

  override fun requestInterAd(
    activity: Activity,
    adProviderType: String,
    alias: String,
    listener: InterListener
  ) {
  }

  override fun showInterAd(activity: Activity) {}

  override fun destroyInterAd() {}

  override fun getNativeAdList(
    activity: Activity,
    adProviderType: String,
    alias: String,
    maxCount: Int,
    listener: NativeListener
  ) {
  }

  override fun nativeAdIsBelongTheProvider(adObject: Any): Boolean {
    return false
  }

  override fun resumeNativeAd(adObject: Any) {}

  override fun pauseNativeAd(adObject: Any) {}

  override fun destroyNativeAd(adObject: Any) {}

  override fun getNativeExpressAdList(
    activity: Activity,
    adProviderType: String,
    alias: String,
    adCount: Int,
    listener: NativeExpressListener
  ) {
  }

  override fun destroyNativeExpressAd(adObject: Any) {}

  override fun nativeExpressAdIsBelongTheProvider(adObject: Any): Boolean {
    return false
  }

  override fun getNativeExpress2AdList(
    activity: Activity,
    adProviderType: String,
    alias: String,
    adCount: Int,
    listener: NativeExpress2Listener
  ) {
  }

  override fun destroyNativeExpress2Ad(adObject: Any) {}

  override fun nativeExpress2AdIsBelongTheProvider(adObject: Any): Boolean {
    return false
  }

  override fun requestRewardAd(
    activity: Activity,
    adProviderType: String,
    alias: String,
    listener: RewardListener
  ) {
  }

  override fun showRewardAd(activity: Activity): Boolean {
    return false
  }

  override fun requestFullVideoAd(
    activity: Activity,
    adProviderType: String,
    alias: String,
    listener: FullVideoListener
  ) {
  }

  override fun showFullVideoAd(activity: Activity) {}
}
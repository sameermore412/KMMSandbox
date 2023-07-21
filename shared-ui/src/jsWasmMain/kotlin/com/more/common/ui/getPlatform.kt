package com.more.common.ui

import kotlinx.browser.window

class JsPlatform(): Platform {
    override val name = window.navigator.appVersion
}

actual fun getPlatform(): Platform {
    return JsPlatform()
}
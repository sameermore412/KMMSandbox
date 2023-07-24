package com.more.common.ui

import kotlinx.browser.window

class JSPlatform : Platform {
    override val name: String = window.navigator.userAgent
}

actual fun getPlatform(): Platform  = JSPlatform()
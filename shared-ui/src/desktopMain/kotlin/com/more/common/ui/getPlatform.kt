package com.more.common.ui

class DesktopMainPlatform(): Platform {
    override val name = "Desktop"
}

actual fun getPlatform(): Platform {
    return DesktopMainPlatform()
}
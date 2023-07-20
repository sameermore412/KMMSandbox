package com.more.common.data

class DesktopMainPlatform(): Platform {
    override val name = "Desktop"
}

actual fun getPlatform(): Platform {
    return DesktopMainPlatform()
}
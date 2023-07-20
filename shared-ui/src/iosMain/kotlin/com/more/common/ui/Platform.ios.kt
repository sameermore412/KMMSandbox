package com.more.common.ui

import platform.UIKit.UIDevice

class IosPlatform : Platform {
    override val name: String = "Ios ${UIDevice().name}"
}

actual fun getPlatform(): Platform = IosPlatform()
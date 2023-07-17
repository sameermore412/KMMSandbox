package com.more.common.ui

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
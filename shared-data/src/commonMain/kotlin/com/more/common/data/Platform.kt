package com.more.common.data

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
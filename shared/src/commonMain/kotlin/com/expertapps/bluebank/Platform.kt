package com.expertapps.bluebank

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
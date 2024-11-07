package com.amartyasingh.kinoflow

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
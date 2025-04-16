package de.nehranis.trckr

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
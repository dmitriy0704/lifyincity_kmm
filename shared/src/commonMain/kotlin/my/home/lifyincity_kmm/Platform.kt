package my.home.lifyincity_kmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
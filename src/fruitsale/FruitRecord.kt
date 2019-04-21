package fruitsale

object FruitRecord {

    val papaya: FruitType = FruitType(
        "လုံး", 5200.0,
        "Papaya (သဘော်သီး)"
    )
    val waterMelon = FruitType(
        "လုံး", 3500.0,
        "Water Melon (ဖရဲသီး)"
    )
    val grape = FruitType(
        "Kg", 6800.0,
        "Grape (စပျစ်သီး)"
    )
    val pineApple = FruitType(
        "လုံး", 4800.0,
        "Pine Apple (နာနတ်သီး)"
    )
    val durian = FruitType(
        "လုံး", 8500.0,
        "Durian (ဒူးရင်းသီး)"
    )

    fun showFruitRecord() {
        println("\'P\' for " + papaya.name)
        println("\'W\' for " + waterMelon.name)
        println("\'G\' for " + grape.name)
        println("\'A\' for " + pineApple.name)
        println("\'D\' for " + durian.name)
        println("*** \'F\' for Finish Sale")
        println()
    }
}
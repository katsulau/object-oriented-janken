package lesson5

fun main() {
    val cyclicTactics: Tactics = CyclicTactics()
    val murata = Player.of("村田", cyclicTactics)

    val rockOnlyTactics = RockOnlyTactics()
    val yamada = Player.of("山田", rockOnlyTactics)

    val saito = Judge()

    saito.startJanken(murata, yamada)
}
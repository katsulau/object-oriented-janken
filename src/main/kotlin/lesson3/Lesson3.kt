package lesson3

class ObjectOrientedProgramming

fun main() {
    val murata = Player.of("村田")
    val yamada = Player.of("山田")

    val saito = Judge()

    saito.startJanken(murata, yamada)
}
package lesson4
fun main() {
    val murata: Player = Murata("村田", 0)
    val yamada: Player = Yamada("山田", 0)

    val saito = Judge()

    saito.startJanken(murata, yamada)
}
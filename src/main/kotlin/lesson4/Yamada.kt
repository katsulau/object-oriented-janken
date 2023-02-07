package lesson4

class Yamada constructor(
    name: String,
    winningCount: Int
): Player(name, winningCount) {

    override fun showHand(): RockPaperScissorsType {
        return RockPaperScissorsType.PAPER
    }
}
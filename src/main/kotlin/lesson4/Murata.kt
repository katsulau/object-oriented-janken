package lesson4

class Murata constructor(
    name: String,
    winningCount: Int
): Player(name, winningCount) {

    override fun showHand(): RockPaperScissorsType {
        return RockPaperScissorsType.ROCK
    }
}
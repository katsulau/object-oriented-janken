package lesson5

class RandomTactics: Tactics {
    override fun readTactics(): RockPaperScissorsType {
        return RockPaperScissorsType.from((1..3).random())
    }
}
package lesson5

class RockOnlyTactics: Tactics {
    override fun readTactics(): RockPaperScissorsType {
        return RockPaperScissorsType.ROCK
    }
}
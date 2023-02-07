package lesson5

class CyclicTactics: Tactics {

    private var type: RockPaperScissorsType = RockPaperScissorsType.ROCK

    override fun readTactics(): RockPaperScissorsType {
        return if (type == RockPaperScissorsType.ROCK) {
            type = RockPaperScissorsType.PAPER
            RockPaperScissorsType.PAPER
        } else if (type == RockPaperScissorsType.PAPER) {
            type = RockPaperScissorsType.SCISSORS
            RockPaperScissorsType.SCISSORS
        } else {
            type = RockPaperScissorsType.ROCK
            RockPaperScissorsType.ROCK
        }

    }
}
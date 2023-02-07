package lesson3

class Player private constructor(
    private val name: String,
    private var winningCount: Int
) {
    companion object {
        fun of (name: String): Player {
            return Player(name, 0)
        }
    }

    /**
     * ジャンケンの手をだす
     */
    fun showHand(): RockPaperScissorsType {
        return RockPaperScissorsType.from((1..3).random())
    }

    /**
     * 勝った回数をカウントする
     */
    fun recordWinningCount(isWinning: Boolean) {
        if (isWinning) winningCount++
    }

    fun getName():String {
        return this.name
    }

    /**
     * 勝った回数を取得する
     */
    fun getWinningCount(): Int {
        return this.winningCount
    }
}
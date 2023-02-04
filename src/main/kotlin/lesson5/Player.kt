package lesson5

class Player private constructor(
    private val name: String,
    private var winningCount: Int,
    private val tactics: Tactics
) {
    companion object {
        fun of (name: String, tactics: Tactics): Player {
            return Player(name, 0, tactics)
        }
    }

    /**
     * ジャンケンの手をだす
     */
    fun showHand(): RockPaperScissorsType {
        // tacticsに処理を委譲する
        // 実質的な処理を他のクラスにお願いすることを委譲と呼ぶ
        return tactics.readTactics()
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
package lesson4

open class Player constructor(
    private val name: String,
    private var winningCount: Int
) {

    /**
     * ジャンケンの手をだす
     */
    open fun showHand(): RockPaperScissorsType {
        return RockPaperScissorsType.from((1..3).random())
    }

    /**
     * 勝った回数をカウントする
     */
    open fun recordWinningCount(isWinning: Boolean) {
        if (isWinning) winningCount++
    }

    open fun getName():String {
        return this.name
    }

    /**
     * 勝った回数を取得する
     */
    open fun getWinningCount(): Int {
        return this.winningCount
    }
}
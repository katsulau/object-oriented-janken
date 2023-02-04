package lesson3

class Judge {

    /**
     * ジャンケンを開始する
     */
    fun startJanken(player1: Player, player2: Player) {
        println("ジャンケン開始")

        for (count in 1..3) {
            println("${count}回戦目")

            // ジャンケンをジャッジする
            val winner = judgeJanken(player1, player2)

            // ジャンケンの結果(勝者または引き分け)を表示する
            if (winner != null) {
                println("${winner.getName()}が勝ちました!")
                winner.recordWinningCount(true)
            } else {
                println("引き分けです")
            }
        }

        // 終了宣言
        println("ジャンケン終了")

        // 最終的な結果を判定する
        val finalWinner = judgeFinalWinner(player1, player2)

        // 結果の表示
        if (finalWinner != null) {
            println("${player1.getWinningCount()} 対 ${player2.getWinningCount()}で${finalWinner.getName()}の勝ちです")
        } else {
            println("${player1.getWinningCount()} 対 ${player2.getWinningCount()}で引き分けです")
        }
    }

    private fun judgeJanken(player1: Player, player2: Player): Player? {
        // プレイヤーの手をみてどちらが勝ちかを判定する
        val player1Hand = player1.showHand()
        val player2Hand = player2.showHand()

        println("${player1Hand.japaneseName} vs. ${player2Hand.japaneseName}")

        if (player1Hand == player2Hand) {
            return null
        } else if (player1Hand == RockPaperScissorsType.ROCK && player2Hand == RockPaperScissorsType.SCISSORS
            || player1Hand == RockPaperScissorsType.SCISSORS && player2Hand == RockPaperScissorsType.PAPER
            || player1Hand == RockPaperScissorsType.PAPER && player2Hand == RockPaperScissorsType.ROCK) {
            return player1
        } else {
            return player2
        }
    }

    private fun judgeFinalWinner(player1: Player, player2: Player): Player? {
        if (player1.getWinningCount() > player2.getWinningCount()) {
            return player1
        } else if (player2.getWinningCount() > player1.getWinningCount()) {
            return player2
        }
        return null
    }
}
package lesson8


class Master(
    private val players: MutableList<Player> = mutableListOf()
) {

    fun prepareGame(cards: Hand) {
        println("カードを配ります")

        cards.shuffle()
        val numberOfCards = cards.getNumberOfCards()

        val numberOfPlayers = players.size

        for (index in 1..numberOfCards) {
            val card = cards.pickCard(0) ?: throw IllegalArgumentException("カードが存在しません index: $index")
            // 各プレイヤーに順番にカードを配る
            val player = players[index % numberOfPlayers]
            player.receiveCard(card)
        }
    }

    fun startGame() {
        println("ゲームを開始します")

        for (count in 1..players.size) {
            val playerIndex = count % players.size
            val nextPlayerIndex = (count + 1) % players.size

            val player = players[playerIndex]
            val nextPlayer = players[nextPlayerIndex]

            println("${player}さんの番です。")
            player.play(nextPlayer)
        }
    }

    fun declareWin(winner: Player) {
        println("${winner}さんが上がりました!")
        deregisterPlayer(winner)
    }

    fun registerPlayer(player: Player) {
        players.add(player)
    }

    fun deregisterPlayer(player: Player) {
        players.remove(player)

        if (players.size == 1) {
            val loser = players[0]
            println("${loser}さんの負けです!")
        }
    }
}
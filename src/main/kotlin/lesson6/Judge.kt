package lesson6

class Judge(
    private val playerList: MutableList<Player>,
    private val handCard: HandCard,
    private val table: Table
) {

    fun declareFinish(player: Player) {
        playerList.remove(player)
        println("${player.getName()}さんが上がりました!")
    }

    fun distributeCardToPlayers() {
        handCard.shuffle()
        while (handCard.count() > 0) {
            playerList.forEach { player ->
                val targetCard = handCard.getOneCard()
                player.receiveCard(targetCard, table)
                if (handCard.count() == 0) {
                    return
                }
            }
        }
    }

    fun startGame() {

        // プレイヤーが残り1人になるまで続ける
        while (playerList.size > 1) {
            playerList.forEachIndexed { index, player ->
                // playerListの次の要素となるプレイヤーを隣のプレイヤーとする。
                // リストの最後のプレイヤーは、リストの最初のプレイヤーを隣のプレイヤーとする
                val adjacentPlayer = if (playerList.size == index + 1) playerList[0] else playerList[index + 1]
                player.play(adjacentPlayer, table, this)
            }
        }

        println("ゲーム終了です。最後に残ったプレイヤーは${playerList[0].getName()}です")
    }
}
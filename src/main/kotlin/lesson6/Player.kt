package lesson6

class Player(
    private val name: String,
    private val handCard: HandCard = HandCard(mutableListOf())
) {

    fun getName(): String {
        return name
    }
    fun receiveCard(card: Card, table: Table) {
        handCard.addCard(card)
        val discardTargetList = handCard.checkSameCards()
        discardTargetList?.let {
            table.discardCard(it)
            println("${this.getName()}: ${it[0].getCardTypeAndValue()} ${it[1].getCardTypeAndValue()}を捨てました")
        }
    }

    fun getOneCardFromPlayerHandCard(judge: Judge):Card {
        handCard.shuffle()
        val card = handCard.getOneCard()
        if (handCard.count() == 0) {
            judge.declareFinish(this)
        }
        return card
    }

    fun play(targetPlayer: Player, table: Table, judge: Judge) {
        println("${this.getName()}さんの番です")
        val card = targetPlayer.getOneCardFromPlayerHandCard(judge)
        println("${this.getName()}: ${targetPlayer.getName()}さんから${card.getCardTypeAndValue()}を引きました")

        handCard.addCard(card)
        val discardTargetList = handCard.checkSameCards()
        discardTargetList?.let {
            table.discardCard(it)
            println("${this.getName()}: ${it[0].getCardTypeAndValue()} ${it[1].getCardTypeAndValue()}を捨てました")
        }

        if (handCard.count() == 0) {
            judge.declareFinish(this)
            return
        }

        println("${this.getName()}: 残りの手札は${handCard.showCardList()}です")
    }
}
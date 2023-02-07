package lesson6

fun main() {

    val cardList: MutableList<Card> = mutableListOf()
    val cardNumberList = listOf("A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K")
    cardNumberList.forEach{cardNumber ->
        val spadeCard = Card(value = cardNumber, cardType = CardType.SPADE)
        val heartCard = Card(value = cardNumber, cardType = CardType.HEART)
        val cloverCard = Card(value = cardNumber, cardType = CardType.CLOVER)
        val diamondCard = Card(value = cardNumber, cardType = CardType.DIAMOND)
        cardList.addAll(listOf(spadeCard, heartCard, cloverCard, diamondCard))
    }
    val joker = Card(value = "", CardType.JOKER)
    cardList.add(joker)

    val murata = Player("村田")
    val yamada = Player("山田")
    val saito = Player("斉藤")
    val table = Table()
    val judge = Judge(mutableListOf(murata, yamada, saito), HandCard(cardList), table)

    judge.distributeCardToPlayers()
    judge.startGame()
}
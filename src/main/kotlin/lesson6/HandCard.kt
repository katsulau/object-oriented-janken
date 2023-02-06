package lesson6

class HandCard(
    private val cardList: MutableList<Card>
) {
    fun addCard(card: Card) {
        cardList.add(card)
    }

    fun shuffle() {
        cardList.shuffle()
    }

    fun getOneCard(): Card {
        val card = cardList[0]
        cardList.remove(card)
        return card
    }

    fun count(): Int {
        return cardList.size
    }

    fun checkSameCards(): List<Card>? {
        val discardTargetSet: MutableSet<Card> = HashSet()

        cardList.forEach{ targetCard ->
            val targetCardValue = targetCard.getValue()
            val sameValueCardList: List<Card> = cardList.filter { card ->
                targetCardValue.equals(card.getValue())
            }

            if (sameValueCardList.size == 2) {
                discardTargetSet.addAll(sameValueCardList)
            }
        }

        if (discardTargetSet.size == 2) {
            cardList.removeAll(discardTargetSet)
            return discardTargetSet.toList()
        } else if (discardTargetSet.size > 2) {
            throw IllegalArgumentException("同じ数のカードが3枚以上存在します")
        }

        return null
    }

    fun showCardList(): String {
        val stringBuilder = StringBuilder()
        cardList.forEach{ card -> stringBuilder.append(card.getCardTypeAndValue()).append(" ")}
        return stringBuilder.toString()
    }
}
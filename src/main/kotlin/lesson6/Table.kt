package lesson6

class Table {
    companion object {
        private val discardedCardList: MutableList<Card> = mutableListOf()
    }
    fun discardCard(targetCardList: List<Card>) {
        discardedCardList.addAll(targetCardList)
    }
}
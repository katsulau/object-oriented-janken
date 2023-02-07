package lesson8

class Hand(
    private val hand: MutableList<Card> = mutableListOf()
) {
    fun addCard(card: Card) {
        hand.add(card)
    }

    fun lookCard(position: Int): Card? {
        // 引数で指定された位置が妥当かチェックする
        if ((0 <= position) && (position < hand.size)) {
            return hand[position]
        }

        // 該当するものが存在しない場合
        return null
    }

    fun pickCard(position: Int): Card? {
        if ((0 <= position) && (position < hand.size)) {
            return hand.removeAt(position)
        }

        // 該当するものが存在しない場合
        return null
    }

    fun shuffle() {
        hand.shuffle()
    }

    fun getNumberOfCards(): Int {
        return hand.size
    }

    override fun toString(): String {
        val stringBuilder = StringBuilder()
        hand.forEach { card -> stringBuilder.append(card).append(" ") }
        return stringBuilder.toString()
    }
}
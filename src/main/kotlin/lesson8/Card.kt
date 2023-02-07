package lesson8

open class Card constructor(
    protected var suit: Int,
    protected var number: Int
) {
    companion object {
        const val SUIT_SPADE = 1
        const val SUIT_DIAMOND = 2
        const val SUIT_CLUB = 3
        const val SUIT_HEART = 4
        const val SUIT_NUM = 4
        const val CARD_NUM = 13
    }

    fun gettSuit(): Int {
        return this.suit
    }

    override fun toString(): String {
        val stringBuilder = StringBuilder()
        when (suit) {
            SUIT_SPADE -> stringBuilder.append("S")
            SUIT_DIAMOND -> stringBuilder.append("D")
            SUIT_CLUB -> stringBuilder.append("C")
            SUIT_HEART -> stringBuilder.append("H")
        }

        when (number) {
            1 -> stringBuilder.append("A")
            10 -> stringBuilder.append("T")
            11 -> stringBuilder.append("J")
            12 -> stringBuilder.append("Q")
            13 -> stringBuilder.append("K")
            else -> stringBuilder.append(number)
        }

        return stringBuilder.toString()
    }

}
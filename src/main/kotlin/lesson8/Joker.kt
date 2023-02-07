package lesson8

class Joker(
    suit: Int = 0,
    number: Int = 0
): Card(suit, number) {
    fun setNumber(number: Int) {
        this.number = number
    }

    fun setSuit(suit: Int) {
        this.suit = suit
    }

    override fun toString(): String {
        return "JK"
    }
}
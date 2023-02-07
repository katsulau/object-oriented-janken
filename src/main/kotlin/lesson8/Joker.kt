package lesson8

class Joker constructor(
    suit: Int = 0,
    number: Int = 0
): Card(suit, number) {
    fun settNumber(number: Int) {
        this.number = number
    }

    fun settSuit(suit: Int) {
        this.suit = suit
    }

    override fun toString(): String {
        return "JK"
    }
}
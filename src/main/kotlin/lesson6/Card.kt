package lesson6

class Card(
    private val value: String,
    private val cardType: CardType,
) {
    fun getValue(): String {
        return this.value
    }

    fun getCardTypeAndValue(): String {
        return this.cardType.value + this.value
    }
}
package lesson8

abstract class Player(
    protected val name: String,
    protected val table: Table,
    protected val myHand: Hand = Hand(),
    protected val master: Master,
    protected val rule: Rule
) {
    abstract fun play(nextPlayer: Player)

    fun receiveCard(card: Card) {
        myHand.addCard(card)
    }

    override fun toString(): String {
        return name
    }
}
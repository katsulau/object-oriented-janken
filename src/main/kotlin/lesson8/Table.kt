package lesson8

interface Table {
    fun putCard(card: Card)

    fun getCards(): List<Card>
}
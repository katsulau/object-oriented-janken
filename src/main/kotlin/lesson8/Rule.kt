package lesson8

interface Rule {
    fun findCandidate(hand: Hand, table: Table)
}
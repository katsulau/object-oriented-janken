package lesson4

enum class RockPaperScissorsType(val typeNumber: Int, val japaneseName: String) {
    ROCK(1, "グー"),
    SCISSORS(2, "チョキ"),
    PAPER(3, "パー");
    companion object {
        fun from(typeNumber: Int): RockPaperScissorsType {
            for (target in  RockPaperScissorsType.values()) {
                if (target.typeNumber == typeNumber) {
                    return target
                }
            }
            throw IllegalArgumentException("一致するタイプが存在しません")
        }
    }

}
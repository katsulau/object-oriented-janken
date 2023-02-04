package lesson2
class StructuredProgramming {
}

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

fun main(args: Array<String>) {

    println("ジャンケン開始")

    var player1VictoryCount = 0
    var player2VictoryCount = 0
    for (count in 1..3) {
        println("${count}回戦目")

        val player1Hand = RockPaperScissorsType.from((1..3).random())
        val player2Hand = RockPaperScissorsType.from((1..3).random())

        if (player1Hand == player2Hand) {
            println("${player1Hand.japaneseName} vs. ${player2Hand.japaneseName}")
            println("引き分けです\n")
            continue
        }

        if (player1Hand == RockPaperScissorsType.ROCK && player2Hand == RockPaperScissorsType.SCISSORS
            || player1Hand == RockPaperScissorsType.SCISSORS && player2Hand == RockPaperScissorsType.PAPER
            || player1Hand == RockPaperScissorsType.PAPER && player2Hand == RockPaperScissorsType.ROCK
        ) {
            println("${player1Hand.japaneseName} vs. ${player2Hand.japaneseName}")
            println("プレイヤー1が勝ちました!\n")
            player1VictoryCount++
        } else {
            println("${player1Hand.japaneseName} vs. ${player2Hand.japaneseName}")
            println("プレイヤー2が勝ちました!\n")
            player2VictoryCount++
        }
    }

    println("ジャンケン終了")

    if (player1VictoryCount > player2VictoryCount) {
        println("${player1VictoryCount}対${player2VictoryCount}でplayer1の勝ちです")
    } else if (player2VictoryCount > player1VictoryCount) {
        println("${player1VictoryCount}対${player2VictoryCount}でplayer2の勝ちです")
    } else {
        println("${player1VictoryCount}対${player2VictoryCount}で引き分けです")
    }
}
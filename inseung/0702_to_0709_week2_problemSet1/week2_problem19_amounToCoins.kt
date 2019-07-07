/*
Write a function to convert an amount to coins.

function amountToCoins(value, array) {
    // body
}

console.log(amountToCoins(46, [25, 10, 5, 2, 1])) // output '25, 10, 10, 1'
 */

import java.util.Scanner

fun main (args: Array<String>) {
    val reader: Scanner = Scanner(System.`in`)

    while (true) {
        val money = reader.nextInt()
        if (money <= 0 ) break

        val tempCoins = arrayListOf<Int>()
        while (true) {
            val buffer = reader.nextInt()
            if (buffer <= 0) break
            tempCoins.add(buffer)
        }
        val coins: IntArray = tempCoins.toIntArray()
        coins.sortDescending()

        if (amountToCoins(money, coins, 0, money / coins[0])) print("\n")
        else println("The given money cannot paid by given coins")

    }
}

fun amountToCoins (money: Int, coins: IntArray, index: Int, stage: Int) : Boolean {
    return if (money == 0 || (money % coins[index]) == 0) //현재 돈이 0이거나 다음 단계에서 지불할 수 있다면 true를 반환
    { print ("${coins[index]} : $stage  "); true }
    else if (index == (coins.size - 1) &&  (money % coins[index]) != 0) false //더 이상 동전이 없는데 현재 지불할 수 없으므로 false를 반환
    else if (stage > 0 && amountToCoins(money - (stage * coins[index]), coins, index + 1, (money - (stage * coins[index])) / coins[index + 1]))
    { print ("${coins[index]} : $stage  "); true } //현재 돈으로 나누고 난 다음,  다음 단계에서도 더 작은 동전으로도 지불할 수 있으므로 참을 반환
    else if (stage > 0 &&
            amountToCoins(money - ((stage - 1) * coins[index]), coins, index + 1, (money - ((stage - 1) * coins[index])) / coins[index + 1]))  //위의 경우가 아닌면 stage를 하나 줄여서 확인
    {  if (stage - 1 > 0) print ("${coins[index]} : ${stage - 1}  "); true }
    else amountToCoins(money, coins, index + 1, money / coins[index + 1]) //위의 모든 경우가 아니면 index를 하나 늘려 다음 coin 에 대해 확인
}

/*
동전의 갯수가 최소가 되도록 만들었어요..
coins를 전역변수로 잡으면 좋을 듯 한데... 방법이 있을까요..?
index + 1이 coins 배열의 크기를 넘어서는 경우 예외 처리를 하는 방법이 있을까요..?
 => 함수의 ARGUMENTS를 입력하는 부분이 너무 길어져 가독성이 떨어집니다..
Best Solution 이 뭘까요.. 가능한 경우 모두 탐색하는 걸로 했는데... 너무 복잡한거 같아요..
함수의 argument는 immutable 이던데 mutable 형식으로 바꿀 수 있는가요?
 */
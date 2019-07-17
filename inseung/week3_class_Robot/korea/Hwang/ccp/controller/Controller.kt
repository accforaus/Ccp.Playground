package korea.Hwang.ccp.controller

import korea.Hwang.ccp.utils.InputHelper
import korea.Hwang.ccp.domain.CleaningRobot
import korea.Hwang.ccp.domain.DogRobot
import korea.Hwang.ccp.domain.Robot
import korea.Hwang.ccp.utils.RobotComparators.*

object Controller {
    val collection = arrayListOf<Robot>()

    fun printMenu () {
        println ("1. 로봇 데이터 입력")
        println ("2. 로봇 리스트 보기")
        println ("3. 개별 robot 이동")
        println ("4. 로봇 삭제")
        println ("5. 로봇 가격 범위로 검색")
        println ("6. 로봇 검색")
        println ("7. 종료")
        print ("입력 : ")
    }
    fun printTable () {
        println ("번호    종류            Robot ID    Robot명        x    y   price   distance    etc")
        println ("------------------------------------------------------------------------------------")
    }

    fun printList (sortType: String) {
        when (sortType) {
            "ID" -> collection.sortWith(RobotIDComparator())
            "Model" -> collection.sortWith(RobotModelComparator())
            "Type" -> collection.sortWith(RobotTypeComparator())
            else -> collection.sortWith(RobotPriceComparator())
        }
        printTable()
        collection.forEachIndexed { index, thisObj -> print("${index + 1}    "); thisObj.show() } //index를 출력한 후 각 객체의 show() 함수 호출s
    }

    fun printByPrice (min: Int, max: Int) { //price 가 min과 max 사이에 있을 경우만 출력
        printTable()
        var counter = 1 //table 의 번호 출력을 위한 카운터
        collection.forEach {
            if (it.price in min..max) { //해당 범위 안에 price가 있는지 확인
                print ("$counter     "); it.show()
                counter += 1
            }
        }
    }
    fun printByName (name: String) { //model 이 name 과 같은 경우만 출력
        printTable()
        var counter = 1 //table 의 번호 출력을 위한 카운터
        collection.forEach {
            if (it.model == name) { //해당 범위 안에 price가 있는지 확인
                print ("$counter     "); it.show()
                counter += 1
            }
        }
    }
    fun printByID (inputID: Int) { //ID 가 inputID 와 같은 경우만 출력
        printTable()
        var counter = 1 //table 의 번호 출력을 위한 카운터
        collection.forEach {
            if (it.ID == inputID) { //해당 범위 안에 price가 있는지 확인
                print ("$counter     "); it.show()
                counter += 1
            }
        }
    }


    fun run () {
        while (true) {
            printMenu ()
            val input = InputHelper.getInt()
            junction (input)
        }
    }
    fun junction (input: Int) {
        when (input) {
            1 -> getRobotData()
            2 -> showRobotList()
            3 -> moveRobot()
            4 -> deleteRobot()
            5 -> searchByPrice()
            6 -> justSearch()
            else -> System.exit(0)
        }
    }


    fun getRobotData () {
        while (true) { //입력 예외 처리
            print ("제품 종류를 입력하세요(c: CleaningRobot, d: DogRobot): ")
            val type = InputHelper.getString()
            if (type == "c") { //CleaningRobot 입력 받기
                val tempC = CleaningRobot()
                print ("세부 사항을 입력하세요(ID, 로봇명, x, y, 가격, cleaningPower): ")
                collection.add(CleaningRobot().apply {
                    ID = InputHelper.getInt()
                    model = InputHelper.getWord()
                    val x = InputHelper.getInt()
                    val y = InputHelper.getInt()
                    price = InputHelper.getInt()
                    cleaningPower = InputHelper.getInt()
                    if (x > 200 || y > 200) { println("입력한 위치가 MAP 크기를 넘어서서 기본 위치로 설정하였습니다."); setInitialPosition() }
                    else { position.x = x; position.y = y }
                })
                break
            }
            else if (type == "d") { //DogRobot 입력 받기
                val tempD = DogRobot()
                print ("세부 사항을 입력하세요(ID, 로봇명, x, y, 가격, barkPower): ")
                collection.add(DogRobot().apply {
                    ID = InputHelper.getInt()
                    model = InputHelper.getWord()
                    val x = InputHelper.getInt()
                    val y = InputHelper.getInt()
                    price = InputHelper.getInt()
                    barkPower = InputHelper.getInt()
                    if (x > 200 || y > 200) { println("입력한 위치가 MAP 크기를 넘어서서 기본 위치로 설정하였습니다."); setInitialPosition() }
                    else { position.x = x; position.y = y }
                })
                break
            }
            else continue
        }
    }

    fun showRobotList () {
        while (true) { // 입력 예외 처리
            print("로봇 리스트 정렬을 선택하세요(1. 로봇명순, 2. 가격순 3. ID순) : ")
            val sortType = InputHelper.getInt()
            if (sortType == 1) { printList("Model"); break }
            else if (sortType == 2) { printList("Price"); break }
            else if (sortType == 3) { printList("ID"); break }
            else { println("1부터 3사이의 정수를 입력해 주세요."); continue }
        }
    }

    fun moveRobot () {
        printList("Type")
        while (true) { // 입력 예외 처리
            print("이동할 로봇의 ID를 선택하세요: ")
            val moveID = InputHelper.getInt()
            var switch = false //입력 예외 처리 break 조건

            collection.find {it.ID == moveID} ?.run {
                while (true) { //입력 예외 처리
                    print("이동 (1. 상, 2. 하, 3. 좌, 4. 우) : ")
                    val moveDirection = InputHelper.getInt() //이동 방향 입력받기
                    when (moveDirection) {
                        in 1..4 -> {
                            if (this is CleaningRobot) {
                                print("Cleaning Robot ${this.model}가 "); this.position.showPosition(); print("  위치에서 ")
                                this.position.move(moveDirection, this.distance)
                                this.position.showPosition(); println("  로 이동하였습니다.")
                                switch = true
                            } else {
                                print("Dog Robot ${this.model}가 "); this.position.showPosition(); print("  위치에서 ")
                                this.position.move(moveDirection, this.distance)
                                this.position.showPosition(); println("  로 이동하였습니다.")
                                switch = true
                            }
                        }
                        else -> println("1부터 4사이의 정수를 입력해 주세요.")
                    }
                }
            } ?: println("입력한 ID 에 해당되는 로봇이 없습니다.")

            if (switch) break
        }
    }

    fun deleteRobot () {
        printList("ID")
        while (true) { //입력 예외 처리
            print("삭제할 로봇의 ID를 입력하세요: ")
            val deleteID = InputHelper.getInt()
            var switch = false

            collection.find { it.ID == deleteID } ?.run {
                collection.remove(this)
                println("ID ${deleteID}번 로봇을 삭제하였습니다.")
                switch =  true
            } ?: continue

            if (switch) break
        }
    }

    fun searchByPrice () {
        print ("가격의 범위를 입력하세요 : ")
        val min = InputHelper.getInt(); val max = InputHelper.getInt() //가격 범위 입력받기
        printByPrice(min, max)
    }

    fun justSearch () {
        while (true) { //입력 예외 처리
            print("검색 조건을 고르세요 (1. 이름, 2. id) : ")
            val searchType = InputHelper.getInt()
            if (searchType == 1) {
                print("로봇의 이름을 입력해 주세요 : ")
                val name = InputHelper.getString()
                printByName(name)
                break
            }
            else if (searchType == 2) {
                print("로봇의 ID를 입력해 주세요 : ")
                val inputID = InputHelper.getInt()
                printByID(inputID)
                break
            }
            else continue
        }
    }

}
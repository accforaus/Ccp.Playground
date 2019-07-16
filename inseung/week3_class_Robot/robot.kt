// WEEK3_ROBOT

abstract class Robot {
    abstract var model: String
    abstract var position: Coordinate2D
    abstract var price: Int
    abstract var distance: Int
    abstract var ID: Int

    open fun show () {
        print ("$ID          $model    "); position.showPosition(); print("      $price       $distance      ")
    }
}



/*

abstract class Robot 에서 멤버인 변수들을 초기화 하지 않고 선언하려면 어떻게 하면 좋을까요 일단 abstract 형으로 했습니다

Robot의 자식들인 CleaningRobot 과 DogRobot 에서 Robot 의 멤버를 쓰려면 전부 override해서 초기화 해야되는데 너무 불편합니다. 원래 이런건가요?

SortWith 에 인자로 주는 Comparator 는 함수 or class 와 같은 object 둘 다 가능한가요? 어떤 타입을 줘야하나요

C 언어에서 #define 역할을 하는 것이 Kotlin 에 있나요 ... mapSize인 200을 #define mapSize 200 이렇게 쓰고 싶네요





 */
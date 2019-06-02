# CCP Playground


<br/>

<p align="center" style="padding: 45px;">
    <img src="/img/logo.png" width="400" height="100">
</p>

<p align="center" style="padding: 45px:">
    <img src="https://img.shields.io/badge/TEAM-OUR%20HOURS-yellow.svg">
</p>

<br/>

<p align="center">
    <img src="https://img.shields.io/badge/Leader-김하늘-brightgreen.svg">
</p>

<p align="center" style="padding: 45px;">
    <img src="https://img.shields.io/badge/Member-이주원-orange.svg">
    <img src="https://img.shields.io/badge/Member-최연우-brightgreen.svg">
    <img src="https://img.shields.io/badge/Member-황인성-blue.svg">
</p>

> 본 레포지토리는 CCP를 준비하는 멤버들의 프로그래밍 실력 향상을 위한 레포지토리 입니다.
<br/>

## How to work?

## [Project](https://github.com/accforaus/Cpp_Playground/projects)

게시판을 이용하여 각 팀원들의 실력향상을 위한 피드백과 공통적인 주제의 과제를 사용하여 실력향상을 도모합니다.

 * To do 
    - Issues 게시판에 라벨과 함께 새로운 프로그래밍 주제가 올라가면 자동으로 To do에 등록이 됩니다.
    
 * In progress
    - Issues 게시판에 등록된 프로그래밍 주제를 구현중이라면 In progress로 이동시켜 주면 됩니다.
 
 * Done
    - Issues 게시판에 등록된 프로그래밍 주제가 수행되고 Closed로 상태가 변하게 되면 자동으로 Done으로 이동 됩니다.  


## [Issues](https://github.com/accforaus/Cpp_Playground/issues)
   
전체 공지사항 혹은, 새로운 프로젝트 생성시 모두에게 볼 수 있거나, 혹은 수정사항을 입력하여, 소통을 원할하게 합니다.

 * todo tag
    - 새로운 프로그래밍 주제 입니다.
    
 * name tag
    - 프로그래밍 주제, 혹은 알아두어아할 공지사항에 자신의 이름 태그가 태깅됩니다.
    
 * project tag
    - 좀더 큰 규모의 프로젝트 주제로, 대체로 1주에서 2주정도 소요되는 난이도의 프로젝트가 생성될 시 태깅됩니다.


## [Code](https://github.com/accforaus/Cpp_Playground/) 

팀원별 디렉토리를 생성한후, 각 날짜에 맞게, 자신이 구현한 소스를 올려 팀원 모두 공부할 수 있게 합니다.

 * 각 멤버별 디렉토리 추가
 * 멤버들은 자신의 디렉토리에 하위 디렉토리 추가 (예, yeonwoo/2019-04-03/code.js)
 * 프로젝트 디렉토리 구축
 
 ## Coding Style
 
 **CCP 프로젝트는 팀 프로젝트이기에 가독성과 효율성을 위하여 Coding Style을 통합하는 편이 유리하기 때문에 아래의 스타일을 사용합니다.**
 
 ### Bracket Rule
 
 > 괄호의 위치는 *K & R* 스타일로 작성합니다.
 
 ```java
if (...) {
    //doSomthing...
}

for (...) {
    if () {
        // doSomething...
    } else {
        // doSomething...
    }
}

class SomeClass {
    int member1;
    int member2;
    
    public void print() {
        // doSomething...
    }
    
    protected int checkOut() {
        // doSomething...
    }
    
    private int checkForAll() {
        // doSomething...
    }
}
``` 

### Comment Rule

> 코드의 문서화를 위해 주석 규칙을 사용합니다.

```java
/**
* Represents an Some class. If a basic description requires more than one sentence,
* include it in the first paragraph
* 
* <p>
*     Example of a second paragraph. Note the blank line between the first <p> tag
*     and the end of the first paragraph. 
* </p>
* 
* @author Josh Lee
* @see SomeExample
*/

class SomeClass {
    /**
    * Method comments
    * 
    * @param int arg comment of parameter, must be simple
    * @return boolean comment of return value, must be simple
    * @exception comment of exception line
    */
    public boolean someFunction(int arg) throws Exception;
}
```

### Indent Rule

> 들여쓰기는 스페이스바 4번이 아닌 탭 1번으로 들여씁니다.

_요즘 IDE는 스페이스바, 탭에 대한 자동 들여쓰기 툴을 가지고 있기때문입니다._
 
 
 ### Naming Rule
 
 #### Normal
 
  > 함수, 변수, 파일 이름은 약어를 사용하지 않고 서술형으로 짓는다.
  
  가능한 다른 사람이 즉시 이해할 수 있도록 작성합니다.
  
 ```java
// Good
List<Student> studentList;
String studentName;
boolean isStudent;

// Bad

List<Student> sList;
String sName;
boolean isS;
 ``` 


#### 파일 이름 

> 파일 이름은 모두 소문자로 구성하며 "_"를 포함할 수 있다.

_Java의 경우 클래스 이름이 파일 이름이 되기 때문에 제외 합니다._

```
// Good
connect_aws_database.js
my_functional_interfaces.js
my_useful_functions.js
functions_set.kt

//Bad
connectAWSDatabase.js
MyFunctionalInterface.js
MyUsefulFunctions.js
some-functions.c
some-functions.kt
```

> 이미 존재하는 파일 / 클래스 이름은 사용하지 않는다.

```java
//already exist in java package
class File { 
    
}

//already exist in c standard library
errno.h

...
```

#### 클래스 / 타입 이름

> Class / Enum 이름은 대문자로 시작하며, 언더바 "_"없이 단어마다 첫 글자를 대문자로 작성한다.

**Class, Enum, Interface, Structure...** 모든 타입에 동일한 규칙이 적용 됩니다.

```java
// Good
class Student
class InputUtils
interface ConnectListener
enum ConnectType

// Bad
class student
class input_utils
class Input_utils
interface connectListener
interface connect_Listener
enum typeOfConnect

...
```

#### 변수 이름

> 변수 이름은 모두 소문자로 작성하며 단어를 연결할 때 대문자를 사용한다. (Carmel Case)

```java
// Good
int clickListener;
boolean isOpen;
String userName;
float resultAvg;

// Bad
int clieck_listener;
boolean Is_Open;
String user_NamE;
float ResultAv_g;
```

#### 상수 이름

> 상수 이름은 전부 대문자를 사용한다. 문자를 연결할 때 언더바 "_"를 사용한다.

```java
private static final int CODE = 2;
public static final String MAGIC_NAME = "Our Hours"
protected static final byte MAGIC_CODE_OF_OUR_HOURS = ...

...
```

#### 함수 이름

> 함수 이름은 변수 이름과 마찬가지로 모두 소문자로 작성하며 단어를 연결할 때 대문자를 사용한다. (Carmel Case)

```java
// Good
public boolean isHacked() {}
public void doHackByIp(String ip) {}
public Router foundRouterByType(RouterType type) {}
public OurHours foundUserById(String id) {}
public boolean checkIsUser() {}
```
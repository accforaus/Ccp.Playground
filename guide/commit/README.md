# Github Commit Guide

> CCP 프로젝트 진행을 위하여 협업을 가장 중요시 하기 때문에, 커밋 메시지가 매우 중요합니다. 협업을 통한 프로그래밍을 할 시 유지보수에도 많은 이점이 있기 때문에 커밋 메시지 가이드를 제공합니다.


## 1일 1커밋 하기

> job apply 일자 기준으로 2주 간의 commit은 지원 회사에서 확인하지 않습니다.

`Controlbute setting` -> `Public contributions only`로 설정하기


## 작은 단위로 나누어 여러 번 commit 하기

> 함수를 추가할 때 마다, 수정 할 때마다 commit을 해주시면 됩니다.


## 커밋 단위

> feat, fix, doc, style, refactor, test, chore 을 이용하여 commit을 구분합니다.

```
Type: 제목
``` 


## 제목과 본문을 한 줄 띄워 분리하기

> 커밋 메시지는 **50자 이내의 요약문장**과 **빈 줄 하나**, 그리고 **설명문**으로 구성해야 합니다.

```
과제 완료 
```

```
수정
```

강제하지는 않지만, 권하지 않는 방법입니다.

```
add: Derezz the master control program

MCP turned out to be evil and had become intent on world domination.
This commit throws Tron's disc into MCP (causing its deresolution)
and turns it back into a chess game.
```

`git log`에서는 위의 메시지가 다음과 같이 보여집니다.
```
$ git log
commit 42e769bdf4894310333942ffc5a15151222a87be
Author: Kevin Flynn <kevin@flynnsarcade.com>
Date:   Fri Jan 01 00:00:00 1982 -0200

 add: Derezz the master control program

 MCP turned out to be evil and had become intent on world domination.
 This commit throws Tron's disc into MCP (causing its deresolution)
 and turns it back into a chess game.
```

여기서 `git log --oneline` 옵션을 사용하면

```
$ git log --oneline
42e769 add: Derezz the master control program
```
다음과 같이 제목만 표시됩니다.

`git shotlog`라는 명령어를 사용하면 협업하는 맴버들의 커밋 메시지를 확인 할 수 있습니다.

```
$ git shortlog
Kevin Flynn (1):
    feat: Derezz the master control program

Alan Bradley (1):
    fix: Introduce security program "Tron"

Ed Dillinger (3):
    modify: Rename chess program to "MCP"
    modify: Modify chess program
    feat: Upgrade chess program

Walter Gibbs (1):
    feat: Introduce protoype chess program
```


## 제목은 영문 기준 50자 이내로

> 커밋 메시지 작성자는 더 읽기 좋은 커밋 제목을 만들어 가독성을 높여줍니다.


## 제목 첫글자를 대문자로

```
feat: accelerate to 88 miles per hour

to

feat: Accelerate to 88 miles per hour
```


## 제목 끝에 `.`금지

> 제목에는 보통 접을 찍지 않습니다.

```
add: Open the pod bay doors.

to 

add: Open the pod bay doors 
```


## 제목은 `명령조`로

> 첫 단어를 **동사원형**으로 사용하여 제목을 명령조로 합니다. 제목은 명령조로, 본문은 평서문으로 작성합니다. 

```
refactor: Refactor subsystem X for readability
add: Update getting started docummentation
fix: Remove deprecated methods
test: Release version 1.0.0
Merge Pull request #123 from user/branch
```


## 본문은 영문 기준으로 72자마다 줄 바꾸기

> git은 자동으로 줄바꿈을 하지 않기 때문에 적당한 위치인 **72자**에서 줄 바꾸기를 해주시면 됩니다.


## 본문은 `어떻게`보다 `무엇을`, `왜`에 맞춰 작성하기

> 제목이 내용을 충분히 전달하는 것이 좋습니다. 아래는 아주 좋은 사례 입니다.

```
commit eb0b56b19017ab5c16c745e6da39c53126924ed6
Author: Pieter Wuille <pieter.wuille@gmail.com>
Date:   Fri Aug 1 22:57:55 2014 +0200

   fix: Simplify serialize.h's exception handling

   Remove the 'state' and 'exceptmask' from serialize.h's stream
   implementations, as well as related methods.

   As exceptmask always included 'failbit', and setstate was always
   called with bits = failbit, all it did was immediately raise an
   exception. Get rid of those variables, and replace the setstate
   with direct exception throwing (which also removes some dead
   code).

   As a result, good() is never reached after a failure (there are
   only 2 calls, one of which is in tests), and can just be replaced
   by !eof().

   fail(), clear(n) and exceptions() are just never called. Delete
   them.
```
# 5주차 실습: 기본 위젯 다루기

기본 위젯 예제 3-1부터 3-6까지를 한 Android 프로젝트로 구성했습니다. 모듈마다 `Empty Views Activity`와 같은 화면(`activity_main.xml`)과 액티비티(`MainActivity.kt`)가 있습니다!

Android Studio에서 이 폴더를 열면 됩니다. 예제마다 프로젝트를 따로 만들 필요는 없는 것 같습니다!

## 실행 방법

1. Android Studio에서 이 저장소 루트를 Open합니다.
2. Gradle Sync가 끝날 때까지 기다립니다.
3. 상단 실행 구성에서 확인할 모듈을 선택합니다.
4. 에뮬레이터 또는 실제 기기에서 Run합니다.

## 모듈별 결과

| 모듈 | 예제 | 확인할 내용 |
| --- | --- | --- |
| `example31` | 3-1 XML로 텍스트 뷰의 색상, 글꼴, 크기 변경 | `Hello World!`가 색상 `#03A9F4`, 글꼴 serif, 크기 `50dp`로 표시됩니다. 레이아웃만 수정했고 Kotlin 코드는 화면을 붙이는 역할만 합니다. |
| `example32` | 3-2 메서드로 텍스트 뷰의 색상, 글꼴, 크기 변경 | 같은 `Hello World!` 화면입니다. `setText()`, `setTextColor()`, `setTypeface()`, `setTextSize()`로 바꿉니다. |
| `example33` | 3-3 버튼을 클릭하여 두 수의 합 출력 | 화면에 `200 + 300`이 있고, `두 수의 합은?` 버튼을 누르면 토스트로 `합계: 500`이 나옵니다. |
| `example34` | 3-4 에디트 텍스트 입력 형식 | 성명, 비밀번호, 이메일, 생년월일, 연락처의 `inputType`이 다릅니다. `결과보기`를 누르면 입력값을 텍스트 뷰에 모아 보여 줍니다. |
| `example35` | 3-5 이미지 뷰로 다음 이미지 넘기기 | `다음보기`를 누를 때마다 이미지가 바뀝니다. 마지막 이미지 다음에는 첫 이미지로 돌아갑니다. |
| `example36` | 3-6 이미지 버튼으로 화면 이미지 넘기기 | 3-5와 같은 이미지 넘기기입니다. 버튼은 `res/drawable/states.xml`의 기본, 선택, 누름 이미지로 바뀝니다. |

각 모듈의 화면은 `src/main/res/layout/activity_main.xml`, Kotlin 코드는 `src/main/java/com/ssu/week05/` 아래 `MainActivity.kt`에 있습니다.

## 예제 3-6에서 보이는 파일

이미지 버튼 상태는 실습 안내의 `states.xml`로 두었습니다.

- `res/drawable/button.png`: 기본 상태
- `res/drawable/button2.png`: 선택된 상태
- `res/drawable/button3.png`: 누른 상태
- `res/drawable/states.xml`: 상태에 따라 위 이미지를 고르는 selector

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

# 8주차 실습: 액티비티 전환 다루기

교수님 예제 저장소 [tommyjade4ssu/mp2602](https://github.com/tommyjade4ssu/mp2602)의 `mp0601`~`mp0605`를 가져와 TODO를 채웠습니다. 실행 방법은 5주차와 같고, 실행 구성에서 `example61`~`example65`를 고르면 됩니다.

Kotlin 코드는 `src/main/java/com/ssu/week08/` 아래에 있습니다.

| 모듈 | 예제 | 확인할 내용 |
| --- | --- | --- |
| `example61` | 6-1 명시적 인텐트로 스플래시 화면 만들기 | 스플래시 화면이 2초 뒤 `LoginActivity`로 넘어갑니다. 아이디·비밀번호를 넣고 `로그인`을 누르면 토스트로 입력값이 나옵니다. `LoginActivity.kt`는 원본에 없어 새로 작성했습니다. |
| `example62` | 6-2 명시적 인텐트로 틀린 그림 찾기 퀴즈 | 고양이/강아지를 고르고 `시작하기`를 누르면 `putExtra("image", 1 or 2)`로 선택이 넘어갑니다. 틀린 곳을 누르면 `맞았습니다`, 5개를 다 찾으면 `5개 모두 선택했습니다.`가 나옵니다. |
| `example63` | 6-3 명시적 인텐트로 모양 퀴즈 | CIRCLE/SQUARE를 고르고 그림을 3개까지 체크한 뒤 `결과보기`를 누르면, `registerForActivityResult`로 선택 배열(`"result"`)을 돌려받아 첫 화면에 그림과 정답 여부를 보여 줍니다. |
| `example64` | 6-4 암시적 인텐트로 웹 페이지 이동 | URL을 넣고 `웹페이지보기`를 누르면 `ACTION_VIEW` 인텐트로 브라우저가 열립니다. `https://www.naver.com`처럼 `https://`까지 입력해야 합니다. |
| `example65` | 6-5 인텐트 필터로 이메일 보내기 | 받는 사람·제목·내용을 넣고 `메일보내기`를 누르면 앱 선택 창이 뜨고, 메일 앱에 값이 채워집니다. 에뮬레이터에서는 Gmail 계정 로그인이 필요합니다. |

## 예제 6-5 Manifest 수정

원본은 LAUNCHER 필터 안에 `<category android:name="android.intent.action.SEND"/>`가 들어 있었습니다. `SEND`는 action이고, LAUNCHER 필터에 `data`가 섞이면 런처 인텐트와도 맞지 않아 필터를 둘로 나눴습니다. 그래서 앱 선택 창에 `example65` 자신도 함께 보입니다.

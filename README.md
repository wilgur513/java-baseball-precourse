## 기능 목록
* 숫자 검증
    - [x] 중복여부 확인
    - [X] 1 ~ 9만 사용
    - [x] 3자리 숫자
* 컴퓨터가 사용할 숫자 생성
    - [ ] Randoms.pickNumberInRange 메서드 사용
    - [ ] 랜덤한 값이 숫자 검증기를 통과하지 못하면 통과할 때 까지 재생성
* 입력값 처리
    - [ ] 잘못된 입력값(4자리수 이상, 숫자외의 값 등)의 경우 IllegalArgumentException 발생
    - [ ] 3자리 숫자 입력 처리
        * 스트라이크
        * 볼
        * 낫싱
    - [ ] 게임이 종료됐을 때, 재시작/종료 구분하는 숫자 처리
        * 1 : 재시작
        * 2 : 종료
* 출력값 처리
    - [ ] 숫자 입력 안내문 출력
        ```
        숫자를 입력해주세요.
        ```
    - [ ] 입력한 숫자의 결과를 출력
        * 볼, 스트라이크 개수로 표시 
            ```
            1볼 1스트라이크
            ```
        * 하나도 없는 경우
            ```
            낫싱
            ```
        * 3개 숫자를 모두 맞힐 경우
            ```
            3스트라이크
            ```
    - [ ] 3개의 숫자를 모두 맞힐 경우 종료 안내문 출력
        ```
        3개의 숫자를 모두 맞히셨습니다! 게임 종료
        ```
    - [ ] 게임 종료 시 안내문 출력
        ```
        게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.
        ```

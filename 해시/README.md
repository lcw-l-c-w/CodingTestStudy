## 📅 진행 

* [오늘의 문제](https://github.com/Java-CodingTestStudy/CodingTestStudy/blob/main/Picked.md)
 
| 날짜 | 문제 유형 | 문제 | 난이도 | 발표 선정 문제 |
|:---:|:---:|:---|:---|:---:|
| 25.12.08 | 해시 | [완주하지 못한 선수](https://school.programmers.co.kr/learn/courses/30/lessons/42576?language=java)(필수) <br> [롤케이크 자르기](https://school.programmers.co.kr/learn/courses/30/lessons/132265)(필수) <br> [귤 고르기](https://school.programmers.co.kr/learn/courses/30/lessons/138476)(필수)<br>  [3차 압축](https://school.programmers.co.kr/learn/courses/30/lessons/17684) <br> [전화번호 목록](https://school.programmers.co.kr/learn/courses/30/lessons/42577)| <img src="https://img.shields.io/badge/Lv.1-1185FE?style=plastic"/> <br> <img src="https://img.shields.io/badge/Lv.2-3DA639?style=plastic"/> <br> <img src="https://img.shields.io/badge/Lv.2-3DA639?style=plastic"/> <br> <img src="https://img.shields.io/badge/Lv.2-3DA639?style=plastic"/> <br> <img src="https://img.shields.io/badge/Lv.2-3DA639?style=plastic"/> | <br><br><br>
<br> 

| 문제 | 예진 | 채원 | 성준 | 민석 | 훈주 | 의선
| :---: | :---: | :---: | :---: | :---: |:---: | :---: |
| 5 문제 | ✔️  | 3️⃣  | 3️⃣ | 3️⃣  |  |    |

> ✔️ 다 품  
> ❌ 못 품  
> 1️⃣2️⃣3️⃣4️⃣5️⃣ 푼 문제 수

---

## Hash 

* 저장/검색에서 자주 활용되는 자료 구조
* 입력 데이터를 특정 알고리즘을 통해 고정된 길이의 데이터로 변환한 값
* 특징
    * key-value 구조: key는 중복X, value는 중복O
    * 해시 함수를 통해 인덱스 번호 계산
    * 저장 및 탐색 O(1)

* 해시 함수: 해시 함수(Hash function)는 입력받은 데이터를 해시 값으로 출력시키는 알고리즘
* 해시 테이블: 키와 값을 함께 저장해 둔 데이터 구조
* 해싱(Hashing): 해시 함수를 통해 입력받은 데이터를 변환시키고, 이 값을 해시 테이블에 저장하는 과정

### HashMap, HashTable 비교

* HashTable은 자바에서 구현한 클래스 중 가장 오래 된 클래스로 가능하면 사용을 지양한다
* 차이점
    * Thread-Safe: HashTable은 Thread-Safe하고 Map은 그렇지 않음
    * null: 해시테이블은 key에 null 허용X, map은 key에 null 허용


### HashMap 기본 함수

```java
import java.util.Map;
import java.util.HashMap;
```


### HashSet 기본 함수

### Map 순회


* **반복자 Iterator**
    ```java
    Map<Integer, String> map = new HashMap<>();

    Iterator<Integer> iter = map.keySet().iterator();
    while(iter.hasNext()){
        Integer key = iter.next();
        String value = map.get(key);
    }
    ```

* **entrySet** 
    * entry: map의 key-value 쌍을 entry라고 함
    ```java
        for(Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    ```

* **keySet**
    ```java
    Map<Integer, String> map = new HashMap<>();

    for(Integer i : map.keySet()){
        int key = i;
        String value = map.get(i);
    }
    ```

* **forEach**
```java

```


compareTo vs compare override, Map.Entry와 EntrySet

### Map 정렬

* key 기준 정렬

* value 기준 정렬

### (참고)List to Array
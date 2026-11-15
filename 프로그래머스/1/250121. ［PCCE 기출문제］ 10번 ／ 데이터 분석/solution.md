# 데이터 분석

## 접근방식

- `ext`와 `sort_by`를 각각 필터링에 사용할 열 번호와 정렬에 사용할 열 번호로 변환
- `data`의 각 행을 확인하면서 `row[filterIndex] < val_ext`를 만족하는 행만 `selected` 리스트에 추가
- 선택한 행을 `row[sortIndex]` 값이 작은 순서대로 정렬
- 정렬된 리스트를 `int[][]`로 변환하여 반환

## 사용한 알고리즘

- 조건에 맞는 행을 고르는 선형 탐색과 비교 기준을 지정한 정렬
- `Comparator.comparingInt(row -> row[sortIndex])`로 각 행에서 정렬 기준이 되는 값을 꺼내 오름차순으로 정렬
- 예를 들어 `ext`가 `"date"`이고 `sort_by`가 `"remain"`이면 제조일이 기준값보다 작은 행만 골라 현재 수량순으로 정렬

## 시간 복잡도

- 전체 행의 개수를 `n`, 조건을 만족한 행의 개수를 `m`이라고 하면 필터링에 `O(n)`, 정렬에 `O(m log m)`, 배열 변환에 `O(m)`
- 전체 시간 복잡도는 `O(n + m log m)`
- 선택한 행을 저장하는 리스트에 `O(m)`의 추가 공간이 필요

## 학습 메모

- `getIndex()`의 `switch`에서 `"code"`, `"date"`, `"maximum"`, `"remain"`을 각각 `0`, `1`, `2`, `3`으로 변환
- 필터링 조건이 기준값보다 **작은** 행이므로 `val_ext`와 같은 값은 제외
- `List<int[]>`에는 선택한 행의 참조를 저장하므로 각 행의 값을 따로 복사할 필요가 없음
- `selected.toArray(new int[selected.size()][])`로 리스트를 문제에서 요구하는 `int[][]` 타입으로 변환

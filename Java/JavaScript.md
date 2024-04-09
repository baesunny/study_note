자바 기본구조: https://dinfree.com/lecture/language/112_java_2.html



---

## console.log 는 콘솔에 특정 내용을 출력하라는 것을 의미

console.log('Hello, JavaScript!');
=> Hello, JavaScript!

console.log( 1 + 2 + 3 + 4 );
=> 10

---
## let을 사용해서 변수 선언 (한 번 선언한 변수는 그 값을 바꿀 수 있으며, 동일한 이름으로 다른 변수 선언은 불가능)

let value = 1;
console.log(value);
=> 1

let value = 1;
let value = 2;
=> Syntax Error

---
## constant를 사용해서 변수 선언

const a = 1;
a = 2;
=> Error: "a" is read-only


---
## 산술연산자
let a = 1;

# 1을 더하기 직전 값 출력
console.log(a++);
>> 1

# 1을 더한 다음의 값 출력
console.log(++a)
>> 3


---
## 함수 선언



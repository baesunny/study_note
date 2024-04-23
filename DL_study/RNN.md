## 참고 사이트
- https://ratsgo.github.io/natural%20language%20processing/2017/03/09/rnnlstm/
- https://warm-uk.tistory.com/54

---

## 시퀀스(sequence)?

- 말 그대로 순서가 있는 data
  Text는 '문맥'이라는 순서가 있고, 시계열 데이터에는 '시간'이라는 순서가 있듯이, 영상이나 음성 등도 전부 순서와 함께 흘러가는 시퀀스 데이터이다.

- 이러한 시퀀스 데이터를 다루는 모델을 시퀀스 모델(Sequence model)이라고 한다.
  순서가 있는 Sequence data에서 특징들을 추출하여 여러가지 문제를 해결하고 예측하며, 대표적으로 RNN, GRU, LSTM등이 있다.

​- 그럼 일반적인 데이터와는 뭐가 다를까?
  기존에는 모든 Inputs들이 독립적이라고 가정했지만, 이전 정보가 의미가 있는 순서적 정보에는 순차적으로 과거 정보를 반영할 수 있는 모델이 필요하다. 
  그래서 나온 것이 Sequence model

- 시퀀스 모델의 종류
  1) one to many
  2) many to one
  3) many to many (encoder -> decoder)
  4) many to many

---

## RNN (Reccurent Neural Network)

- RNN 진행과정

  1) input
     우선 시퀀스 데이터 즉 정보는 벡터로 표현되어 model에 input. 만약 데이터가 TEXT이다? 벡터로 표현하기 위해 Word embedding 진행함.

  2) State
     input인 벡터(가공된 정보)는 순서(Timestep)에 따라 순환신경망의 상태(State, 초록색 상자)에 저장됨. 이 상태(state)는 함수로 변형될 수 있으며, 함수(f)는 파라미터 W(가중치)와 이전 상태(old state), input로 구성되어 있다.

  3) update
    그리고 W가 튜닝되면서 계속 발전(Update)해나감.

​  4) output
    모든 Timestep마다 새로운 인풋이 들어오면서 다른 반응 결과를 출력하는데, 이를 통해 다른 Timestep에서 다른 예측을 하는 것을 원하게 됨.

​

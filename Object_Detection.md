## Object_Detection STUDY
object detection은 위치 파악과 분류의 문제를 동시에 고려해야 한다.


[ 2 - Stage Detector ] : 말 그대로 두 단계 작동함

  1) 오브젝트가 있을 것 같은 후보(ROI - Region Of Interest : 관심영역) 추출
  2) ROI 각각에 대해 합성곱 네트워크의 입력에 맞춰 정사각형으로 크기 조정
  3) CNN을 사용하여 클래스 분류 -> 경계박스(Bound Box) 추출

  예시) Faster R-CNN, Feature Pyramid Network(FPN) 등
      
      R-CNN: 객체인식을 위한 가장 기본적이고 대표적인 학습모델.

관심영역 선정 -> 영역 크기 통일 -> CNN 전방 전파연산을 통한 특징추출 -> SVM(Support Vector Machine)으로 분류 -> 위치 회귀
            
            
Faster R-CNN 
: 1단계에서는 CNN과 영역 제안망을 통해 사진단위로 수행 -> 2단계에서는 영역 단위로 ROI 요약 및 정렬, 객체 분류 및 위치 예측

    
---

⭐️ [ 1 - Stage Detector ] : 한 단계 만에 ROI 추출과 객체인식 진행 => 한 번에!!
    
    YOLO : 사전 학습된 CNN 모델을 변형하여 사용. 

1. 이미지 전체를 한번만 본다. 쉽게 말해, 이전의 R-CNN계열의 방식처럼 이미지를 여러 장 분할해서 여러번 분석하는 일을 하지 않는다는 의미다. YOLO는 원본 이미지 그대로를 CNN에 통과시킨다.
2. 통합된 모델을 사용한다. 기존에는 region proposal, feature extraction, classification, bbox regression 등의 작업을 별도로 진행했다면,
  YOLO는 한 모델만을 사용해 앞의 과정들을 한 번에 진행한다. 따라서 속도가 이전 모델들에 비해 상대적으로 빠르고 그로 인해 실시간으로 객체를 탐지할 수 있다.
3. 이미지 전체를 처리하기 때문에 객체 주변정보까지 학습하여 background error가 적다.
4. 훈련단계에서 보지 못한 새로운 이미지에 대해서도 검출 정확도가 높다. 

Yolo가 유명해진 이유는 높은 성능은 아니더라도 실시간으로  object detection이 가능하고 기존의  Faster R-CNN 보다 6배 빠른 성능을 보였기 때문이다.
하지만 R-CNN계열 모델들에 비해 낮은 정확도를 가지고 있으며 특히 작은 객체에 대해 정확도가 아쉬울 정도로 낮은 편이다.


---

## Why YOLO?

카메라 사진 촬영시의 object detection은 
모델의 정확도뿐만 아니라 real-time으로 객체 검출이 수행되는 것도 무지 중요함!!

real-time으로 객체 검출하는 작업에서의 가장 중요한 포인트는 바로 속도

=> 1 stage detection 사용
2 stage detection의 느린 속도를 보완하여 탐지와 분류를 한 번이 시행하는 YOLO(1 stage detection)가 자주 사용됨. region proposal, feature extraction, classification, bbox regression >> 이 과정을 하나의 Stage로 합침)



---

## 동작과정

1. 먼저 사진이 입력되면 가로 세로를 동일한 그리드 영역으로 나눈다. 
2. 그 후 각 그리드 영역에 대해서 **어디에 사물이 존재하는지 바운딩박스와 박스에 대한 신뢰도 점수를 예측**한다. 신뢰도가 높을수록 굵은 박스!!!
   이와 동시에 각각이 어떤 사물인지에 대한 classification 작업이 동시에 진행된다.  >>  한 번에 진행~!
3. 최종적으로 굵은 박스들만 남기고 얇은 것들(사물이 있을 확률이 낮은 것들)은 지워 준다.
4. 최종 경계박스들을  NMS(Non- Maximum Suppression) 알고리즘을 이용해 선별

---

## version 별 YOLO 모델 특징 요약

- YOLOv1
  - "One-Stage Detector"를 사용하여 실시간 탐지 가능,
  - One-Stage Detector 구현을 위해 Loss Function에서 바운딩 박스의 크기, 위치, Class 종류까지 학습.

 

- YOLOv2
  - v1에 마지막에 들어가는 FC Layer대신 앵커박스 개념 도입 -> 바운딩 박스의 위치 정보를 살리기 위함
  - 416으로 이미지 크기를 늘려 작은 물체도 감지하기 쉽게 (224 -> 416),
  - BatchNormalization, Skip-connection 등 추가

 
- YOLOv3
  - 3개의 feature map과 더욱 많은 수의 모델 파라미터 (53 layer) v2에 비해 큰 차이 없음.

- YOLOv4
  - CSPNet 기반의 backbone과 neck, head에 대해 구조 변화, Bag of freebies, Data Augmentation 등 여러가지

- VOLOv5
  - v4에서 backbone을 EfficientNet으로 변경. mAP는 비슷하나 더욱 가볍고 빠름. (pytorch로 구현, v4는 Darknet)

---

출처
https://kau-deeperent.tistory.com/155
https://dotiromoook.tistory.com/24

https://mvje.tistory.com/111 
> 학습과정 코드 구체적으로 제시되어 있음.

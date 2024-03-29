## Object_Detection STUDY
object detection은 위치의 파악과 분류의 문제를 동시에 고려해야 한다.


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

카메라 사진 촬영시의 object detection은 
모델의 정확도뿐만 아니라 real-time으로 객체 검출이 수행되는 것도 무지 중요함!!
=> 2 stage detection의 느린 속도를 보완하여 탐지와 분류를 한 번이 시행하는 YOLO (1 stage detection) 자주 사용



출처
https://kau-deeperent.tistory.com/155
https://dotiromoook.tistory.com/24

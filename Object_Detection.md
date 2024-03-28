## Object_Detection STUDY
object detection은 위치의 파악과 분류의 문제를 동시에 고려해야 한다.


[ 2 - Stage Detector ] : 말 그대로 두 단계 작동함

  1) 관심영역(ROI) 추출
  2) ROI 각각에 대해 합성곱 네트워크의 입력에 맞춰 정사각형으로 크기 조정
  3) CNN을 사용하여 ROI 분류

  예시) Faster R-CNN, Feature Pyramid Network(FPN) 등

  - R-CNN: 객체인식을 위한 가장 기본적이고 대표적인 학습모델.
            관심영역 선정 -> 영역 크기 통일 -> CNN 전방 전파연산을 통한 특징추출 -> SVM(Support Vector Machine)으로 분류 -> 위치 회귀
  - Faster R-CNN : 1단계에서는 CNN과 영역 제안망을 통해 사진단위로 수행 -> 2단계에서는 영역 단위로 ROI 요약 및 정렬, 객체 분류 및 위치 예측
  - 


    
---

[ 1 - Stage Detector ] : 1단계 만에 ROI 추출과 객체인식 진행
    YOLO : 사전 학습된 CNN 모델을 변형하여 사용. 




카메라 사진 촬영시의 object detection은 정확도뿐만 아니라 real-time으로 수행되는 것도 무지 중요함!!
=> yolo 자주 사용



출처
https://kau-deeperent.tistory.com/155

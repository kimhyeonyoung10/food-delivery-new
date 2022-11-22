# food-delivery-new


## 이벤트 스토밍
![image](https://user-images.githubusercontent.com/81146708/203244109-63e70920-cc9e-4251-b7ed-ada21e3d7375.png)

## 기능적 요구사항

 1. 고객이 메뉴를 선택하여 주문한다.
 2. 고객이 선택한 메뉴에 대해 결제한다.
 3. 주문이 되면 주문 내역이 입점상점주인에게 주문정보가 전달된다.
 4. 상점주는 주문을 수락하거나 거절할 수 있다.
 5. 상점주는 요리시작때와 완료 시점에 시스템에 상태를 입력한다.
 6. 고객은 아직 요리가 시작되지 않은 주문은 취소할 수 있다.
 7. 요리가 완료되면 고객의 지역 인근의 라이더들에 의해 배송건 조회가 가능하다.
 8. 라이더가 해당 요리를 pick 한후, pick했다고 앱을 통해 통보한다.
 9. 고객이 주문상태를 중간중간 조회한다.
10. 주문상태가 바뀔 때 마다 카톡으로 알림을 보낸다.
11. 고객이 요리를 배달 받으면 배송확인 버튼을 탭하여, 모든 거래가 완료된다.

추가된 기능 2가지 \
-> 고객이 주문을 완료 시 쿠폰을 카카오톡을 통해 발행해준다.\
![image](https://user-images.githubusercontent.com/81146708/203247781-80fecb79-5810-4920-9dbc-47903c945f42.png)\
--> 상점주는 주문수락때와 거절 시점에 시스템에 상태를 입력한다.\
![image](https://user-images.githubusercontent.com/81146708/203248300-c69c29fb-0485-44bf-9e7e-c10feae83f13.png)

## checkPoint

### Saga
가게에서 주문을 수락했을때 주문상태를 변경해준다.

![image](https://user-images.githubusercontent.com/81146708/203248736-81d72384-9b5a-4e39-bc19-dc857b6d88c9.png)
![image](https://user-images.githubusercontent.com/81146708/203248820-6fa851b3-a8f4-40f6-86cd-61029c14d4cb.png)

### CQRS

### Compensation / Correlation

### Request / Response

### Circuit Breaker

### Gateway
![image](https://user-images.githubusercontent.com/81146708/203252135-144b05fc-d8f1-4b4c-a661-a37cd36d0dc0.png)


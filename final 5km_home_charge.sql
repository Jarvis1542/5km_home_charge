
CREATE TABLE card ( /* 카드 */
	cardNum number NOT NULL,  /*카드번호*/
	owner varchar2(10) NULL,  /*카드 소유자 이름*/
	birth number NULL, /*생년월일*/
	expiryDate1 number NULL, /*유효기간1*/
	expiryDate2 number NULL, /*유효기간2*/
	twoDigit number NULL, /*비밀번호앞2자리*/
	id varchar2(30) NOT NULL /*아이디(회원fk)*/
);

CREATE TABLE member ( /*회원*/
	id varchar2(30) NOT NULL, /*아이디*/
	password varchar2(30) NULL, /*비밀번호*/
	email varchar2(50) NULL, /*이메일*/
	phone number NULL, /*폰번호*/
	name varchar2(10) NULL /*이름*/
);

CREATE TABLE register ( /*등록자*/
	id varchar2(30) NOT NULL, /*아이디(회원pk)*/
	resIdx number NOT NULL, /*거주지번호(거주지pk)*/
	pic	varchar2(1000) NULL, /*당선공고사진-파일저장*/
	accountNum number NULL, /*계좌번호*/
	bankName varchar2(10) NULL /*은행이름*/
);

CREATE TABLE car ( /*자동차*/
	carNum varchar2(10) NOT NULL, /*차량번호*/
	carType	varchar2(20) NULL, /*차종*/
	carCharging	varchar2(30) NULL, /*차충전기타입*/
	id varchar2(30) NOT NULL /*아이디(회원fk)*/
);

CREATE TABLE guard ( /*경비*/
	id varchar2(30) NOT NULL, /*아이디(회원pk)*/
	resIdx number NOT NULL, /*거주지번호(거주지pk)*/
	licence varchar2(1000) NULL, /*경비교육이수증-파일저장*/
	guardCo varchar2(30) NULL, /*관리업체이름*/
	guardCoNum number NULL /*관리업체번호*/
);

CREATE TABLE residence ( /*거주지*/
	resIdx number NOT NULL, /*거주지번호*/
	resName varchar2(30) NULL, /*거주지이름*/
	addr varchar2(100) NULL, /*주소*/
	addr2 varchar2(20) NULL, /*상세주소*/
	resDate	date NULL, /*등록날짜*/
	lat	number NULL, /*위도*/
	lng	number NULL, /*경도*/
	marker varchar2(20) NULL /*맵마커(지도api)*/
);

CREATE TABLE entryInfo ( /*출입차 정보*/
	entryIdx number NOT NULL, /*출입자정보코드*/
	enCar varchar2(10) NULL, /*차량번호*/
	enTime date NULL, /*차량진입시간*/
	exTime date NULL, /*차량진출시간*/
	camIdx number NOT NULL /*카메라코드(카메라fk)*/
);

CREATE TABLE cam ( /* 카메라 */
	camIdx number NOT NULL, /*카메라코드*/
	url	varchar2(1000) NULL, /*url*/
	resIdx number NOT NULL /*거주지번호(거주지fk)*/
);

CREATE TABLE SCS ( /*충전소*/
	SCSIdx number NOT NULL, /*충전기코드*/
	SCSName	varchar2(50) NULL, /*충전기이름*/
	min30Fee number NULL, /*30분요금*/
	addMin10Fee number NULL, /*10분추가요금*/
	SCSDate date NULL, /*등록날짜*/
	state varchar2(10) NULL, /*충전기상태*/
	operCo varchar2(50) NULL, /*운영기관*/
	SCSPic varchar2(1000) NULL, /*충전기사진*/
	SCSMap varchar2(1000) NULL, /*충전기위치지도*/
	dayStartTime number NULL, /*평일시작시간*/
	dayEndTime number NULL, /*평일종료시간*/
	weeStartTime number NULL, /*토요일시작시간*/
	weeEndTime number NULL, /*토요일종료시간*/
	holStartTime number NULL,/*공휴일시작시간*/
	holEndTime number NULL, /*공휴일종료시간*/
	resIdx number NOT NULL /*거주지번호*/
);

CREATE TABLE parking ( /*주차장*/
	parkingIdx number NOT NULL, /*주차장코드*/
	parkingName varchar2(50) NULL, /*주차장이름*/
	parkingType varchar2(50) NOT NULL, /*주차장타입*/
	min30Fee number NULL, /*30분요금*/
	addMin10Fee	number NULL, /*10분추가요금*/
	place number NULL, /*면적(주차장칸수)*/
	sample4_postcode varchar2 (10), /*우편번호*/
	sample4_roadAddress varchar2(300), /*도로명주소*/
	sample4_jibunAddress varchar2(300), /*지번주소*/
	sample4_detailAddress varchar2(300), /*상세주소*/
	sample4_extraAddress varchar2(300), /*참고항목*/
    dayTime varchar2(30), /*평일시간*/
    weeTime varchar2(30), /*주말시간*/
    holTime varchar2(30), /*공휴일시간*/
	aptMap varchar2(1000) NULL, /*아파트단지지도-파일등록*/
	parkingPic varchar2(1000) NULL, /*주차장사진-파일등록*/
	parkingDate	date NULL, /*등록날짜*/
	resIdx number NOT NULL /*거주지번호(거주지fk)*/
);

CREATE TABLE chargingType ( /*충전타입*/
	chargeSpeedTpye varchar2(10) NOT NULL, /*충전속도종류(충전기종류pk)*/
	chargeType varchar2(30) NOT NULL, /*충전기타입(충전기종류pk)*/
	chargeSpped number NULL /*충전기코드*/
);

CREATE TABLE board ( /*게시판*/
	bNum number NOT NULL, /*게시판번호*/
	bName varchar2(50) NULL /*게시판이름*/
);

CREATE TABLE writing ( /*글*/
	writingNum number NOT NULL, /*글번호*/
	content	varchar2(2000) NULL, /*내용*/
	cartegory varchar2(50) NULL, /*카테고리*/
	rootNum	number NULL /*원글번호(댓글)*/
);

CREATE TABLE files ( /*첨부파일*/
	fileNum	number NOT NULL, /*첨부파일코드*/
	originalName varchar2(300) NULL, /*원파일이름*/
	storedName varchar2(50) NULL, /*저장파일이름*/
	size number NULL, /*파일크기*/
	writingNum number NOT NULL /*글번호(글fk)*/
);

CREATE TABLE SCSbook ( /*충전소 예약*/
	id varchar2(30) NOT NULL, /*아이디(회원pk)*/
	SCSIdx number NOT NULL, /*충전기코드(충전소pk)*/
	SCSBookStartTime number NULL, /*예약시작시간*/
	SCSBookEndTime number NULL, /*예약종료시간*/
	SCSUsageTime number NULL, /*사용시간*/
	SCSPayState char(1) NULL /*결제상태*/
);

CREATE TABLE SCSbookmark ( /*충전소 즐겨찾기*/
	id varchar2(30) NOT NULL, /*아이디(회원pk)*/
	SCSIdx number NOT NULL /*충전기코드(충전소pk)*/
);

CREATE TABLE parkingbookmark ( /*주차장 즐겨찾기*/
	id varchar2(30) NOT NULL, /*아이디(회원pk)*/
	parkingIdx number NOT NULL /*주차장코드(주차장pk)*/
);

CREATE TABLE parkingbook ( /*주차장 예약*/
	id varchar2(30) NOT NULL, /*아이디(회원pk)*/
	parkingIdx number NOT NULL, /*주차장코드(주차장pk)*/
	parkingBookStartTime number NULL, /*예약시작시간*/
	parkingBookEndTime number NULL, /*예약종료시간*/
	parkingUsageTime number NULL, /*사용시간*/
	parkingPayState char(1) NULL /*결제상태*/
);

CREATE TABLE SCScharingType ( /*충전기타입*/
	chargeSpeedTpye	varchar2(10) NOT NULL, /*충전속도종류(충전기종류pk)*/
	chargeType varchar2(30) NOT NULL, /*충전기타입(충전기종류pk)*/
	SCSIdx number NOT NULL /*충전기코드*/
);

CREATE TABLE SCSpayment ( /*충전소 결제*/
	id varchar2(30) NOT NULL, /*아이디(회원pk)*/
	SCSIdx number NOT NULL, /*충전기코드(충전기예약pk)*/
	cardNum	number NOT NULL, /*카드번호(카드pk)*/
	payway varchar2(10) NULL, /*결제방법*/
	price number NULL /*결제금액*/
);

CREATE TABLE parkinglotpayment ( /*주차장 결제*/
	id varchar2(30) NOT NULL, /*아이디(회원pk)*/
	parkingIdx number NOT NULL, /*주차장코드(주차장pk)*/
	cardNum number NOT NULL, /*카드번호(카드pk)*/
	payway varchar2(10) NULL, /*결제방법*/
	price number NULL /*결제금액*/
);

CREATE TABLE writinghistory ( /*작성내역*/
	writingNum number NOT NULL, /*글번호(글pk)*/
	bNum number NOT NULL, /*게시판번호(게시판pk)*/
	id varchar2(30) NOT NULL, /*아이디(회원pk)*/
	title varchar2(200) NULL, /*제목*/
	date date NULL, /*작성일*/
	views number NULL /*조회수*/
);

ALTER TABLE card ADD CONSTRAINT PK_CARD PRIMARY KEY (
	cardNum
);

ALTER TABLE member ADD CONSTRAINT PK_MEMBER PRIMARY KEY (
	id
);

ALTER TABLE register ADD CONSTRAINT PK_REGISTER PRIMARY KEY (
	id,
	resIdx
);

ALTER TABLE car ADD CONSTRAINT PK_CAR PRIMARY KEY (
	carNum
);

ALTER TABLE guard ADD CONSTRAINT PK_GUARD PRIMARY KEY (
	id,
	resIdx
);

ALTER TABLE residence ADD CONSTRAINT PK_RESIDENCE PRIMARY KEY (
	resIdx
);

ALTER TABLE entryInfo ADD CONSTRAINT PK_ENTRYINFO PRIMARY KEY (
	entryIdx
);

ALTER TABLE cam ADD CONSTRAINT PK_CAM PRIMARY KEY (
	camIdx
);

ALTER TABLE SCS ADD CONSTRAINT PK_SCS PRIMARY KEY (
	SCSIdx
);

ALTER TABLE parking ADD CONSTRAINT PK_PARKING PRIMARY KEY (
	parkingIdx
);

ALTER TABLE chargingType ADD CONSTRAINT PK_CHARGINGTYPE PRIMARY KEY (
	chargeSpeedTpye,
	chargeType
);

ALTER TABLE board ADD CONSTRAINT PK_BOARD PRIMARY KEY (
	bNum
);

ALTER TABLE writing ADD CONSTRAINT PK_WRITING PRIMARY KEY (
	writingNum
);

ALTER TABLE files ADD CONSTRAINT PK_FILES PRIMARY KEY (
	fileNum
);

ALTER TABLE SCSbook ADD CONSTRAINT PK_SCSBOOK PRIMARY KEY (
	id,
	SCSIdx
);

ALTER TABLE SCSbookmark ADD CONSTRAINT PK_SCSBOOKMARK PRIMARY KEY (
	id,
	SCSIdx
);

ALTER TABLE parkingbookmark ADD CONSTRAINT PK_PARKINGBOOKMARK PRIMARY KEY (
	id,
	parkingIdx
);

ALTER TABLE parkingbook ADD CONSTRAINT PK_PARKINGBOOK PRIMARY KEY (
	id,
	parkingIdx
);

ALTER TABLE SCScharingType ADD CONSTRAINT PK_SCSCHARINGTYPE PRIMARY KEY (
	chargeSpeedTpye,
	chargeType,
	SCSIdx
);

ALTER TABLE SCSpayment ADD CONSTRAINT PK_SCSPAYMENT PRIMARY KEY (
	id,
	SCSIdx,
	cardNum
);

ALTER TABLE parkinglotpayment ADD CONSTRAINT PK_PARKINGLOTPAYMENT PRIMARY KEY (
	id,
	parkingIdx,
	cardNum
);

ALTER TABLE writinghistory ADD CONSTRAINT PK_WRITINGHISTORY PRIMARY KEY (
	writingNum,
	bNum,
	id
);

ALTER TABLE card ADD CONSTRAINT FK_member_TO_card_1 FOREIGN KEY (
	id
)
REFERENCES member (
	id
);

ALTER TABLE register ADD CONSTRAINT FK_member_TO_register_1 FOREIGN KEY (
	id
)
REFERENCES member (
	id
);

ALTER TABLE register ADD CONSTRAINT FK_residence_TO_register_1 FOREIGN KEY (
	resIdx
)
REFERENCES residence (
	resIdx
);

ALTER TABLE car ADD CONSTRAINT FK_member_TO_car_1 FOREIGN KEY (
	id
)
REFERENCES member (
	id
);

ALTER TABLE guard ADD CONSTRAINT FK_member_TO_guard_1 FOREIGN KEY (
	id
)
REFERENCES member (
	id
);

ALTER TABLE guard ADD CONSTRAINT FK_residence_TO_guard_1 FOREIGN KEY (
	resIdx
)
REFERENCES residence (
	resIdx
);

ALTER TABLE entryInfo ADD CONSTRAINT FK_cam_TO_entryInfo_1 FOREIGN KEY (
	camIdx
)
REFERENCES cam (
	camIdx
);

ALTER TABLE cam ADD CONSTRAINT FK_residence_TO_cam_1 FOREIGN KEY (
	resIdx
)
REFERENCES residence (
	resIdx
);

ALTER TABLE SCS ADD CONSTRAINT FK_residence_TO_SCS_1 FOREIGN KEY (
	resIdx
)
REFERENCES residence (
	resIdx
);

ALTER TABLE parking ADD CONSTRAINT FK_residence_TO_parking_1 FOREIGN KEY (
	resIdx
)
REFERENCES residence (
	resIdx
);

ALTER TABLE files ADD CONSTRAINT FK_writing_TO_files_1 FOREIGN KEY (
	writingNum
)
REFERENCES writing (
	writingNum
);

ALTER TABLE SCSbook ADD CONSTRAINT FK_member_TO_SCSbook_1 FOREIGN KEY (
	id
)
REFERENCES member (
	id
);

ALTER TABLE SCSbook ADD CONSTRAINT FK_SCS_TO_SCSbook_1 FOREIGN KEY (
	SCSIdx
)
REFERENCES SCS (
	SCSIdx
);

ALTER TABLE SCSbookmark ADD CONSTRAINT FK_member_TO_SCSbookmark_1 FOREIGN KEY (
	id
)
REFERENCES member (
	id
);

ALTER TABLE SCSbookmark ADD CONSTRAINT FK_SCS_TO_SCSbookmark_1 FOREIGN KEY (
	SCSIdx
)
REFERENCES SCS (
	SCSIdx
);

ALTER TABLE parkingbookmark ADD CONSTRAINT FK_member_TO_parkingbookmark_1 FOREIGN KEY (
	id
)
REFERENCES member (
	id
);

ALTER TABLE parkingbookmark ADD CONSTRAINT FK_parking_TO_parkingbookmark_1 FOREIGN KEY (
	parkingIdx
)
REFERENCES parking (
	parkingIdx
);

ALTER TABLE parkingbook ADD CONSTRAINT FK_member_TO_parkingbook_1 FOREIGN KEY (
	id
)
REFERENCES member (
	id
);

ALTER TABLE parkingbook ADD CONSTRAINT FK_parking_TO_parkingbook_1 FOREIGN KEY (
	parkingIdx
)
REFERENCES parking (
	parkingIdx
);

ALTER TABLE SCScharingType ADD CONSTRAINT FK_chargingType_TO_SCScharingType_1 FOREIGN KEY (
	chargeSpeedTpye
)
REFERENCES chargingType (
	chargeSpeedTpye
);

ALTER TABLE SCScharingType ADD CONSTRAINT FK_chargingType_TO_SCScharingType_2 FOREIGN KEY (
	chargeType
)
REFERENCES chargingType (
	chargeType
);

ALTER TABLE SCScharingType ADD CONSTRAINT FK_SCS_TO_SCScharingType_1 FOREIGN KEY (
	SCSIdx
)
REFERENCES SCS (
	SCSIdx
);

ALTER TABLE SCSpayment ADD CONSTRAINT FK_SCSbook_TO_SCSpayment_1 FOREIGN KEY (
	id
)
REFERENCES SCSbook (
	id
);

ALTER TABLE SCSpayment ADD CONSTRAINT FK_SCSbook_TO_SCSpayment_2 FOREIGN KEY (
	SCSIdx
)
REFERENCES SCSbook (
	SCSIdx
);

ALTER TABLE SCSpayment ADD CONSTRAINT FK_card_TO_SCSpayment_1 FOREIGN KEY (
	cardNum
)
REFERENCES card (
	cardNum
);

ALTER TABLE parkinglotpayment ADD CONSTRAINT FK_parkingbook_TO_parkinglotpayment_1 FOREIGN KEY (
	id
)
REFERENCES parkingbook (
	id
);

ALTER TABLE parkinglotpayment ADD CONSTRAINT FK_parkingbook_TO_parkinglotpayment_2 FOREIGN KEY (
	parkingIdx
)
REFERENCES parkingbook (
	parkingIdx
);

ALTER TABLE parkinglotpayment ADD CONSTRAINT FK_card_TO_parkinglotpayment_1 FOREIGN KEY (
	cardNum
)
REFERENCES card (
	cardNum
);

ALTER TABLE writinghistory ADD CONSTRAINT FK_writing_TO_writinghistory_1 FOREIGN KEY (
	writingNum
)
REFERENCES writing (
	writingNum
);

ALTER TABLE writinghistory ADD CONSTRAINT FK_board_TO_writinghistory_1 FOREIGN KEY (
	bNum
)
REFERENCES board (
	bNum
);

ALTER TABLE writinghistory ADD CONSTRAINT FK_member_TO_writinghistory_1 FOREIGN KEY (
	id
)
REFERENCES member (
	id
);


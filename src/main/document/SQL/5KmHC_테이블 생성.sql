/* 테이블 생성 */
create table member(
    id varchar2(30),
    password  varchar2(30) not null,
    email varchar2(30) not null,
    phone varchar2(15) not null,
    name varchar2(10) not null,
    regDate date,
    constraint member_id_pk primary key(id)
);

create table parking( /*주차장*/
    parkingIdx number, /*주차장코드*/
    parkingName varchar2(50) NULL, /*주차장이름*/
    parkingType varchar2(50) NOT NULL, /*주차장타입*/
    min30Fee number NULL, /*30분요금*/
    addMin10Fee   number NULL, /*10분추가요금*/
    place number NULL, /*면적(주차장칸수)*/
    sample4_postcode varchar2 (10), /*우편번호*/
    sample4_roadAddress varchar2(300), /*도로명주소*/
    sample4_jibunAddress varchar2(300), /*지번주소*/
    sample4_detailAddress varchar2(300), /*상세주소*/
    sample4_extraAddress varchar2(300), /*참고항목*/
    lat number null, /*위도*/
    lng number null, /*경도*/
    dayTime varchar2(30), /*평일시간*/
    weeTime varchar2(30), /*주말시간*/
    holTime varchar2(30), /*공휴일시간*/
    aptMap varchar2(1000) NULL, /*아파트단지지도-파일등록*/
    parkingPic varchar2(1000) NULL, /*주차장사진-파일등록*/
    id varchar2(30) not null,
    parkingDate   date NULL, /*등록날짜*/
    constraint parking_parkingIdx_pk primary key(parkingIdx),
    constraint parking_id_fk foreign key(id) references member(id));

create table CS(
    chargeName varchar2(50) NULL,
    operation varchar2(100) NULL,
    chargeSpeed varchar2(50) NULL,
    postcode varchar2(100) NULL,
    roadAddress varchar2(100) NULL,
    detailAddress varchar2(100) NULL,
    extraAddress varchar2(100) NULL,
    image1 varchar2(300),
    image2 varchar2(300),
    cable varchar2(50) NULL,
    chargeType varchar2(50) NULL
);

/* 시퀀스 생성 */
CREATE SEQUENCE  parking_seq
    MINVALUE 1
    nomaxvalue
    INCREMENT BY 1
    START WITH 1
    CACHE 20
    NOORDER
    NOCYCLE;

/* 뷰 생성 */
create view view_member
as select * from member; /* member 뷰 작성*/

create view view_parking
as select * from parking; /* parking 뷰 작성*/

/* 커밋 */
commit;
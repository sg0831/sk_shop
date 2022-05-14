-- 유저 테이블 - shop_users
CREATE TABLE SHOP_USERS(
  user_id  varchar2(20)  NOT NULL  PRIMARY KEY,
  user_pw  varchar2(20)  NOT NULL,
  user_name  varchar2(30)  NOT NULL,
  -- 이메일 입력은 필수 - NULL 불허용
  email  varchar2(50)  NOT NULL  UNIQUE,
  -- 핸드폰이 없거나 번호 입력을 원치 않는 유저가 있을 수도 있음을 고려하여 NULL 허용
  phone_number  varchar2(30),
  -- 특정 주소 등록을 원치 않는 유저들을 고려하여 NULL 허용
  address  varchar2(500),
  -- 일반유저 || 쇼핑몰 운영 관리자 || 최고 관리자 등 유저의 권한
  user_permission  varchar2(10)  DEFAULT 'NO'  NOT NULL
);




-- 상품 목록 테이블 - shop_items
CREATE TABLE SHOP_ITEMS(
  -- 상품을 식별할 수 있는 상품 코드
  item_code  varchar2(20)  NOT NULL  PRIMARY KEY,
  item_name  varchar2(50)  NOT NULL,
  price  number  DEFAULT 0  NOT NULL,
  -- 복잡한 색상명의 경우를 고려해서 여유롭게 size를 잡음
  color  varchar2(15)  NOT NULL,
  item_size  varchar2(5)  NOT NULL,
  -- 상품의 남은 수량
  item_count  number(5)  DEFAULT 0  NOT NULL,
  category  varchar2(30)  NOT NULL
);








-- insert test
insert into shop_users(
  user_id,
  user_pw,
  user_name,
  email,
  phone_number,
  address,
  user_permission)
values (
  'test_id',
  '1234',
  'test_name',
  'test@email.com',
  '010-1234-5678',
  '서울시 땡땡동',
  'NO'
);


-- select test
select * from shop_users;


-- shop_users test
-- update test
update shop_users 
  set address = '경기도 성남시 분당구 구미동'
  where user_id = 'test_id';


-- delete test
delete from shop_users
where user_id = 'test_id';




-- shop_items test
insert into shop_items(
  item_code, item_name, price, color, item_size, category
) values(
  'mt01', '남성 린넨 셔츠', 30000, 'white', 'M', '남성 상의'
);


select * from shop_items;


update shop_items
  set item_count = 1
  where item_code = 'mt01';


delete from shop_items
where item_code = 'mt01';
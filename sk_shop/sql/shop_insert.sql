-- 유저 테이블 - shop_users
INSERT INTO SHOP_USERS(
  user_id, user_pw, user_name, email, phone_number, address, user_permission
) values(
  'test_user1', '1234', '테스터김', 'testKim@tester.com', '010-1111-2222', '서울 테스터구 테스터동 100', 'NU'
);





-- 상품 목록 테이블 - shop_items
INSERT INTO SHOP_ITEMS(
  item_code, item_name, price, color, item_size, item_count, category
) values(
  'mt1b', '여름 대표 남자 반팔티(블랙)', 10000, 'black', 'M', 100, '남자 상의'
);

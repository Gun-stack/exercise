CREATE TABLE goods (
  CODE VARCHAR(100),
  name VARCHAR(50),
  price INT,
  stock INT,
  category VARCHAR(100)
);

CREATE TABLE orders (
  order_no INT AtestdbUTO_INCREMENT PRIMARY KEY,
  customer VARCHAR(100),
  productCode VARCHAR(100) ,
  amount INT,
  isCanceled BOOL
);

ALTER TABLE goods
ADD CONSTRAINT unique_code UNIQUE (CODE);
testdb
ALTER TABLE orders
ADD CONSTRAINT fk_productCode
FOREIGN KEY (productCode)
REFERENCES goods(CODE);

START TRANSACTION;
ROLLBACK;
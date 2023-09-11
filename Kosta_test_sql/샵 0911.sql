CREATE TABLE goods (
  CODE VARCHAR(100),
  name VARCHAR(50),
  price INT,
  stock INT,
  category VARCHAR(100)
);

CREATE TABLE orders (
  order_id INT AUTO_INCREMENT PRIMARY KEY,
  customer VARCHAR(100),
  productCode VARCHAR(100) ,
  amount INT,
  isCanceled BOOL
);


Insert into goods (name,price,stock,category) VALUES('kk',11,21,'sa');
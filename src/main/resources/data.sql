 INSERT INTO OPERATION_TYPE (OPERATION_TYPE_ID, DESCRIPTION, FATOR_TRANSACTION) VALUES
  (1, 'COMPRA A VISTA', -1 ),
  (2, 'PRA PARCELADA', -1 ),
  (3, 'SAQUE', -1 ),
  (4, 'PAGAMENTO', 1 );
  
   
  INSERT INTO ACCOUNT (DOCUMENT_NUMEBER) VALUES
  ('12345678900');

  INSERT INTO TRANSACTION  (ACCOUNT_ID ,OPERATION_TYPE_ID ,AMOUNT ,EVENT_DATE ) VALUES
  (1,1,-50.0,'2020-01-01T10:32:07.7199222' ),
  (1,1,-23.5,'2020-01-01T10:48:12.2135875' ),
  (1,1,-18.7,'2020-01-02T19:01:23.1458543' ),
  (1,4,60,'2020-01-05T09:34:18.5893223' );

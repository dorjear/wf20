CREATE TABLE "SWFT01UA1"."TB_RALF_USER" 
   (	
  "USER_ID" VARCHAR2(30) NOT NULL ENABLE, 
	"BRANCHES" VARCHAR2(30), 
	"CREATE_DATE" DATE, 
	"DETAIL" CLOB, 
	"EMAIL" VARCHAR2(30), 
	"FIRST_NAME" VARCHAR2(30), 
	"LAST_NAME" VARCHAR2(30), 
	"LAST_UPDATE_DATE" DATE, 
	"MIDDLE_NAME" VARCHAR2(30), 
	"PRIMARY_BRANCH" VARCHAR2(30), 
	"PRODUCT_GROUPS" VARCHAR2(30), 
	"REGIONS" VARCHAR2(30), 
	"RISK_TYPE" VARCHAR2(30), 
	"ROLES" VARCHAR2(30), 
	"TEAMS" VARCHAR2(30), 
	"PASSWORD" VARCHAR2(256), 
	 PRIMARY KEY ("USER_ID")
 )  
 
 
  ALTER TABLE "SWFT01UA1"."TB_RALF_USER" MODIFY ("USER_ID" NOT NULL ENABLE);
 
  ALTER TABLE "SWFT01UA1"."TB_RALF_USER" ADD PRIMARY KEY ("USER_ID");
  
  /

CREATE OR REPLACE TRIGGER "SWFT01UA1"."CREATE_RALF_USER" 
BEFORE INSERT
ON TB_RALF_USER
REFERENCING NEW AS NEW OLD AS OLD
FOR EACH ROW
BEGIN
   :NEW.CREATE_DATE := SYSDATE;

   EXCEPTION
     WHEN OTHERS THEN
       -- Consider logging the error and then re-raise
       RAISE;
END;



/
ALTER TRIGGER "SWFT01UA1"."CREATE_RALF_USER" ENABLE;
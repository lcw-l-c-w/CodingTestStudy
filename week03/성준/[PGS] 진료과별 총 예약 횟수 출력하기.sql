-- 코드를 입력하세요
-- SELECT * from APPOINTMENT;
-- APNT_YMD 진료예약일시, APNT_NO 진료예약번호, PT_NO 환자번호, MCDP_CD 진료과코드, MDDR_ID 의사ID, APNT_CNCL_YN 예약취소여부, APNT_CNCL_YMD예약취소날짜를 
--TIMESTAMP '2022-05-01 00:00:00' 무조건 이렇게 해야 한다고 함 
-- 난 이렇게 함 timestamp '2022-05-01'


select MCDP_CD as "진료과코드",
count(*) as "5월 예약건수"
from APPOINTMENT
where APNT_YMD >= timestamp '2022-05-01 00:00:00'
and APNT_YMD < timestamp '2022-06-01 00:00:00'
group by MCDP_CD
order by "5월 예약건수","진료과코드";
@echo off
echo SQL 실행 중...
echo SELECT * FROM user;

REM MySQL 클라이언트가 설치되어 있다면 사용
REM mysql -h next-db.c74828wmikhx.ap-northeast-2.rds.amazonaws.com -P 3306 -u admin -p'17Rwi[Cu*G[9*lGuXoWP)MFdyyVA' next -e "select * from user;"

REM 또는 애플리케이션을 통해 실행
echo 애플리케이션이 실행 중인지 확인하세요: http://localhost:8080/api/sql/users
pause 
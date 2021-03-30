-- jdbc04_Workshop

-- 1번
select lower(ename),sal,hiredate
from emp
where ename = "ADAMS";

-- 2번
select ename, hiredate, sal, year(curdate()) - year(hiredate)
as 근무년차
from emp
where year(curdate()) - year(hiredate) >= 7;

-- 3번
select deptno,count(deptno) 
from emp 
group by deptno
having count(deptno) >= 5;

-- 4번
select deptno, max(sal), min(sal)
from emp
group by deptno
having min(sal) != max(sal);

-- 5번
select ename,sal,job,deptno
from emp
where deptno in (10,20) or sal >= 2000;

-- 6번
select ename,hiredate,deptno,sal,comm
from emp
where year(hiredate) ='1981' and deptno in (10,20,30) and sal between 1500 and 3000
and comm is not null
order by hiredate,sal; 

-- 7번
select deptno, sal ,avg(sal)
from emp
where deptno in (10,20,30) and sal between 1500 and 3000
group by deptno
having avg(sal) >= 2000
order by avg(sal) desc;
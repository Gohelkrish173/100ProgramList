--1) Age Greter than 25
select ID,NAME,AGE from TBLEMPMST
where AGE > 25

--2) Employee ID,Name, and It's total salary
select e.ID,e.NAME,Sum(s.Salary) from TBLEMPMST as e
inner join TBLSALARYMST as s on s.EMPID = e.ID
Group by e.ID,e.NAME

--3) ID,Name and Salary of March Month
SELECT e.ID, e.NAME, s.SALARY FROM TBLEMPMST e
LEFT JOIN (
    SELECT EMPID, SALARY FROM TBLSALARYMST
    WHERE [MONTH] = 'MAR'
) s ON e.ID = s.EMPID;

--4) Month Wise Total Salary of EMployee age is greater than 25
select s.[MONTH],Sum(Salary) as Total_Salary from TBLSALARYMST as s
inner join TBLEMPMST as e on e.ID = s.EMPID
where e.AGE > 25
Group By s.[MONTH]
Create Table TBLEMPMST(
ID int Identity(1,1) Primary Key Not Null,
NAME nvarchar(100),
AGE int
);

Create Table TBLSALARYMST(
ID int Identity(1,1) Primary Key Not Null,
EMPID int Foreign Key References TBLEMPMST(ID) Not Null,
[MONTH] nvarchar(3) not null,
SALARY decimal(10,2) not null 
);

Insert Into TBLEMPMST(NAME,AGE)
values
('EMP1',25),
('EMP2',26),
('EMP3',23),
('EMP4',33),
('EMP5',32),
('EMP6',18),
('EMP7',20),
('EMP8',21);

-- SP Creation

--1. select All TBLSALARYMST
Create Proc [dbo].[PR_TBLSALARYMST_SelectAll]
As
Begin
	Select 
		ID,
		EMPID,
		T.[MONTH],
		SALARY
	from TBLSALARYMST as T
End

--2. select By ID TBLSALARYMST
Create Proc [dbo].[PR_TBLSALARYMST_SelectByID]
@ID int
As
Begin
	Select 
		ID,
		EMPID,
		T.[MONTH],
		SALARY
	from TBLSALARYMST as T
	where ID = @ID
end

--3. Delete TBLSALARYMST Data
Create Proc [dbo].[PR_TBLSALARYMST_Delete]
@ID int
As
Begin
	Delete from TBLSALARYMST
	where ID = @ID
End

--4. Add TBLSALARYMST DATA
Create Proc [dbo].[PR_TBLSALARYMST_Insert]
@EMPID int,
@MONTH nvarchar(3),
@SALARY decimal(10,2)
As
Begin
	Insert Into TBLSALARYMST(EMPID,[MONTH],SALARY)
	Values(
	@EMPID,@MONTH,@SALARY
	);
End

--5. Update TBLSALARYMST Data
Create Proc [dbo].[PR_TBLSALARYMST_Update]
@ID int,
@EMPID int,
@MONTH nvarchar(3),
@SALARY decimal(10,2)
As
Begin
	Update TBLSALARYMST
	set
		EMPID = @EMPID,
		TBLSALARYMST.[MONTH] = @MONTH,
		SALARY = @SALARY
	where ID = @ID
End

--6. DropDown TBLEMPMST
create proc [dbo].[PR_EMP_DropDown]
As
Begin
	Select 
		ID,
		Name
	from TBLEMPMST
End

--7. Join Query
Create Proc [dbo].[PR_TBLSALARYMST_SelectAll_With_Join]
As
Begin
	Select 
		T.ID,
		e.Name,
		T.[MONTH],
		SALARY
	from TBLSALARYMST as T
	inner join TBLEMPMST as e on e.ID = T.EMPID
End
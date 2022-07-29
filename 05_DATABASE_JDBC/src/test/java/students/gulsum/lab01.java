package src.test.java.students.gulsum;

public class lab01 {}
//1. List all the employees' first and last name with their salary in employees table
//    select FIRST_NAME, LAST_NAME, SALARY FROM employees;
//2. how many employees have salary less than 5000?
//    select count(salary) from employees where salary < 5000;
//3. how many employees have salary between 6000 and 7000?
//    select count(salary) from employees Where salary between 6000 and 7000;
//4. List all the different region_ids in countries table
//    select distinct region_id From countries;
//5. display the salary of the employee Grant Douglas (lastName: Grant,  firstName: Douglas)
//    select first_name,last_name,salary from employees
//    where last_name='Grant' AND first_name='Douglas';
//6. display the maximum salary in employees table
//    select max(salary) from employees;
//7.display all informations of the employee who has the highest salary in employees table
//    select * from employees where salary = (select max(salary) from employees);
//8. display the the second maximum salary from the employees table
//    select max(salary) from employees where salary < (select max (salary) from employees);
//9.display all informations of the employee who has the second highest salary
//    select * from employees where salary=(select max(salary) from employees Where salary < (select max(salary) from employees));
//10. display the the minimum salary in employees table
//    select min(salary) from employees;
//11. display all informations of the employee who has the minimum salary in employees table
//    select * from employees where salary = (select max(salary) from employees);
//12. display the second minimum salary from the employees table
//    select min(salary) from employees where salary > (select min (salary) from employees);
//13. display all informations of the employee who has the second minimum salary
//    select * from employees where salary=(select min(salary) from employees Where salary > (select min(salary) from employees));
//14. display the average salary of the employees;
//    select avg(salary) from employees;
//15. list all the employees who are making above the average salary;
//    select * from employees where salary > (select avg(salary) from employees);
//16. list all the employees who are making less than the average salary
//    select * from employees where salary < (select avg(salary) from employees);
//17. count the total numbers of the departments in departs table
//    select count(*) from departments;
//18. sort the start_date in ascending order in job_history's table
//    select start_date from job_history order by start_date;
//19. sort the start_date in descending order in job_history's table
//    select start_date from job_history order by start_date desc;
//20. list all the employees whose first name starts with 'A'
//    select * from employees where first_name  like 'A%';
//21. list all the employees whose job_ID contains 'IT'
//    select * from employees where job_id like '%IT%';
//22. list all the employees whose department id in 50, 80, 100
//    select * from employees where department_id IN(50,80,100);

create table Employee (
id int not null AUTO_INCREMENT,
dep varchar(10),
salary int,
bonus int,
PRIMARY KEY (id)
);

insert into Employee (dep, salary, bonus) values ('IT', 100, 100);
insert into Employee (dep, salary, bonus) values ('IT', 300, 300);
insert into Employee (dep, salary, bonus) values ('HR', 150, 15);
insert into Employee (dep, salary, bonus) values ('HR', 200, 20);
insert into Employee (dep, salary, bonus) values ('HR', 300, 25);
insert into Employee (dep, salary, bonus) values ('IT', 250, 30);
insert into Employee (dep, salary, bonus) values ('IT', 300, 20);

select * from Employee;

-- вывести максимальную и минимальную зарплату по департаментам
select e.dep, max(e.salary), min(e.salary) from Employee e
group by e.dep;

-- вывести максимальный бонус среди самых высоких зарплат по департаментам
-- делаем внутренний join по таблице с группировкой по мак зарплате и департаментам
-- потом группируем по департаментам с максимальным бонусом
select e.dep, max(e.bonus) from Employee e inner join (
select dep, max(salary) salary from Employee
group by dep) m on (e.salary = m.salary and e.dep = m.dep)
group by e.dep;
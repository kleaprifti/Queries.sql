package com.company.Queries;

public class sql {
 /* Find the customer who has the most orders
    SELECT customerNumber ,  COUNT(orders.orderNumber) AS Orderscount
    FROM orders
    GROUP BY customerNumber
    ORDER BY Orderscount DESC
    LIMIT 1;

 -- List all products which have been ordered in the last month assuming we are on 2005-01-01
   SELECT productName , orderDate , monthname(orderDate) As 'MonthName'
   FROM products
   INNER JOIN orderdetails
   ON products.productCode = orderdetails.productCode
   INNER JOIN Orders
   ON orderdetails.orderNumber = orders.orderNumber
   WHERE MONTHNAME(Orders.orderDate) = 'December' AND year(Orders.orderDate)=2004;

   -- View All "Germany" customers and their orders details
SELECT A.country,B.orderNumber,C.orderLineNumber,C.quantityOrdered, C.priceEach
FROM Customers A
inner join orders B on A.customerNumber=b.customerNumber
inner join orderdetails as C on C.orderNumber=B.orderNumber
WHERE Country='Germany'

-- List all employees and their revenue amount(based on payments tab)
select emp.employeeNumber, emp.firstName, emp.lastName, SUM(pay.amount) as totalAmount
from payments as pay
join customers as c
join employees as emp
on pay.customerNumber = c.customerNumber and c.salesRepEmployeeNumber = emp.employeeNumber
group by emp.employeeNumber;

*/
}



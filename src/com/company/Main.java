package com.company;

use classicmodels;

        -- Find the customer who has the most orders
        SELECT customerNumber ,  COUNT(orders.orderNumber) AS Orderscount
        FROM orders
        GROUP BY customerNumber
        ORDER BY Orderscount DESC
        LIMIT 1;
# Write your MySQL query statement below
-- select customer_id from Customer c join Product p on c.customer_id=p.customer_id
-- group by c.customer_id having count(c.customer_id) = 

select customer_id from Customer group by customer_id having
count(distinct product_key) = (select count(*) from Product);
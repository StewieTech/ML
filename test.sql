/* Write your PL/SQL query statement below */
SELECT DISTINCT P1.Email FROM Person P1,Person P2 

WHERE P1.id <> P2.id AND P1.Email=P2.Email

-- Write a solution to report all the duplicate emails. Note that it's guaranteed that the email field is not NULL.
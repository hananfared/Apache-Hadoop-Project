**Instructions**

- Here is your lab 3 question that involves HBase, MySQL, and Sqoop:

Design and implement a system that transfers data from a MySQL database to HBase. The system should use Sqoop to perform the data transfer and should ensure data consistency and integrity. Other details are:

--The mySQL database name is 'retail_db' that contains a table called 'customers'. Print the structure of this table.

--The HBase table should have the same structure as the MySQL table, with the following differences:

    >>The "customer_id" field should be the row key.

    >>CustomerInfo column family may contain several keys: customer_fname, customer_lname, customer_email, customer_password

    >>ContactInfo column family may contain several keys: customer_street, customer_city, customer_state, customer_zip

    >>A miscellaneous column family should contain the remaining fields.

    >> List top 20 records of NY and VA state from the Hbase table.

    >> Demonstrate the application of two other HBASE commands
 
-- Write report explaining all the above steps and show the screenshot.

-- The report should be formatted well.

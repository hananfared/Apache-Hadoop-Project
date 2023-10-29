**Instructions**

- This lab involves you to work with PIG and HIVE. Here is what you have to do:

**Part A: using PIG**

1-- Download the json file from https://qa.mpi-inf.mpg.de/comqa/comqa_train.json and copy it into a text file. Our intention is to find out the WH question words (who, what, where, whom, which, how) from the given file.

2. Copy the file to hdfs location 

2-- Write PIG commands to count only the frequency of the WH question words from the question file that you put in hdfs location

4-- Accumulate all the commands in a script file called pigwhquestion.pig

5-- Run the script file to generate the final outcome at once

6-- Take a screen-shot of the script file content along with the final output the script file generates and put them in a word document named "lab2-yourname-ID.doc"

7-- submit "lab2pig-yourname-ID.doc" file along with a text file containing the pig commands.

**Part B: Using HIVE**

Download sample sales data from: https://www.kaggle.com/datasets/kyanyoga/sample-sales-data?resource=download
Use hive to compute the following:

1. Number of orders per country

2. Total amount for the orders that are shipped (status=shipped) per country

3. Total how many Small, Medium and Large deal have been made

4. create separate partition for order STATUS

5. Take the screen-shot of all the output being generated against the commands issued for the query made in step 1--4. Save the screenshot as "lab2hive-yourname-ID" and submit through onQ.

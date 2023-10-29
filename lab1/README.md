**Instructions**

- This lab has two parts:

**Part A:**

1.  login to VM (assuming there is a Cloudera VM installation at your site and the user/password is as osboxes/BaseUser@123

2.  List all the files and directories under /user/osboxes in HDFS 

3.  Create a directory with name 'inputdata' in HDFS (command: hdfs dfs -mkdir directoryname)

4.  List the folders in /user/osboxes within hdfs

5.  From your local machine, download historical stock data (csv format) of at least 5 stock quotes (random stock ticker) from yahoo financial (finance.yahoo.com) and put them in a local folder of your machine. Note that the downloaded data has the column structure as: 

Date	Open	High	Low	Close	Adj Close	Volume
6.  Add a column at the left named "Ticker" for each of the stock tickers (e.g. TSLA) data, and merge all data together in one file named 'stock.csv'

7.  Install Winscp and connect to VM to transfer the stock.csv file from your local machine to the VM (in a new folder called 'data' under /home/osboxes).

8.  Within VM, copy the file stock.csv from /home/osboxes/data (local file system) to 'inputdata' directory in HDFS that are created earlier

9.  Write command to display the content of the first and last few records in the stock.csv file in HDFS

10.  Make a copy of the stock.csv file as stock1.csv from the current hdfs location to another folder named 'testdata' in hdfs.

11.  For submission, create a word document and put the screenshot of all actions in a file name lab1-yourID-lastname. Also write your name and ID in header of the document you submit via OnQ under lab1.

**Part B:**

Write a MapReduce program in java that considers as input the Stock.csv file you created in Part A for for the stock quotes of 1 year.

Your goal is to find out the minimum closing price of each type of quotes (e.g. TSLA) taken from the 6th column (after adding the Ticker column) of the stock.csv file.

NOTE: Sample MapReduce program for wordcount problem has been supplied for reference.

You have to hand in the following for Part B:

1. the jar file

2. Copy and paste your java program source code for Driver, Mapper, and Reducer in the word document. The program code should have a comment line mentioning your name and ID

3. The stocks.txt data file you generated

4. Copy and paste the output file content within the word document.

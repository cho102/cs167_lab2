# Lab 2

## Student information

* Full name: Cindy Ho
* E-mail: cho102@ucr.edu
* UCR NetID: cho102
* Student ID: 862151318

## Answers

* (Q1) Verify the file size and report the running time.
**Copied 2027097262 bytes from 'AREAWATER.csv' to 'output.csv' in 110 seconds

* (Q2) Report the running time of the copy command.
**real	0m9.487s
**user	0m0.034s
**sys	0m4.381s

* (Q3) How do the two numbers compare? (The running times of copying the file through your program and the operating system.) Explain IN YOUR OWN WORDS why you see these results.
**The time in Q1 is longer than in Q2. I think it is because the file is stored locally in the computer so it was able to access it faster than compared to using IntelliJ where it has to follow the path every time to copy the file.

* (Q4) Does the program run after you change the default file system to HDFS? What is the error message, if any, that you get?
**Running hadoop jar target/cho102_lab2-1.0-SNAPSHOT.jar edu.ucr.cs.cs167.cho102.App input.txt output.txt, I got the error message:
	**Incorrect number of arguments! Expected two arguments.
  
* (Q5) Use your program to test the following cases and record the running time for each case.

* (Q6) Test your program on two files, one file stored on the local file system, and another file stored on HDFS. Compare the running times of both tasks. What do you observe?

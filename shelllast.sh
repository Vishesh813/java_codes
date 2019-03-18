!/bin/bash
#write your code here
#check number of argumnets not equal to 1  then echo  "Pass appropriate number of command line arguments"
if [ ! "$#" -ne 1 ]
then
    #check if file exists 
    if [ -e "$1" ]
    then
        #check if exists and if a directory
        if [ ! -d "$1" ]
        then
            #check if exists and redable .. 
            if [ -r "$1" ] 
            then
                #count the number of lines and echo
                count=$(grep -c "^$" $1)
                echo $count
            else
                echo "Input file does not have read permission"
            fi
        else 
            echo "Input file is not an ordinary file"
        fi
    else 
        echo "Input file does not exist"
    fi
else 
    echo "Pass appropriate number of command line arguments"
fi


!/bin/bash
# 1.
if [ ! "$#" -ne 1]
then # 2.check for file is 1
    if [ -e "$1"  ]
    then
        #3.check for dir or ordinary file
        if [ -d "$1"  ]
        then
         # 4.does'nt have read permission
         if [! -r "$"  ]
         then 
           # 5.count the number of lines and echo
            count=$(grep -c "^$" $1)
            echo $count
         #end of 5 block
         fi  
         else
           echo "Input file does not have read permission"
#end of 4. condition
         fi 
         else
           echo "Input file is not an ordinary file"
#end of 3 condition
        fi
#end of 2 condition 
    fi        
else 
    echo "Pass appropriate number of command line arguments"
#end block of 1 condition
   fi


############################################################

!/bin/bash
# 1.
if [ ! "$#" -ne 1]
then # 2.check for file is 1
    if [ -e "$1"  ]
    then
        #3.check for dir or ordinary file
        if [ -d "$1"  ]
        then
         # 4.does'nt have read permission
         if [! -r "$"  ]
         then 
           # 5.count the number of lines and echo
            count=$(grep -c "^$" $1)
         echo $count
         #end of 5 block  
        else
        echo "Input file does not have read permission"
#end of 4. condition
         fi 
         else
           echo "Input file is not an ordinary file"
#end of 3 condition
        fi
#end of 2 condition 
    fi        
else 
echo "Pass appropriate number of command line arguments"
#end block of 1 condition
fi


######################################################finall
#!bin/bash
# 1.
if [ ! "$#" -ne 1 ]
then # 2.check for file is 1
    if [ -e "$1"  ]
    then
        #3.check for dir or ordinary file
        if [ -d "$1"  ]
        then
         # 4.does'nt have read permission
         if [ ! -r "$1"  ]
         then 
           # 5.count the number of lines and echo
            count=$(grep -c "^$" $1)
         echo $count
         #end of 5 block  
        else
        echo "Input file does not have read permission"
#end of 4. condition
         fi 
         else
           echo "Input file is not an ordinary file"
#end of 3 condition
        fi
#end of 2 condition 
    fi        
else 
echo "Pass appropriate number of command line arguments"
#end block of 1 condition
fi
   


 
 
Running test case 1.... Command Line Arguments Validation
Command : bash script.sh
Expected Output : Pass appropriate number of command line arguments
Your output: Pass appropriate number of command line arguments
Test case passed
 
 
Running test case 2.... Input file existence Validation
Command : bash script.sh abc
Expected Output : Input file does not exist
Your output: Input file does not exist
Test case passed
 
 
Running test case 3.... Input file ordinary file Validation
Command : bash script.sh myDir
Expected Output : Input file is not an ordinary file
Your output: Input file does not exist
Test case failed. Please check your code
 
 
Running test case 4.... Input file read access validation
Command : bash script.sh testfile
Expected Output : Input file does not have read permission
Your output: Input file does not exist
Test case failed. Please check your code
 
 
Running test case 5.... Count of empty lines in the file file.dat
Command : bash script.sh file.dat
Expected Output : 0
Your Output : 0
Test case passed
 
 
Running test case 6.... Count of empty lines in the file sample.txt
Command : bash script.sh sample.txt
Expected Output : 3
Your Output : 3
Test case passed


#!bin/bash

if [ "$#" -eq 1  ]
then 
    if [ -f $1 ] && [ -d $1 ]
    then
        echo "Input file is not an ordinary file"  
    else
        if [ -r $1 ]
        then
            count=$(grep -c "^$" $1)
            echo $count
        else
        echo "Input file does not have read permission"
        fi 
    fi           
else 
   echo "Pass appropriate number of command line arguments" 
fi   

if [ ! "$#" -eq 2 ]
then 
    echo "Pass appropriate number of command line arguments"
else
    if [ ! -d $1 ]
    then 
        if [  -e "$1" ]
        then 
            if [ -r $1  ]
            then
                grep -i $2 $1 | wc -l
            else
               echo "Input file does not have read permission"
            fi
        else
            echo "Input file does not exist"
        fi       
    else
        echo  "Input file is not an ordinary file"  
     fi       
fi        
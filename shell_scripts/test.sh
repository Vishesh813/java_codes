count=0;
total=0;

if [ ! "$#" -eq 2 ]
then 
    echo "Pass appropriate number of command line arguments"
else
    if [ -f $1 ]
    then 
        if [ ! -d "$1" ]
        then 
            if [ -f $1  ]
            then
                grep -i $2 $1 | wc -l
            else
               echo "Input file does not have read permission"
            fi
        else
            echo "Input file is not an ordinary file" 
        fi       
    else
        echo "Input file is not exists"
     fi       
fi        
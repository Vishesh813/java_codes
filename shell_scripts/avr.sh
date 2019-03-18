if [ ! "$#" -eq 2 ] 
then 
    echo "Pass appropriate number of arguments"
else
    if [ -r "$1" ]
    then
        if [ "$2" = "Manager" ]
        then
            echo "Given designation not found"
        else
            if [ "$2" = "Analyst" ]
            then
                echo "500000"
            fi    
        fi        
    else
        echo "Input file does not have read permission"
    fi        

fi
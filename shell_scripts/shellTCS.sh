countwords
-------------------------------------------------------------

if [ $# -ne 2 ]
then
	echo "Pass appropriate number of command line arguments"
elif [ ! -f $1 ]
then
	echo "Input file does not exists" 
elif [ -d $1 ]
then
	echo "Input file is not an ordinary file"
elif [ ! -r $1 ]
then
	echo "Input file does not have read permission"
else 	grep -i $2 $1 | wc -l
fi
------------------------------------------------------------------

Employeecount
-------------------------------------------------------------------


if [ $# -ne 2 ]
then
	echo "Pass appropriate number of command line arguments"
elif [ ! -f $1 ]
then
	echo "Input file does not exists" 
elif [ -d $1 ]
then
	echo "Input file is not an ordinary file"
elif [ ! -r $1 ]
then
	echo "Input file does not have read permission"
else 	grep -i $2 $1 | wc -l
fi
---------------------------------------------------------------------

emptylines
----------------------------------------------------------------------

if [ $# -ne 2 ]
then
	echo "Pass appropriate number of command line arguments"
elif [ ! -f $1 ]
then
	echo "Input file does not exists" 
elif [ -d $1 ]
then
	echo "Input file is not an ordinary file"
elif [ ! -r $1 ]
then
	echo "Input file does not have read permission"
else 
	grep -i "^$" $1 | wc -l
fi
---------------------------------------------------------------------

Average Salary
------------------------------------------------------------------------
count=0;
total=0;
if [ $# -ne 2 ]
then
	echo "Pass appropriate number of command line arguments"
elif [ ! -f $1 ]
then
	echo "Input file does not exists" 
elif [ -d $1 ]
then
	echo "Input file is not an ordinary file"
elif [ ! -r $1 ]
then
	echo "Input file does not have read permission"
else 
for i in $( grep -i $2 $1 | awk -F"|" '{ print $h; }' ) #please fill the h value with coloumn number of salary in employee.txt
do
total=$(echo $total+$i | bc )
((count++))
done
echo "$total / $count" | bc
fi
-------------------------------------------------------------------

Student marks
------------------------------------------------------------------
count=0;
total=0;
if [ $# -ne 2 ]
then
  echo "Pass appropriate number of command line arguments"
elif [ -d $1 ]
then
  echo "Input file is not an ordinary file"
elif [ ! -f $1 ]
then
  echo "Input file does not exists" 

elif [ ! -r $1 ]
then
  echo "Input file does not have read permission"
else 
for i in $( awk -F"|" '{ print $h; }' $1 ) #please fill the h value with column number of marks in student.txt
do
if [ $i -ge $2 ]
then 
((count++))
fi
done
echo "$count"
fi



if [ $# -ne 1 ] 
then
echo "Pass appropriate number of command line arguments"
elif [ ! -e $1 ] 
then 
echo "Input file does not exist"
elif [ ! -d $1 ]
then 
echo " Input file is not a directory"
elif [ ! -r $1 ]
then echo "Input directory does not have read permission"
else
    find $1 -empty -type f | wc -l
fi


#Empty lines
if [ $# -ne 1 ] ;then
        echo "Pass appropriate number of command line arguments"

elif [ ! -e $1 ] ;
then echo "Input file does not exist"
elif [ ! -d $1 ] ;
then    echo " Input file is not a directory"
elif [ ! -r $1 ];
then echo "Input directory does not have read permission"
else
        find $1 -empty -type f | wc -l
fi
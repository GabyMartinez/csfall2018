echo write something
read line1
echo write something else
read line2
echo write some more please
read line3
echo write one more thing
read line4

echo $line1>file
echo $line2>>file
echo $line3>>file
echo $line4>>file

exec <file
#read lines
#sort lines
sort file
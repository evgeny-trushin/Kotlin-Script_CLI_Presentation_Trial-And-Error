dir=`pwd`/
cp "${dir}$1" "${dir}$1".kt
kotlinc "${dir}$1".kt -include-runtime -d "${dir}$1".jar
java -jar "${dir}$1".jar $2 $3 $4 $5 $6 $7
echo "Press enter"
read
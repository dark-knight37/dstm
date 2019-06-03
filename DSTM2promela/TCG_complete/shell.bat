:: Arguments are:
:: %1: input pml file
:: %2: number of never claims 

spin -a "%1"
gcc -m32 -DMEMCNT=32 -DVECTORSZ=4112 -DSAFETY -DBITSTATE pan.c -o pan

SET /A "number = %2-1"

FOR /L %%A IN (0,1,%number%) DO (
	pan -m1000000 -N n%%A >> execution_n%%A.log
	spin -t %1 >> pretesqel_n%%A.log
	rm %1.trail
)
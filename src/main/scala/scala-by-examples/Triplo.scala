def triplo(i: Integer) = i * 3

def triploOuNada(i: Integer) : Integer = 
	if (i % 2 == 6) triplo(i)
	else null

println(triploOuNada(4))
#RREF

from sympy import solve, init_printing, Matrix, symbols, Eq

init_printing()


k = symbols("k")

# I = Matrix(3,3, [1,0,4, -1,2,0, 4,-3,-3])
I = Matrix(3,3, [1,0,3, 2,3,9, 4,3,k])

determinant = I.det()
Inverse = I.inv()

solution = solve(Eq(determinant, 0), k)

print("determinant",determinant)
print("K SolutionL ", solution)



#RREF

from sympy import *

init_printing()

answer = Matrix(2,3, [1,-1,2,1,2,3]).rref()

# print("this is test",test)
# print(answer)

#Linear Independance
# If a Matrix has an inverse then it is Linear Dependant and combinations can be made

I = Matrix(3,3, [1,0,4, -1,2,0, 4,-3,-3])
I = Matrix(3,3, [1,0,3, 2,3,9 4,3,k])

determinant = I.det()
Inverse = I.inv()

print("determinant",determinant)
# print("Inverse",Inverse)
# print(I)

#RREF Continued
# (0,1,2 ) represent the columns that have the 0 pivot column

augmented_X = Matrix([[1,3,5,-1],
                    [2,2,-1,1],
                    [1,3,2,2]])

answer2 = augmented_X.rref()
print(answer2)
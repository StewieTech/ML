# import numpy as np

# x = np.array([-10, 0 , 10])

# answer = x @ x 
# answer2 = np.inner(x,x)
# print(answer2)

from sympy import Matrix, symbols

# Define the symbolic variable
t = symbols('t')

# Create the matrix with the given vectors
matrix = Matrix([[2, 4, 12],  [1, 2, t]])

# Perform row reduction
rref_matrix, pivot_columns = matrix.rref()

print(rref_matrix)

# Check if the last row is all zeros (linear dependence)
if all(element == 0 for element in rref_matrix[-1, :-1]):
    solution = rref_matrix[-1, -1]
    print(f"The vectors are linearly dependent for t = {solution}")
else:
    print("The vectors are linearly independent")

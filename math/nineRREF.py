
from sympy import Matrix, symbols

# Define the symbolic variable
t = symbols('t')

# Create the matrix with the given vectors
matrix = Matrix([[1, 0, 2],  [0, 2, 6], [2,5,t]])

# Perform row reduction
rref_matrix, pivot_columns = matrix.rref()

print(rref_matrix)

# Check if the last row is all zeros (linear dependence)
if all(element == 0 for element in matrix[-1, :-1]):
    solution = matrix[-1, -1]
    print(f"The vectors are linearly dependent for t = {solution}")
else:
    print("The vectors are linearly independent")
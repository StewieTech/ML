# from sympy import *

# t = symbols('t')

# matrix = Matrix([[2,4], 
#         [4,2],
#         [12,t]])

# determinant = matrix.det()

# solution = solve(Eq(determinant, 0), t)

# print(solution)

# from sympy import Matrix, symbols, Eq, solve

# # Define the symbolic variable
# t = symbols('t')

# # Create the matrix
# matrix = Matrix([[2, 4], [4, 2], [12, 4]])

# # Calculate the determinant
# determinant = matrix.det()

# # Solve for t when the determinant is zero
# solution = solve(Eq(determinant, 0), t)

# print(solution)

# from sympy import *

# init_printing()


# # Define the symbolic variable
# t = symbols('t')

# # Create the matrix with the first two rows
# matrix = Matrix(3,2, [2,1, 4,2,  12, t])

# # matrix = Matrix(3,3, [1,0,4, -1,2,0, 4,t,-3])


# # # Calculate the determinant
# determinant = matrix.det()

# print(determinant)

# # # Solve for t when the determinant is zero
# solution = solve(Eq(determinant, 0), t)

# print(solution)

# from sympy import Matrix, symbols, solve

# # Define the symbolic variable
# t = symbols('t')

# # Create the matrix
# matrix = Matrix([[2, 1], [4, 2], [12, t]])

# # Perform row reduction
# rref_matrix, pivot_columns = matrix.rref()

# # Check if there is a row of zeros in the row echelon form
# if any(all(element == 0 for element in row) for row in rref_matrix.tolist()):
#     print("The system is dependent")
# else:
#     print("The system is independent")

# # Solve for t
# print(rref_matrix)
# print("this is", matrix)
# solution = solve(matrix[2,1] - matrix[2,0]/2, t)
# print(f"The value of t that makes the system dependent is: {solution}")

from sympy import Matrix, symbols, Eq, solve

# Define the symbolic variable
t = symbols('t')

# Create the matrix
matrix = Matrix([[2, 1], [4, 2], [12, 6]])

# Create the vectors
a_vector = matrix[:, 0]
b_vector = matrix[:, 1]

# Check if b_vector is a scalar multiple of a_vector
is_proportional = all((b / a).equals(b_vector[0] / a_vector[0]) for a, b in zip(a_vector, b_vector))
# print(a_vector)
# solution = a_vector[0] / b_vector[0]
solution = solve(Eq(a_vector[0] / b_vector[0], a_vector[1] / b_vector[1]), t)
print(solution)

# Solve for t to make a_vector and b_vector linearly dependent
solution = None
if is_proportional:
    if a_vector[0] == 0:
        solution = solve(Eq(b_vector[0], 0), t)
    else:
        solution = solve(Eq(b_vector[0] / a_vector[0], b_vector[0] / a_vector[0]), t)

if solution:
    print(f"The vectors are linearly dependent for t = {solution[0]}")
else:
    print("The vectors are linearly independent")

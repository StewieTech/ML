
import numpy as np


# k = 2

# A = np.array([[1, 3, 2],
#               [2, k, 4],
#               [0, 0, 0]])

# # Constant vector
# b = np.array([1, 3, 0])

# # Solve the linear system
# # x = np.linalg.solve(A, b)
# det_A = np.linalg.det(A)
# print(det_A)

# if det_A == 0:
#     print("The system is inconsistent.")
# else:
#     print("The system is consistent.")
# print(det_A)

# # Retrieve the solutions
# # x_val = x[0]
# # y_val = x[1]


# # Print the solutions
# # print("x =", x_val)
# # print("y =", y_val)

#RREF

# from sympy import solve, init_printing, Matrix, symbols, Eq

# init_printing()


# k = symbols("k")


# matrix = Matrix(3,2, [1,2, 2,0, 0,1])

# x_vector = Matrix(k,4,1)

# determinant = I.det()
# Inverse = I.inv()

# solution = solve(Eq(determinant, 0), k)

# print("determinant",determinant)
# print("K SolutionL ", solution)

from sympy import solve, init_printing, Matrix, symbols, Eq

init_printing()

k = symbols("k")
c1, c2 = symbols('c1 c2')

u = Matrix([1, 2, 0])
v = Matrix([2, 0, 1])
x = Matrix([k, 4, 1])

# Create the coefficient matrix
A = u.row_join(v)

# Solve the system of equations
solution = solve(Eq(A * Matrix([c1, c2]), x), (c1, c2))
print(solution)

if solution:
    print(f"x = {x} is in the span of u and v for any value of k")
else:
    print(f"x = {x} is not in the span of u and v for any value of k")

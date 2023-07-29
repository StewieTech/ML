from sympy import symbols, Matrix, Eq, solve

k = symbols('k')
# A = Matrix([[1, 0, 3],
#             [0, 1, 2],
#             [k, 2, 4 * k]])

# # Solve the homogeneous system Ax = 0_vector
# solution = solve(A * Matrix([0, 0, 0]), k)

# print(solution)

import numpy as np

A = np.array([[1, 0, 3],
              [0, 1, 2],
              [k, 2, 4*k]])

# Augmented matrix
augmented_matrix = np.hstack((A, np.zeros((3, 1))))

# Row reduce the augmented matrix
rref_matrix, pivot_columns = np.linalg.qr(augmented_matrix, mode='r')

print(rref_matrix)
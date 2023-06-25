# one = x1 + x2 - 1
# two = x2 + x3 - 3
# three = x3 - 1

import numpy as np

# Coefficient matrix
A = np.array([[1, 1, 0],
              [0, 1, 1],
              [0, 0, 1]])

# Constant vector
b = np.array([1, 3, 1])

# Solve the linear system
x = np.linalg.solve(A, b)

# Retrieve the solutions
x1 = x[0]
x2 = x[1]
x3 = x[2]

# Print the solutions
print("x1 =", x1)
print("x2 =", x2)
print("x3 =", x3)


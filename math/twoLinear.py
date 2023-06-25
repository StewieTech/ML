# one = x + 2y  -4
# two = c1x + 6y -1

# 2y = - x -4
# 6y = -c1x + 1


import numpy as np

c1 = 1
# Coefficient matrix
A = np.array([[1, 2],
            #   [1, 1, 1],
              [c1, 6]])

# Constant vector
# b = np.array([1, 3, 1])
b = np.array([4, 1])

# Solve the linear system
x = np.linalg.solve(A, b)

# Retrieve the solutions
x = x[0]
y_val = x[1]
# c1x = x[2]

# Print the solutions
print("x =", x)
print("y =", y_val)
# print("c1x =", x3)



import numpy as np


k = 2

A = np.array([[1, 3, 2],
              [2, k, 4],
              [0, 0, 0]])

# Constant vector
b = np.array([1, 3, 0])

# Solve the linear system
# x = np.linalg.solve(A, b)
det_A = np.linalg.det(A)
print(det_A)

if det_A == 0:
    print("The system is inconsistent.")
else:
    print("The system is consistent.")
print(det_A)

# Retrieve the solutions
# x_val = x[0]
# y_val = x[1]


# Print the solutions
# print("x =", x_val)
# print("y =", y_val)



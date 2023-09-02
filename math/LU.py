import numpy as np
from scipy.linalg import lu_factor, lu_solve

# Given matrices L and U
L = np.array([[1, 0], [2, 1]])
U = np.array([[4, 5], [0, 2]])

# Given vector b
b = np.array([1, 4])

# Perform LU factorization
LU, piv = lu_factor(L)

# Solve Ly = b using forward substitution
y = lu_solve((LU, piv), b)

# Solve Ux = y using back substitution
x = np.linalg.solve(U, y)  # Using np.linalg.solve for back substitution

print(piv)
print("y:", y)
print("x:", x)


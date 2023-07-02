# one = x + y = 1
# two = y + 2z = 3
# three : x + y + z = 2


import numpy as np


# Coefficient matrix
# A = np.array([[1, 1, 0],
#                [0, 1, 2],
#               [1, 1, 1]])

t= 1
A = np.array([[2, 0],
              [1, 3] , 
              [0 , 1]])



# Constant vector //  on the right hand side // no sign switch
# b = np.array([1, 3, 1])
# b = np.array([1, 3, 2])
b = np.array([2, t, 7])

# Solve the linear system
x = np.linalg.solve(A, b)
print(x)

# Retrieve the solutions  
x_val = x[0]
y_val = x[1]
z_val = x[2]

# Print the solutions
print("x1 =", x_val)
print("x2 =", y_val)
print("x3 =", z_val)


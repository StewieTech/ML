import numpy as np 

# t = 1
A = np.array([[2, 0],
              [1, 3] , 
              [0 , 1]])

t_value = None
for t_guess in np.linspace(-100, 100, 1000):  # Guess a range of values for t
    b = np.array([2, t_value, 7])
    b[1] = t_guess
    coefficients = np.linalg.lstsq(A, b, rcond=None)[0]
    if np.allclose(np.dot(A, coefficients), b):
        t_value = t_guess
        break

print("Value of t:", t_value)







Col1_of_A = A[:, 0]
Col2_of_A = A[:, 1]
Col3_of_A = b

coefficient_matrix = A.T
print(coefficient_matrix)
# coefficients = np.linalg.solve(A, b)



coefficients = np.linalg.lstsq(A, b, rcond = None)[0]

c1 = coefficients[0]
c2 = coefficients[1]
# c3 = coefficients[2]

print("c1 =", c1)
print("c2 =", c2)
# print("c3 =", c3)


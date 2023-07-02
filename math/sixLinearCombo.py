import numpy as np

A = np.array([[2, 4],
              [2, 5],
              [4, 9]])

# Constant vector
for t in range(1,3):

    b = np.array([1, 0, 1])
    Aug = A + b

    column1_of_A = A[:, 0]
    column2_of_A = A[:, 1]
    

    # Coefficient matrix
    coefficient_matrix = np.column_stack((column1_of_A, column2_of_A, b.T))
    
    t = t + 1
    

    # Solve the linear system
    try:
        coefficients = np.linalg.solve(coefficient_matrix, b)
        t_value = coefficients[1]
        print("Value of t:", t_value)
        print(t_value)
    except np.linalg.LinAlgError:
        print("No solution exists for the given system of equations.")
    

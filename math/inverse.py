import numpy as np

# Define matrix A
A = np.array([[0.5, 4, 0],
              [0, 1, 0],
              [0, 0, 1]])

# Create the augmented matrix [A | I]
augmented_matrix = np.hstack([A, np.identity(3)])

# Perform row reduction to obtain [I | B]
num_rows, num_cols = augmented_matrix.shape

for i in range(num_rows):
    # Normalize the current row by dividing it by the leading coefficient
    augmented_matrix[i, :] /= augmented_matrix[i, i]
    for j in range(i + 1, num_rows):
        # Subtract multiples of the current row from rows below it
        factor = augmented_matrix[j, i]
        augmented_matrix[j, :] -= factor * augmented_matrix[i, :]

# The right half of the augmented matrix is the inverse matrix B
inverse_matrix = augmented_matrix[:, num_rows:]

print("Inverse matrix B:")
print(inverse_matrix)

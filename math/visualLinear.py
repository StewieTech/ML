import matplotlib.pyplot as plt
import numpy as np

# Matrix A
A = np.array([[11, 12, 13, 14],
              [21, 22, 23, 24]])

# Extract the column vectors
v1 = A[:, 0]
v2 = A[:, 1]
v3 = A[:, 2]
v4 = A[:, 3]

# Plotting the vectors
plt.quiver(0, 0, v1[0], v1[1], angles='xy', scale_units='xy', scale=1, color='r', label='v1')
plt.quiver(0, 0, v2[0], v2[1], angles='xy', scale_units='xy', scale=1, color='g', label='v2')
plt.quiver(0, 0, v3[0], v3[1], angles='xy', scale_units='xy', scale=1, color='b', label='v3')
plt.quiver(0, 0, v4[0], v4[1], angles='xy', scale_units='xy', scale=1, color='y', label='v4')

# Set the limits of the plot
plt.xlim([-10, 10])
plt.ylim([-10, 10])

# Set the aspect ratio
plt.gca().set_aspect('equal', adjustable='box')

# Add a legend
plt.legend()

# Show the plot
plt.show()

import numpy as np

x = np.array([-10, 0 , 10])

answer = x @ x 
answer2 = np.inner(x,x)
print(answer2)
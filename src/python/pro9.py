# Import necessary libraries
import numpy as np
import matplotlib.pyplot as plt
from sklearn.linear_model import LinearRegression

# Step 1: Generate random training data
np.random.seed(42)  # For reproducible results
X = np.random.rand(100, 1) * 10  # 100 random values between 0 and 10
y = 2 * X + 1 + np.random.randn(100, 1) * 2  # y = 2x + 1 + noise

# Step 2: Create and train the Linear Regression model
model = LinearRegression()
model.fit(X, y)

# Step 3: Predict using the trained model
y_pred = model.predict(X)

# Step 4: Plot the original data and the regression line
plt.scatter(X, y, color='blue', label='Data Points')         # Original data
plt.plot(X, y_pred, color='red', label='Regression Line')    # Best-fit line
plt.title('Linear Regression on Random Data')
plt.xlabel('X')
plt.ylabel('y')
plt.legend()
plt.show()

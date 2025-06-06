# Import required libraries
import pandas as pd
from sklearn.model_selection import train_test_split
from sklearn.neighbors import KNeighborsClassifier
from sklearn.metrics import accuracy_score
from sklearn.datasets import load_iris

# To store result status
result = []

# Load the Iris dataset (make sure path is correct or use built-in one)
# If using local CSV, update the path accordingly
# iris_data = pd.read_csv('/content/iris.data')  # Custom path (commented)
# OR use built-in dataset:
iris = load_iris()
X = iris.data
y = iris.target

# Split the dataset into training and testing sets
X_train, X_test, y_train, y_test = train_test_split(
    X, y, test_size=0.3, random_state=5)

# Create and train a KNN classifier
knn = KNeighborsClassifier(n_neighbors=3)
knn.fit(X_train, y_train)

# Make predictions on the test set
y_pred = knn.predict(X_test)

# Calculate accuracy
accuracy = accuracy_score(y_test, y_pred)
print(f'Accuracy of the KNN classifier: {accuracy * 100:.2f}%')

# Print the correct and wrong predictions
for i in range(len(y_test)):
    if y_test[i] == y_pred[i]:
        result.append("Correct")
    else:
        result.append("Wrong")

# Create a DataFrame to show results
status = pd.DataFrame({
    'Actual': y_test,
    'Predicted': y_pred,
    'Result': result
})

print(status)

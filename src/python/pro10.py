import pandas as pd
from sklearn.model_selection import train_test_split
from sklearn.naive_bayes import GaussianNB
from sklearn.metrics import accuracy_score

# Step 1: Load the dataset
data = pd.read_csv('/content/iris.data', header=None)  # Add header=None if no column names in CSV

# Step 2: Split dataset into features (X) and target (y)
X = data.iloc[:, :-1]  # All columns except the last one
y = data.iloc[:, -1]   # Last column is the target (class)

# Step 3: Split into training and testing data
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.2, random_state=20)

# Step 4: Train the Gaussian Naive Bayes model
model = GaussianNB()
model.fit(X_train, y_train)

# Step 5: Predict on the test set
y_pred = model.predict(X_test)

# Step 6: Calculate and print accuracy
accuracy = accuracy_score(y_test, y_pred)
print(f'Accuracy of the Naive Bayes classifier: {accuracy * 100:.2f}%')

# Step 7: Print prediction vs actual
print("\nPredicted vs Actual:")
comparison = pd.DataFrame({'Predicted': y_pred, 'Actual': y_test.values})
print(comparison)

import numpy as np
import pandas as pd



def average(iris, species):
    
	print(iris[0:3][0:iris.len()])
	return
	mean = np.mean(iris[0:49][0:3], axis = 0)
	
	print("Average sepal length of", species)
	print(mean[0])
	
	print("Average sepal width of ", species)
	print(mean[1])
	
	print("Average petal length of ", species)
	print(mean[2])
	
	print("Average petal width of ", species)
	print(mean[3])


fields = ["sepal_length", "sepal_width", "petal_length", "petal_width", "species"]
iris_data = pd.read_csv("../../main/resources/iris.data", names = fields)
iris_data = np.array(iris_data)

average(iris_data[0:49], "setosa")
average(iris_data[50:99], "versicolor")
average(iris_data[100:149], "virginica")
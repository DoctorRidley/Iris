db.data.find()

db.data.find().sort({"species": 1})

db.data.aggregate([
    {$group: 
	    {_id: "$species", 
		    sl_avg: {$avg: "$sepal_length"},
			sw_avg: {$avg: "$sepal_width"},
			pl_avg: {$avg: "$petal_length"},
			pw_avg: {$avg: "$petal_width"},
		}
	}
])

db.data.aggregate([
    {$group:
	    {_id: "$species",
			sl_total: {$sum: "$sepal_length"},
			sw_total: {$sum: "$sepal_width"},
			pl_total: {$sum: "$petal_length"},
			pw_total: {$sum: "$petal_width"}
		}
	}
])
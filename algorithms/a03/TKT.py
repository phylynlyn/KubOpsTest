group = {
    'A': 20,
    'B': 15,
    'C': 10
}

def split_the_bill(x):
    total_each_owed = sum(x.values())/float(len(x))
    return {key:round(value - total_each_owed, 2) for key, value in x.items()};


print(split_the_bill(group))
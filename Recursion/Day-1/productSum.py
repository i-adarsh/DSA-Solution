def ArraySum(array, multiplier):
    sum = 0
    for i in array:
        if type(i) is list:
            sum += ArraySum(i, multiplier + 1)
        else:
            sum += i
    return sum * multiplier

print(ArraySum(input("array = ") , 1))
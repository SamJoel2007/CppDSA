import math

mylist = [10, 5, 20, 20, 4, 5, 2, 25, 1]

minv = 0
maxv = 0

min_score = mylist[0]
max_score = mylist[0]

for x in mylist:
    if x < min_score:
        min_score = x
        minv+=1
    elif x > max_score:
        max_score = x
        maxv+=1

print(maxv)
print(minv)
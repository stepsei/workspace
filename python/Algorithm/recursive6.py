def fact(x):
    if x == 1:
        return 1
    else:
        return x * fact(x-1)

for i in range(1,10):
    print(fact(i))
from time import sleep

def print_items2(list):
    list = [3, 4, 5, 8, 9]
    for item in list:
        sleep(1)
        print(item)

print_items2(list)
print(list)
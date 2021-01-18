n = int(input())
index = 2

while(n>1):
    if n % index == 0:
        n /= index
        print(index)
    else:
        index += 1

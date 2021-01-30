n = input()
length = int(len(n) / 2)
a = sum(list(map(int, list(n[:length]))))
b = sum(list(map(int, list(n[length:]))))
if a == b:
    print("LUCKY")
else:
    print("READY")

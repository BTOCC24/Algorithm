string = input()
num = 0
result = []
for c in string:
    if '0' <= c <= '9':
        num += int(c)
    else:
        result.append(c)

print(''.join(sorted(result)) + str(num))
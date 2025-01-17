import sys

input = sys.stdin.readline
print = sys.stdout.write

n = int(input())
arr = []
for i in range(n):
    arr.append(int(input()))

arr.sort()

for i in range(n):
    print(str(arr[i]) + " ")
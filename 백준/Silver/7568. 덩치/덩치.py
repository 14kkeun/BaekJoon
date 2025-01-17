import sys

input = sys.stdin.readline
print = sys.stdout.write

n = int(input())

dic = dict()

for i in range(n):
    a, b = map(int, input().split())
    dic[i] = a, b

for a, b in dic.values():
    rank = 1
    for c, d in dic.values():
        if a < c and b < d:
            rank += 1
    sentence = str(rank) + " "
    print(sentence)
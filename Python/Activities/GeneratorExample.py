
n=5
def count_up_to(n):
    i=1
    while i<=n:
        yield i
        i+=1
for x in count_up_to(n):
    print(x)




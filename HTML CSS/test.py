# a = list(reversed(range(0,10)))
# b = reversed(list(range(0,11)))

# print(a)
# print(b)

def mygenerator():
    print('First item')
    yield 10

    print('Second item')
    yield 20

    print('Last item')
    yield 30



mygenerator()


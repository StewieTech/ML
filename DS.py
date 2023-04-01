# practice = [6, 5, 8, 9, 7]

# def rotate_by_one(lst):
#     test = []
#     # test.pop(-1)
#     # print(test)
#     test.append(lst[-1])
#     for i in lst:
#         test.append(i)
#     test.pop(-1)
#     return test

# print(rotate_by_one(practice))

# def rotate_by_one(lst):
#     return [lst[-1]]+lst[0:-1]

# def rotate_by_one(lst):
#     return lst[-1:] + lst[:-1]

# def rotate_by_one(lst):
# 	last_digit = lst.pop()
# 	lst.insert(0, last_digit)
# 	return lst

# import math

# def number_split(n):
#     new = math.floor(n / 2) 
#     lst = []
#     lst.append(new)
#     if n % 2 != 0:
#         lst.append(new+1)
#         return lst
#     lst.append(new)
#     return lst



# print(number_split(10))

# def number_split(n):
# 	return [n//2, n - n//2]

# def number_split(n):
# 	return [n//2, n//2+n%2]

# import math
# def number_split(n):
# 	a , b = math.floor(n/2), math.ceil(n/2)
# 	return [a,b]

practice1 = {1, 2, 4, 8}
practice2 = (7, 8, 9)

def convert(data1, data2):
    tupletype = type(data1)
    listtype = type(data1)
    if tupletype == tuple:
        return tuple(data2)
    elif listtype == list:
        return list(data2)
    else:
        return set(data2)
    # return type(data1)

print(convert(practice1,practice2))

def convert(data1, data2):
	return type(data1)(data2)

def convert(data1, data2):
  return eval(['tuple(data2)', 'list(data2)', 'set(data2)'][['tuple', 'list', 'set'].index(type(data1).__name__)])
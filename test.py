# def parity_analysis(num):
#     length = list(str(num))
#     result = 0
#     for i in length :
#         result += int(i)
#     if result % 2 == 0 and num % 2 == 0 or result % 2 != 0 and num % 2 != 0:
#         return True
#     return False


# print(parity_analysis(234))

# def parityAnalysis(num):
# 	digit_sum = sum(int(i) for i in str(num))
# 	return digit_sum%2 == num%2

# def parity_analysis(num):
# 	return num % 2 == sum(int(i) for i in str(num)) % 2

# parity_analysis=lambda n:n%2==sum(map(int,str(n)))%2

# def end_corona(recovers, new_cases, active_cases):
#     result = active_cases + new_cases - recovers
#     count = 1
#     while result > 0:
#         result = result + new_cases - recovers
#         print(result)
#         count += 1
#     return count
    
# print(end_corona(4000,2000,77000))

# end_corona= lambda r,n,a: (a//(r-n))+1



# def mubashir_function(a, b):
#     counta = 0
#     countb = 0
#     for number in str(a):
#         counta += int(number)
#     for numberTwo in str(b):
#         countb += int(numberTwo)
#     return counta * countb

# print(mubashir_function(12, 34))

# def mubashir_function(a, b):
# 	return sum(map(int, str(a))) * sum(map(int, str(b)))

# def digits_sum(x):
# 	return sum(int(i) for i in str(x))

# def mubashir_function(a, b):
# 	return digits_sum(a) * digits_sum(b)

# def opposite_house(house, n):
#     if house % 2  != 0:
#         lstOdd = [(x * 2) + 1
#                 for x in range(n)]
#         resultOdd = (house * 2) + 1
#         print(lstOdd)
#         print(resultOdd)
#         resultEven = ((house - (house - 1))* 2) + 2 - (2 )
#         lstEven = [(x * 2) + 2 for x in range(n)]

#         lstEven = lstEven[::-1]
#         print(lstEven)
#         result = dict(list(zip(lstOdd, lstEven)))
#     else :
#         lstOdd = [(x * 2) + 1
#             for x in range(n)]
#         print(lstOdd)
#         lstEven = [(x * 2) + 2 for x in range(n)]
#         lstEven = lstEven[::-1]
#         print(lstEven)
#         result = dict(list(zip(lstEven, lstOdd)))
#     return result[house]

# print(opposite_house(5,4))


# def opposite_house(house, n):
#     if house % 2  != 0:
#         # lstOdd = [(x * 2) + 1 for x in range(n)]
#         result =  { (x * 2 ) + 1} for x in range(n)}



#         return dict(list(zip([(x * 2) + 1 for x in range(n)], [(x * 2) + 2 for x in range(n)])))
#         # lstEven = [(x * 2) + 2 for x in range(n)]

#     else :
#         return dict(list(zip( [(x * 2) + 2 for x in range(n)], [(x * 2) + 1 for x in range(n)],)))


# print(opposite_house(1,4))

# def opposite_house(house, n):
#     if house % 2 == 1:
#         return (n - ((house + 1) // 2) + 1) * 2
#     return ((n - (house // 2)) * 2) + 1

# def opposite_house(house, n):
# 	return (2*n+1)-house

# def is_super_cool(string):
#     if string != "" :
#         return True
#     string.extend

# lstOne = [1, 2, 3] 
# lstTwo = [5, 3, 2] 
# lstThree = [7, 3, 2]

# lstOne = [1, 2, 2, 3]
# lstTwo = [5, 3, 2, 2] 
# lstThree = [7, 3, 2, 2]


# def sum_common(lst1, lst2, lst3):
#     result = []
#     for i in lst1 :
#         if lst1[i] == lst1[i+1]:
#             lst1.pop()
#             print(lst1)

#         for j in lst2 :
#             print(i,j)
#             for l in lst3:
#                 if i == l == j:
#                     result.append(l)
#     return result



# from collections import Counter
# def sum_common(lst1, lst2, lst3):
#     return sum((Counter(lst1) & Counter(lst2) & Counter(lst3)).elements())

# print(sum_common(lstOne, lstTwo, lstThree))
    
# lst=[]
# 	for i in lst1:
# 	 if i in lst2 and i in lst3:
# 	  lst.append(i)
# 	if len(lst)>0:
# 	 return sum(lst)
# 	return 0

# test = [1,2,0,1,0,1,0,3,0,1]    

# def move_zeros(lst):
#     countZero = 0
#     for i in lst:
#         if i == 0:
#             countZero += 1
#             lst.remove(0)
#     for i in lst:
#         if i == 0:
#             countZero += 1
#             lst.remove(0)
    
#     for i in range(countZero):
#         lst.append(0)
              
#     return lst

# print(move_zeros(test))

# def move_zeros(lst):
# 	a = []
# 	b = []
# 	for i in lst:
# 		if i != 0 or i is False:
# 			a.append(i)
# 		else: 
# 			b.append(i)
	
# 	return a + b

# def move_zeros(lst):
#     return sorted(lst, key=lambda x: x==0 and type(x) is not bool)

# test = [1, 2, 3]
# # test = [0, 0, 2]


# def simple_pair(lst, n):
#     answer = []
#     for i in lst:
#         for j in lst:
#             print(lst[i],lst[j-1])
#             print(lst[i] == lst[j])
#             # print(i,j)
#             if i * j == n and lst[i] != lst[j] :
#                 answer.append(i)
#                 answer.append(j)
#                 return answer
#             else :
#                 return None


# print(simple_pair(test, 3))

# def simple_pair(lst, n):
#   for i in range(len(lst)):
#     for j in range(i + 1, len(lst)):
#       x = lst[i]
#       y = lst[j]
#       if x * y == n:
#         return [x, y]
#   return None

# def simple_pair(lst, n):
#     for i, x in enumerate(lst[:-1]):
#         for y in lst[i + 1:]:
#             if x * y == n:
#                 return [x, y]
            
# max_time = {'very easy': 5, 'easy': 10, 'medium': 15, 'hard': 20}
# difficulty = ['very easy', 'very easy', 'easy', 'easy', 'medium', 'medium', 'hard', 'hard']
# allowed_time = sum(max_time[diff] for diff in difficulty) + 20 

# def interview(lst, tot):
#     completed = len(lst) == len(difficulty)
#     in_time = tot <= allowed_time
#     questions = all(lst[i] <= max_time[difficulty[i]] for i in range(len(lst)))
#     return "qualified" if completed and in_time and questions else "disqualified"

# dict = {
#   "Mubashir": "Name",
#   "31": "Age",
#   "Male": "Sex",
#   "Pilot": "Job",
#   "Matt": "Name",
#   "40": "Age",
#   "Programmer": "Job"
# }
         
# result = {}
# newKey = []
# newValue = []

# def swap_dict(dic):
#    for i in dict:
#       newKey.append(i)
#       newValue.append(dic[i])


#    print(newKey)
#    print(newValue)
# #    for key, value in enumerate(dic):
#    result = dict(list(zip(newKey,newValue)))
# #    result = result.dict()
# #    result[i] = value

#    return result


# print(swap_dict(dict))

# def swap_dict(dic):
#     result = {}
#     for key, value in dic.items():
#         result.setdefault(value, []).append(key)
#     return result


# def cup_swapping(swaps):
#     ball = "B"
#     for move in swaps:
#         if ball in move:
#             ball = move[1] if move[0] == ball else move[0]
#     return ball

# def cup_swapping(swaps):
# 	cur_cup = "B"
# 	for swap in swaps:
# 		if cur_cup in swap:
# 			cur_cup = swap.replace(cur_cup,"")
# 	return cur_cup

# test = [1,2,3]
 
# def curr(lst,mul):
#      newLst = []
#      for i in lst:
#           newLst.append(i * mul)
#      return newLst

# print(curr(test,2))
      
          
# multiply = lambda lst: lambda n: [x * n for x in lst]

# def node_type(_N, _P, n):
# 	if not n in _N: return "Not exist"
# 	if not n in _P: return "Leaf"
# 	if _P[_N.index(n)] == -1: return "Root"
# 	return "Inner"

# fib = [0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144]

# def fibonacci(n): 
#     fibAnswer = [0,1,1]
#     if n == 0: 
#        return 0
#     else:
#       for i in range(201):
#          result = fibAnswer[-1] + fibAnswer[-2]
#          fibAnswer.append(result)
 
#     return str(fibAnswer[n]) 
    
# print(fibonacci(10))

# def fibonacci(n):
#     x, y = 0, 1
#     for i in range(n):
#         x, y = y, x+y
#     return str(x)

# primes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97]




# def is_prime(primes, num, left=0, right=None):
# 	right = len(primes) - 1
# 	print("left: ", left)
# 	print("right: ", right)
# 	while left <= right:
# 		mid = (left + right) // 2
# 		print("mid: ", mid, primes[mid])
# 		if primes[mid] == num:
# 			return 'yes'
# 		elif primes[mid] > num:
# 			print('mid was greater than num')
# 			right = mid - 1
# 			print("right: ", right, primes[right])
# 		else:
# 			print('mid was less than num')
# 			left = mid + 1
# 			print("left: ", left, primes[left])
# 	return 'no'

# print(is_prime(primes,79))
# import numpy as np


# test1 = np.array([[1,2,3],[4,5,6],[7,8,9]])
# test2 = np.array([[1,2,3],[4,5,6],[7,8,9]])

# # def subtract_matrix(lst1, lst2):
# #     result = np.subtract(lst1, lst2)
# #     return result


# def subtract_matrix(lst1, lst2):
# 	a, b = np.array(lst1, dtype=float), np.array(lst2, dtype=float)
# 	return np.subtract(a, b).tolist()


# def subtract_matrix(A, B):
# 	for a,b in zip(A,B):
# 		return a,b


	# return [
	# 	[float(i) - float(j) for i, j in zip(a, b)]
	# 	# [float(i) - float(j) for i, j in zip(a, b)]  
	# 	# for a, b in zip(A, B)
	# ]
# print(subtract_matrix(test1, test2))

# test = 'hello'

# def modify(txt):
#     revWord = txt[::-1]
#    #  print(revWord)
#     result =  [ ord(char) - 96 for char in revWord ]
#     print(result)
#     word = ""
#     for i in result:
        
#         word += str(i)
#    #  print(word.strip("0b"))
#     result2 = bin(int(word))
#     return int(result2.lstrip("0b"))



# # def modify(t):
# # 	return int(bin(int(''.join([str(ord(i)-96) for i in t[::-1]])))[2:])

# def modify(t):
# 	t = reversed(t)
# 	t = map(lambda x: str(ord(x) - 96), t)
# 	t = int(''.join(t))
# 	print(t)
# 	t = bin(t)
# 	t = int(t[2:])
# 	return t
# print(modify(test))

# def pos_neg_sort(lst):
#   pos = sorted([i for i in lst if i>0],reverse=True)
#   return [pos.pop() if j>0 else j for j in lst]
# next


primes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97]

def primorial(n):
    for i in primes[n]:
        print(i)
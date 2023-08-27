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


# primes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97]

# def primorial(n):
#     result = 1
#     for i in primes[:n]:
#         result *= i
#     return result

# print(primorial(6))

# def primorial(n):
#   if n==1: return 2
#   a = []
#   for i in range(2, n**2):
#     for j in range(2, i):
#       if i%j==0:
#         break
#     else: a.append(i)
#   return eval("*".join(str(i) for i in a[:n])) 

# def alpha_clash(str_A, ind_A, str_Z, ind_Z):
#   left_A = [ord(l) for i,l in enumerate(str_A) if i not in ind_Z]
#   left_Z = [ord(l) for i,l in enumerate(str_Z) if i not in ind_A]
#   scores = [left_A[i]-left_Z[i] for i in range(16)]
#   return {'A':sum(s for s in scores if s>0), 'Z':-sum(s for s in scores if s<0)}

# items = {
#   "tv": 30,
#   "timmy": 20,
#   "stereo": 50,
#   }

# def find_it(items, name):

#     for n, num in (items).items():
#       #   while n != name:
#          print(n,name)
#          if n == name.lower():
#                return "{} is gone...".format(name.title())
#     return "{} is here!".format(name.title())

# print(find_it(items,"rambo"))

# def find_it(items, name):
#     return '{} is {}'.format(name.title(), 'gone...' if name in items else 'here!')


# class Solution:
#     def containsDuplicate(self, nums):
#         n = len(nums)
#         for i in range(n - 1):
#             for j in range(i + 1 , n):
#                 print(i,j)
#                 if nums[i] == nums[j]:
#                   return True
#             return False
# test = [1,2,3,1]
                
    
# class Solution:
#     def containsDuplicate(self, nums):
#         seen = {}
#         for num in nums:
#             if num in seen and seen[num] >= 1:
#                 print(f"Found duplicate: {num}")
#                 return True
#             seen[num] = seen.get(num, 0) + 1
#             print(f"Updated count for {num}: {seen[num]}")
#         return False

    
s = "anagram"
t = "nagarams"
# from collections import defaultdict
# count = defaultdict(int)

# class Solution(object):
#     def isAnagram(self, s, t):
#         """
#         :type s: str
#         :type t: str
#         :rtype: bool
#         """

#         seen = {}
#         for i in s:
#             if i in t:
#                 # seen[i] = seen.get(i, 0) + 1
#                 seen[i] += defaultdict(int)[i] 
#                 print(f"Updated count for {i}: {seen[i]}")
#         # s2 = sorted(list(set(s)))
#         # t2 = sorted(list(set(t)))
#         if set(s) == set(t):
          
#             return True
#         return False


# print(Solution.isAnagram(1,s,t))


# from collections import defaultdict

# class Solution(object):
#     def isAnagram(self, s, t):
#         """
#         :type s: str
#         :type t: str
#         :rtype: bool
#         """

#         seen = defaultdict(int)  # Use defaultdict for counting

#         for i in s:
#             if i in t:
#                 seen[i] += 1
#                 print(f"Updated count for {i}: {seen[i]}")

#         # Convert defaultdict to a regular dictionary before comparison
        
#         seen_dict = dict(seen)
#         print(seen_dict)
#         print(seen)


#         if set(s) == set(t) and seen_dict == seen:
#             return True
#         return False
    
# print(Solution.isAnagram(1,s,t))

# test = [1,2,3,1]

# class Solution:
#     def containsDuplicate(self, nums):
#         seen = {}
#         # n = len(nums)
#         for num in nums:
#             print(seen)
#             if num in seen:
#                 return True
#             else:
#                 seen[num] = seen.get(num,0) + 1
#         return False
    
# print(Solution.containsDuplicate(1,test))

# s2 = "anagram" 
# t2 = "nagaram"

# class Solution(object):
#     def isAnagram(self, s, t):
#         """
#         :type s: str
#         :type t: str
#         :rtype: bool
#         """
#         # s3 = list(s)
#         for letter in s:
#             if letter in t:
#                 print(s)
#                 s.pop(letter)
#                 if s == 0:
#                     return True
#         return False
        
# print(Solution.isAnagram(1,s2,t2))

# test = [2,5,5,11]
# target = 10

# class Solution(object):
#     def twoSum(self, nums, target):
#         """
#         :type nums: List[int]
#         :type target: int
#         :rtype: List[int]
#         """
#         n = len(nums)
#         result = []
#         for num in range(n ):
#             for num2 in range(num + 1, n):
#                 print(num, num2)
#                 if nums[num] + nums[num2] == target:
#                     result.append(num)
#                     result.append(num2)
#                     return result
#         return False
    
# solution = Solution()
# print(solution.twoSum(test,target))

tests = ["eat","tea","tan","ate","nat","bat"]

# class Solution(object):
#     def groupAnagrams(self, strs):
#         """
#         :type strs: List[str]
#         :rtype: List[List[str]]
#         """
#         # dict = {}
#         lst = []
#         bigLst = []
#         for word in strs:
#             lst.append(sorted(word))
#         # return lst
        
#         n = len(lst)
#         for i in range(n):
#             for j in range(i + 1, n):
#                 if lst[i] == lst[j]:
#                     bigLst.append(lst[i,j])
#             # print(lst)
#         #     print(dict)
#         #     if lst[sortedWord] != dict:
#         #         dict[sortedWord] = dict.get(sortedWord, 0) + 1
#         # return dict

# from collections import defaultdict
                
# class Solution:
#     def groupAnagrams(self, strs):
#         # anagram_map = defaultdict(list)
#         # anagram_map = {}.get(sorted_word,0) + 1
        
#         for word in strs:
#             sorted_word = ''.join(sorted(word))
#             print(sorted_word)
#             # anagram_map[sorted_word].append(word)
#             {}.get(sorted_word,0) + 1).append(word)
        
#         return list(anagram_map.values())
        
    
# solution = Solution()
# print(solution.groupAnagrams(tests))

# test = "A man, a plan, a canal: Panama"

# import re


# class Solution(object):
#     def isPalindrome(self, s):
#         """
#         :type s: str
#         :rtype: bool
#         """
#         s = re.sub('[^0-9a-zA-Z]+', '', s)
#         print(s)
#         s = (s.replace(" ","").replace(",","").replace(":",""))
#         s2 = s[::-1].lower()
#         if s.lower() == s2:
#             print(s,s2)
#             return True
#         return False
    
# solution = Solution()
# print(solution.isPalindrome(test))

# class Solution:
#     def isPalindrome(self, s: str) -> bool:
#         s = [c.lower() for c in s if c.isalnum()]
#         return all (s[i] == s[~i] for i in range(len(s)//2))
    
# class Solution:
#     def isPalindrome(self, s: str) -> bool:
#         i, j = 0, len(s) - 1
#         while i < j:
#             while i < j and not s[i].isalnum(): i += 1
#             while i < j and not s[j].isalnum(): j -= 1

#             if s[i].lower() != s[j].lower(): return False
#             i += 1
#             j -= 1

#         return True

class MinStack:
    def __init__(self):
        self.stack = []

    def push(self, val):
        if not self.stack:
            self.stack.append((val, val))
        else:
            mn = min(self.stack[-1][1], val)
            self.stack.append((val, mn))

    def pop(self):
        if self.stack:
            self.stack.pop()

    def top(self):
        if self.stack:
            return self.stack[-1][0]
        return 0

    def getMin(self):
        if self.stack:
            return self.stack[-1][1]
        return 0
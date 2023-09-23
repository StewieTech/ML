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

# practice1 = {1, 2, 4, 8}
# practice2 = (7, 8, 9)

# def convert(data1, data2):
#     tupletype = type(data1)
#     listtype = type(data1)
#     if tupletype == tuple:
#         return tuple(data2)
#     elif listtype == list:
#         return list(data2)
#     else:
#         return set(data2)
#     # return type(data1)

# print(convert(practice1,practice2))

# def convert(data1, data2):
# 	return type(data1)(data2)

# def convert(data1, data2):
#   return eval(['tuple(data2)', 'list(data2)', 'set(data2)'][['tuple', 'list', 'set'].index(type(data1).__name__)])sds

tests = "anagram"
testt = "nagaram"

class Solution(object):
    def isAnagram(self, s, t):
        if len(s) != len(t): return None
        
        newS, newT = sorted(s), sorted(t)
        return newS == newT
        # map = {}
        # n = len(s)

        # for i in range(n):
solution = Solution()

# print(solution.isAnagram(tests,testt))

# class Solution:
#     def isAnagram(self, s: str, t: str) -> bool:
#         if len(s) != len(t):
#             return False

#         countS, countT = {}, {}

#         for i in range(len(s)):
#             countS[s[i]] = 1 + countS.get(s[i], 0)
#             countT[t[i]] = 1 + countT.get(t[i], 0)
            
#         return countS == countT

    def groupAnagrams(self, strs):
        n = len(strs)
        hashStr = {}
        for i in range(n):
            hashStr[i] = 1 + hashStr.get(strs[i], 0) 



    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        strs_table = {}

        for string in strs:
            sorted_string = ''.join(sorted(string))

            if sorted_string not in strs_table:
                strs_table[sorted_string] = []

            strs_table[sorted_string].append(string)

        return list(strs_table.values())

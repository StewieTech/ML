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

def end_corona(recovers, new_cases, active_cases):
    result = active_cases + new_cases - recovers
    count = 1
    while result > 0:
        result = result + new_cases - recovers
        print(result)
        count += 1
    return count
    
print(end_corona(4000,2000,77000))

end_corona= lambda r,n,a: (a//(r-n))+1
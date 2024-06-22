string = "swiss"

def non_repeat(string):
    dict1 = {}
    
    for char in string:
        if char in dict1:
            dict1[char] += 1
        else:
            dict1[char] = 1
    
    for i in dict1:
        if dict1[char] == 1:
            return char
    return None

print("The Character is : {}".format(non_repeat(string)))
# Brute Force Approach
# ----------------------------------------------

class Solution:
    def intersectionWithDuplicates(self, a, b):
        # code here
        result = []
        
        for x in a:
            for y in b:
                if x == y and x not in result:
                    result.append(x)
    
        return result


# Best Approach
# -----------------------------------------------------------


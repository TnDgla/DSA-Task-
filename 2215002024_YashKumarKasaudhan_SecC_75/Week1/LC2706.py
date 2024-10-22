class Solution:
    def buyChoco(self, prices: List[int], money: int) -> int:
        min1=101
        idx=-1
        min2=101
        for i in range(len(prices)):
            if(min1>prices[i]):
                min1=prices[i]
                idx=i
        for i in range(len(prices)):
            if(idx!=i):
                if(prices[i]>=min1 and prices[i]<=min2):
                    min2=prices[i]
        s=min1+min2
        if(s>money): return money
        return money-s
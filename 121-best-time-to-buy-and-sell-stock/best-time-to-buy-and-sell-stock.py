class Solution(object):
    def maxProfit(self, prices):
        profit=0
        min_buy = float('inf')
        for i in range(0,len(prices)):
            if prices[i] < min_buy  :
                min_buy = prices[i]
            elif profit < prices[i]-min_buy:
                    profit = prices[i]-min_buy

        return profit 

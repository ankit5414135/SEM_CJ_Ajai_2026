#include<bits/stdc++.h>
//TC - O(N)
using namespace std;
class Solution {
public:
    int maxProfit(vector<int>& prices) {
       int max1=0;
       int min1=prices[0];
       int cost=0;
       for(int i=1;i<prices.size();i++){
                cost=prices[i]-min1;
                max1=max(max1,cost);
                min1=min(prices[i],min1);
       }
       return max1;
    }
};
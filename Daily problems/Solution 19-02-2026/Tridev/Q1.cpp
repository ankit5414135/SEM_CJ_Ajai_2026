#include<bits/stdc++.h>
using namespace std;
// TC - O(NlogN) SC-O(N)
class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int,int> mpp;
        for(int i=0;i<nums.size();i++){
            int val=nums[i];
            int t = target-nums[i];
            if(mpp.find(t)!=mpp.end()){
                return {mpp[t],i};
            }
            mpp[val]=i;
        }
    return {};
    }
};
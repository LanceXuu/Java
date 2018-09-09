//#include <iostream>
//#include <string>
//#include <vector>
//using namespace std;
//
//        bool temp(string t)
//        {
//        int temp = atoi(t.c_str());
//        if(temp >= 0 && temp<=255 &&(t.size() == 1 || t[0] != '0'))
//        return true;
//        return false;
//        }
//        void dfs(vector<string>& ans, string s, string t, int k)
//        {
//        if(k == 3)
//        {
//        if(temp(t))
//        ans.push_back(s+t);
//        return;
//        }
//        for(int i = 1; i< 4 && i < t.size(); i++)
//        {
//        string curr = t.substr(0, i);
//        if(temp(curr))
//        dfs(ans, s + curr + '.', t.substr(i), k+1);
//        }
//        }
//        vector<string> restoreIpAddresses(string t)
//        {
//        vector<string> ans;
//        string s;
//        dfs(ans,s, t, 0);
//        return ans;
//        }
//
//        int numIP(string str,int len)
//        {
//        if(len<=3)
//        return 0;
//        if(len==4)
//        return 1;
//        if(len==5)
//        return 4;
//        return 0;
//        }
//
//        int main()
//        {
//        string str;
//        getline(cin, str);
//        vector<string> res;
//        res = restoreIpAddresses(str);
//        cout<<res.size()<<endl;
//        return 0;
//        }

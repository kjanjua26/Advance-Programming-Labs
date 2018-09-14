#include "Stdafx.h"
#include <iostream>
#include <vector>
using namespace std;

vector<vector<int> > matVects(vector<vector<int> > A, vector<vector<int> > B){
    vector<vector<int> > res;
    for(int i = 0; i < 2; i++){
        vector<int> temp;
        for(int j = 0; j < 2; j++){
            temp.push_back(A[i][j]*B[j][i]);
        }
        res.push_back(temp);
    }
    return res;
}

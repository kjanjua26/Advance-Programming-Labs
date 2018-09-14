#include <iostream>
#include <vector>
#include "matrixDep.h"
using namespace std;
vector<vector<int> > MatrixT(vector<vector<int> > A){
    vector<vector<int> > res;
    for(int i = 0; i < 2; i++){
        vector<int> temp;
        for(int j = 0; j < 2; j++){
            temp.push_back(A[j][i]);
        }
        res.push_back(temp);
    }
    return res;
}

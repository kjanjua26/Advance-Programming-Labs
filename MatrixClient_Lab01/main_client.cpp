#include <iostream>
#include <vector>
#include "matAdd.cpp"
#include "matTrans.cpp"
#include "matMul.cpp"

using namespace std;

int main(){
    vector<vector<int> > inputMat;
    vector<vector<int> > addMat;
    vector<vector<int> > res;
    for(int i = 0; i < 2; i++){
        vector<int> temp;
        for(int j = 0; j < 2; j++){
            temp.push_back(i);
        }
        inputMat.push_back(temp);
    }
    for(int i = 0; i < 2; i++){
        vector<int> temp;
        for(int j = 0; j < 2; j++){
            temp.push_back(i);
        }
        addMat.push_back(temp);
    }
    cout << "Original Matrix 1: " << endl;
    for(int i = 0; i < 2; i++){
        vector<int> temp;
        for(int j = 0; j < 2; j++){
            cout << addMat[i][j];
        }
        cout << endl;
    }
    cout << "Original Matrix 2: " << endl;
    for(int i = 0; i < 2; i++){
        vector<int> temp;
        for(int j = 0; j < 2; j++){
            cout << inputMat[i][j];
        }
        cout << endl;
    }
    res = addVects(inputMat, addMat);
    cout << "Result of Addition: " << endl;
    for(int i = 0; i < 2; i++){
        vector<int> temp;
        for(int j = 0; j < 2; j++){
            cout << res[i][j];
        }
        cout << endl;
    }
    res = subVects(inputMat, addMat);
    cout << "Result of Subtraction: " << endl;
    for(int i = 0; i < 2; i++){
        vector<int> temp;
        for(int j = 0; j < 2; j++){
            cout << res[i][j];
        }
        cout << endl;
    }
    res = matT(inputMat);
    cout << "Result of Transpose of Matrix 1: " << endl;
    for(int i = 0; i < 2; i++){
        vector<int> temp;
        for(int j = 0; j < 2; j++){
            cout << res[i][j];
        }
        cout << endl;
    }
        res = matVects(inputMat, addMat);
    cout << "Result of Multiplication: " << endl;
    for(int i = 0; i < 2; i++){
        for(int j = 0; j < 2; j++){
            cout << res[i][j];
        }
        cout << endl;
    }
}

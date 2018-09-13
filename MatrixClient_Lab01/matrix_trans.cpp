#include <iostream>
#include <vector>
#include "matrixDep.h"
using namespace std;
vector<vector<double>>  MatrixT(vector<vector<double>> mat, int noRows, int noCol){
	for (int i = 0; i < noRows / 2; i++){
		for (int j = 0; j < noCol / 2; j++){
			swap(mat[i][j], mat[i][j]);
		}
	}
	return mat;
}

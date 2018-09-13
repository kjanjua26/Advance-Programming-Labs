#include "Stdafx.h"
#include <iostream>
#include <vector>
using namespace std;
vector<vector<double>>  MatrixMul(vector<vector<double>> mat_a, int noRows1, int noCol1, vector<vector<double>> mat_b, int noRows2, int noCol2){
	vector<vector<double>> res;
	for (int i = 0; i < noRows1; ++i)
		for (int j = 0; j < noCol2; ++j)
			for (int k = 0; k < noRows2; ++k)
				res[i][j] += mat_a[i][k] * mat_b[k][j];

	return res;
}

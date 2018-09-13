#include "Stdafx.h"
#include <iostream>
#include <vector>
using namespace std;
vector<vector<double>> MatrixAdd(vector<vector<double>> mat_a, vector<vector<double>> mat_b, int noRows, int noCol){
	vector<vector<double>> res;
	for (int i = 0; i < noRows; i++){
		for (int j = 0; j < noCol; j++){
			res[i][j] = mat_a[i][j] + mat_b[i][j];
		}
	}
	return res;
}

vector<vector<double>> MatrixSub(vector<vector<double>> mat_a, vector<vector<double>> mat_b, int noRows, int noCol){
	vector<vector<double>> res;
	for (int i = 0; i < noRows; i++){
		for (int j = 0; j < noCol; j++){
			res[i][j] = mat_a[i][j] - mat_b[i][j];
		}
	} 
	return res;
}

# 아래의 모든 코드는 한 줄씩 입력 가능한 프롬프트 터미널에서 입력 해야함.

import pandas as pd

red_df = pd.read_csv('D:/winequality-red.csv', sep = ';', header = 0, engine = 'python')
white_df = pd.read_csv('D:/winequality-white.csv', sep = ';', header = 0, engine= 'python')
# 로컬 파일을 읽어와 보기 좋게 엑셀 파일을 정리

red_df.to_csv('D:/winequality-red2.csv', index = False)
white_df.to_csv('D:/winequality-white2.csv', index = False)
# 파일 출력하기

red_df.head()
red_df.insert(0, column = 'type', value = 'red')
red_df.head()
red_df.shape
# 

white_df.head()
white_df.insert(0, column = 'type', value = 'white')
white_df.head()
white_df.shape

wine = pd.concat([red_df, white_df])
wine.shape
wine.to_csv('D:/wine.csv', index = False)

print(wine.info())

wine.columns = wine.columns.str.replace(' ', '_')
wine.head()
wine.describe()
# .describe() -> 데이터들의 총 개수, 평균, 표준편차 등의 기본적인 통계 정보를 출력

sorted(wine.quality.unique())
wine.quality.value_counts()
# quality 속성값 중

wine.groupby('type')['quality'].describe()
wine.groupby('type')['quality'].mean()
wine.groupby('type')['quality'].std()
wine.groupby('type')['quality'].agg(['mean','std'])

#------ t-검정과 회귀분석을 해보자 ------ #
from scipy import stats
# 여기서 오류가 난다면 cmd에서 `pip install statsmodels` 를 사용하여 scipy 라이브러리를 설치하자
from statsmodels.formula.api import ols, glm
red_wine_quality = wine.loc[wine['type'] == 'red', 'quality']
white_wine_quality = wine.loc[wine['type'] == 'white', 'quality']
stats.ttest_ind(red_wine_quality, white_wine_quality, equal_var = False)
Rformula = 'quality ~ fixed_acidity + volatile_acidity + citric_acid + residual_sugar + chlorides + free_sulfur_dioxide + total_sulfur_dioxide + density + pH + sulphates + alcohol'
regression_result = ols(Rformula, data = wine).fit()
regression_result.summary()





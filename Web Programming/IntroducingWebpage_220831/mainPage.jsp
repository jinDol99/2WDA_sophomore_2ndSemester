<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>박진석 소개 - 메인 페이지</title>
	<style>
		#upper {
			position: fixed;
			display: flex;
			left: 0;
			top: 0;
			right: 0;
			height: 50px;
			background-color: white;
		}
        
        #upper_img_left {
    		margin-top: 7px;
    		flex: 2;
        }
        
        #upper_img_mid {
        	flex: 3;
        }
        
        #upper_img_right{
        	flex: 0;
        }
	
	
        #left {
            float: left;
            width: 15%;
            margin-top: 100px;
        }
        
        #right {
            float: right;
            width: 80%;
            margin-top: 100px;
            background-color: #F5F5F5;
        }
        
        #box_inline_block {
            display: inline-block;
            width: 350px; height: 350px;
            margin: 10px;
        }
    </style>
</head>
<body>
	<div id="upper">
		<div id="upper_img_left">
			<img alt="YOUTUBE" src="./img/upper_icon_left.jpg">
		</div>
		
		<div id="upper_img_mid">
			<img alt="검색" src="./img/upper_icon_mid.jpg"></img>
		</div>
		
		<div id="upper_img_right">
			<img alt="검색" src="./img/upper_icon_right.jpg"></img>
		</div>
	</div>

	<div id="left">
		<img alt="왼쪽 사이드바" src="./img/left_bar_home.jpg"></img>
 
    </div>
    <div id="right">
        <h4>팁: 원하시는 영상의 썸네일이나 제목을 클릭하세요!</h4>
        
        <span>  </span>
			<div id="box_inline_block">
				<table width="349" height="349">
					<tr>	
					    <td colspan="2" height="250">
					    	<a href="./first_whatsMe.jsp">
					    		<img src="./img/tenFact_lrg.jpg" width="348" height="220">
					    	</a>
						</td>
					</tr>
					<tr>
					    <td rowspan="3" width="100">
					    	<img src="./img/tenFact_prf.jpg" width="80" height="80">
						</td>
					    <td><a href="./first_whatsMe.jsp">당신이 몰랐었던 박진석의 10가지 사실들</a></td>
					</tr>
					<tr>
					    <td style="color: grey">닝겐위키</td>
					</tr>
					<tr>
					    <td style="color: grey">조회수 5천회 · 3시간 전</td>
					</tr>
				</table>
			</div>
		<span>  </span>
		
		
		<span>  </span>
			<div id="box_inline_block">
				<table width="349" height="349">
					<tr>	
					    <td colspan="2" height="250">
					    	<a href="./second_favorite.jsp">
					    		<img src="./img/overwatch_lrg.jpg" width="348" height="220">
					    	</a>
						</td>
					</tr>
					<tr>
					    <td rowspan="3" width="100">
					    	<img src="./img/overwatch_prf.jpg" width="80" height="80">
						</td>
					    <td><a href="./second_favorite.jsp">아니 뽕르시가 여기서? - 오버워치 매드무비.zip</a></td>
					</tr>
					<tr>
					    <td style="color: grey">생전 고인의 개쩌는 순간들</td>
					</tr>
					<tr>
					    <td style="color: grey">조회수 28만회 · 2달 전</td>
					</tr>
				</table>
			</div>
		<span>  </span>
		
		
		<span>  </span>
			<div id="box_inline_block">
				<table width="349" height="349">
					<tr>	
					    <td colspan="2" height="250">
					    	<a href="./secsec_mbti.jsp">
					    		<img src="./img/mbti_lrg.jpg" width="348" height="220">
					    	</a>
						</td>
					</tr>
					<tr>
					    <td rowspan="3" width="100">
					    	<img src="./img/mbti_prf.jpg" width="80" height="80">
						</td>
					    <td><a href="./secsec_mbti.jsp">ISFJ 특징과 팩폭ㅋㅋㅋㅋ(댓글 포함)</a></td>
					</tr>
					<tr>
					    <td style="color: grey">MBTI는잘몰?루TV</td>
					</tr>
					<tr>
					    <td style="color: grey">조회수 2.5만회 · 1년 전</td>
					</tr>
				</table>
			</div>
		<span>  </span>
		
		
		<span>  </span>
			<div id="box_inline_block">
				<table width="349" height="349">
					<tr>	
					    <td colspan="2" height="250">
					    	<a href="./third_japan.jsp">
					    		<img src="./img/osaka_lrg.jpg" width="348" height="220">
					    	</a>
						</td>
					</tr>
					<tr>
					    <td rowspan="3" width="100">
					    	<img src="./img/osaka_prf.jpg" width="80" height="80">
						</td>
					    <td><a href="./third_japan.jsp">일본 여행 vlog | 친구와 함께 오사카를~ ep.01</a></td>
					</tr>
					<tr>
					    <td style="color: grey">진돌Jindol</td>
					</tr>
					<tr>
					    <td style="color: grey">조회수 45만회 · 5년 전</td>
					</tr>
				</table>
			</div>
		<span>  </span>
		
		
		<span>  </span>
			<div id="box_inline_block">
				<table width="349" height="349">
					<tr>	
					    <td colspan="2" height="250">
					    	<a href="./fourth_work.jsp">
					    		<img src="./img/dontwork_lrg.jpg" width="348" height="220">
					    	</a>
						</td>
					</tr>
					<tr>
					    <td rowspan="3" width="100">
					    	<img src="./img/dontwork_prf.jpg" width="80" height="80">
						</td>
					    <td><a href="./fourth_work.jsp">이런 사람들 절대 개발자 하지 마세요!!</a></td>
					</tr>
					<tr>
					    <td style="color: grey">네가뭔데일해라절해라야</td>
					</tr>
					<tr>
					    <td style="color: grey">조회수 301회 · 1년 전</td>
					</tr>
				</table>
			</div>
		<span>  </span>
		<h1>172.26.29.12:8080/jwbook/mainPage.jsp</h1>
		
    </div>
</body>
</html>
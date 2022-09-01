<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>박진석 - 경험</title>
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
            width: 60%;
            margin-top: 100px;
        }
        
        #right {
            float: right;
            width: 35%;
            margin-top: 100px;
        }
        
        #box_inline_block {
            display: inline-block;
            
        }
        
        #video_block {
        	display: inline-block;
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
        <div>
        	<video src="./img/japanTravel.mp4" width="100%" controls poster="./img/mindMap.jpg"></video>
        </div>
        <h3>일본 여행 vlog | 친구와 함께 오사카를~ ep.01</h3>
        <p>조회수 450,923회 · 2017. 9. 23.</p>
        <hr>
        <h4>경험</h4>
        <p>가끔 가족이나 친구끼리 여행을 가기도 해요. 가장 기억에 남는 곳은 일본 오사카에 갔던 때네요. 궁금하시면 위 영상을 참고하세요!</p>
        <p>여행을 제외한 경험으로는 앞서 말했듯이 군 입대 전 현대중공업에서 전기시설공사 업체를 2년간 다닌 게 있네요. 고압이 아닌 저압전기기는 하지만 여러가지 많이 배웠었어요. 콘센트나 전기 스위치 수리하는 법, 전선 배선하는 법, 정전 복구하는 법 등을 말이죠. 몇번 감전되서 죽을 뻔 한 적도 있지만 나쁘지 않은 경험이였어요!</p>
        <p>그리고 입학하기 전 LG 이노텍에서 몇 개월 정도 일을 했어요. 괜히 "추노텍"이라고 불리는게 아니더군요. 여러분, 교대근무는 하지 마세요 제발.</p>
        <p>하지만 생각해보니 코딩 관련 경험은 거의 없다시피 하네요. 굳이 뽑자면 컴퓨터 조립 한 두번 한 정도...? 그래도 열심히 배우다보면 전기업체에서 일했던 것 처럼 실력이 좋아질거라고 믿고 있어요!</p>
        
    </div>
    
    <div id="right">
        <h3>관련 페이지</h3>
		
		<span>  </span>
			<div id="box_inline_block">
				<table>
					<tr>
					    <td rowspan="3">
					    	<a href="./mainPage.jsp">
					    		<img src="./img/cat.jpg" height="100" width="140">
					    	</a>
						</td>
					    <td><a href="./mainPage.jsp">메인페이지로 가는 링크가 존재한다? 충격!</a></td>
					</tr>
					<tr>
					    <td style="color: grey">형신TV</td>
					</tr>
					<tr>
					    <td style="color: grey">조회수 800만회 · 4년 전</td>
					</tr>
				</table>
			</div>
		<span>  </span>
		
		
		<span>  </span>
			<div id="box_inline_block">
				<table>
					<tr>
					    <td rowspan="3">
					    	<a href="./first_whatsMe.jsp">
					    		<img src="./img/tenFact_sml.jpg" height="100" width="140">
					    	</a>
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
				<table>
					<tr>
					    <td rowspan="3">
					    	<a href="./second_favorite.jsp">
					    		<img src="./img/overwatch_sml.jpg" height="100" width="140">
					    	</a>
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
				<table>
					<tr>
					    <td rowspan="3">
					    	<a href="./secsec_mbti.jsp">
					    		<img src="./img/mbti_sml.jpg" height="100" width="140">
					    	</a>
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
				<table>
					<tr>
					    <td rowspan="3">
					    	<a href="./fourth_work.jsp">
					    		<img src="./img/dontwork_sml.jpg" height="100" width="140">
					    	</a>
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
		
		
    </div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>박진석 소개 - 좋아하는 것</title>
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
        	<video src="./img/overwatch.mp4" width="100%" controls poster="./img/mindMap.jpg"></video>
        </div>
        <h3>아니 뽕르시가 여기서? - 오버워치 매드무비.zip</h3>
        <p>조회수 281,914회 2022. 7. 23.</p>
        <hr>
        <h4>좋아하는 것</h4>
        <p>제가 가장 좋아하는 것 중에 하나는 게임, 그 중에서도 FPS를 즐겨합니다. 영상에 나오는 오버워치는 물론 콜오브듀티, 배틀필드, 레포데 같은걸 즐겨 합니다. 아, "즐겨"할 뿐, "잘" 하는건 아닙니다...</p>
        <p>음악은 대부분 다 좋아하지만 장르를 따진다면 발라드 음악을 주로 즐겨 들어요. 좋아하는 가수는 "윤딴딴"이 마이 뻬이보릿이에요.</p>
        <p>삼성과 마소 빠돌이입니다. 노트3 - s8 - s20순으로 10여년간 써왔답니다. 네? 아이폰이요? 애플페이 되면 갈아타볼 생각이 있어요.</p>
        <p>고양이 너무너무 좋아해요!!! 하지만 여러 사정으로 키우지는 못하고 있어요. 흑흑 진짜 나만 고앵이 없어</p>
        <p>먹는걸 좋아해요! 약간 스트레스를 먹으면서 푸는 타입이라 최근에 살이 많이 쪘네요.</p>
        <p>민초요? "불호"</p>
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
					    	<a href="./third_japan.jsp">
					    		<img src="./img/osaka_sml.jpg" height="100" width="140">
					    	</a>
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
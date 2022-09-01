<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>박진석 소개 - 진로와 꿈</title>
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
        	<video src="./img/working.mp4" width="100%" controls poster="./img/mindMap.jpg"></video>
        </div>
        <h3>이런 사람들 절대 개발자 하지 마세요!!</h3>
        <p>조회수 301회 · 2021. 3. 1.</p>
        <hr>
        <h4>진로와 꿈</h4>
        <p>우선 제목 어그로 죄송합니다. 개발자 되지 말라는 말이 어딨어요, 하고 싶으면 하는거죠. 위 제목은 그냥 농담으로 넘어가주세용</p>
        <p>여하튼 본론으로 돌아와서 저는 마인드 맵에서 볼 수 있다시피 프론트엔드 쪽으로 진로를 희망하고 있습니다. 변경사항이 눈에 바로바로 확인이 되고 고객들과 가장 먼저 접속되는 "얼굴 마담" 역할을 하는 프론트엔드에 관심이 생기더라구요. 무엇보다 디자인적 요소도 있기 때문에 더욱 흥미가 생기게 되네요!</p>
        <p>개인적인 버킷리스트로는 혼자서 해외 배낭여행을 일주일 정도 해보는 것이에요. 특히 일본 여행이 너무 괜찮은 경험이라, 가능하다면 일본전국일주를 한번 해 보고 싶네요!</p>
        <p>그리고 죽기 전 까지 헌혈을 100회를 달성하는 것도 버킷리스트 중 하나에요. 지금은 피부과 약을 먹고 있는 바람에 20회 정도에서 멈춰있지만 언젠가 피부가 좋아지고 약 복용을 중단하게 된다면 얼른 헌혈을 해서 수혈이 필요한 사람에게 도움이 되고 싶어요.</p>
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
	
		
		
    </div>
</body>
</html>
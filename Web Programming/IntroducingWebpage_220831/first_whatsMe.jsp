<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>박진석 소개 - 인적사항</title>
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
        	<video src="./img/rickroll.mp4" width="100%" controls poster="./img/mindMap.jpg"></video>
        </div>
        <h3>당신이 몰랐었던 박진석의 10가지 사실들</h3>
        <p>조회수 5,196회 3시간 전</p>
        <hr>
        <h4>인적사항</h4>
        <p>10가지 팩트 같은건 아무도 궁금해 하지 않을 걸 알기 때문에 간략하게 시대순으로 인생사를 알랴드릴게요.</p>
        <ul>
        	<li>1998년생 24살 입니다. 그런데 이제 빠른년생을 곁들인.</li>
        	<li>울산 출생이고, 영진 오기 전까지 쭉~ 울산에서 살다가 온 토박이에요.</li>
        	<li>고등학교 졸업과 동시에 2년간 전기공사 업체에서 일을 하다가 왔어요.</li>
        	<ul>
        		<li>참고로 얼굴 오른쪽에 생긴 흉터는 여기서 근무하다가 다친 상처입니다. 오해노노!</li>
        	</ul>
        	<li>해군을 나왔어요. 문무머앟함을 타다가 왔습니다.</li>
        	<li>그리고 LG 추노텍에서 알바 잠시 하다가 바로 영진전문대에 입학하게 됬죠.</li>
        	<li><b>비록 타 전공에서 일만 하다가 와서 개발 실력이 부족할 지 몰라도 아무쪼록 잘 부탁드려요!</b></li>
        </ul>
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
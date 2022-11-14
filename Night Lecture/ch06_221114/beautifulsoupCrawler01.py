from bs4 import BeautifulSoup

html = '<h1 id="title">한빛출판네트워크</h1><div class="top"><ul class="menu"><li><a href=http://www.hanbit.co.kr/member/login.html class="login">로그인 </a></li></ul><ul class="brand"><li><a href="http://www.hanbit.co.kr/media/">한빛미디어<li><a href="http://www.hanbit.co.kr/academy/">한빛아카데미</a></li></ul></div>'
soup=BeautifulSoup(html,'html.parser')
print(soup.prettify())
print("------------------")
print(soup.h1)

tag_h1 = soup.h1
print(tag_h1)

tag_div = soup.div
print(tag_div)

tag_ul = soup.ul
print(tag_ul)

tag_li = soup.li
print(tag_li)

tag_a = soup.a
print(tag_a)
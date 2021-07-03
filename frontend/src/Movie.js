import logo from './logo.svg';
import './App.css';

const Movie = () => {
  return (<>
<div class="body_container">

<header>
  <div class="wrap">
    <ul class="main-menu">
      <li class="roomlist"><a href="roomlist.html">테스트 !!</a></li>
      <li class="community"><a href="community.html">커뮤니티</a></li>
    </ul>
  </div>
  <ul class="sub-menu">
    <li class="reserve">예약<a href="reserve.html"></a></li>
    <li class="login">로그인<a href=""></a></li>
  </ul>
</header>

<section class="main_container clear">
  <article class="main_section">
   
    <div class="abc">
      <h1>
        <span class="article_title">메인페이지</span>
      </h1>
      <p id="dynamic" class="lg-text">
        
      </p>
      <p class="sm-text">sub</p>
    </div>
    <script src="js/index.js">
    </script>

    </article>
  
  <article class="placeRoomlist">
    <h1>룸리스트 공간</h1>
  </article>

</section>

<footer>
  
  <div class="wrap">풋터</div>

  </footer>

</div> 
     </>
  );
 
}

export default Movie;

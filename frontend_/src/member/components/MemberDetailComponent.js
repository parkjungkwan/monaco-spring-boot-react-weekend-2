import React,{useEffect, useState} from 'react'
import 'member/styles/MemberDetail.css'

const MemberDetailComponent = () => {
    const [member, setMember] = useState({})

    useEffect(() => {
      setMember(JSON.parse(localStorage.getItem("selectedMember")))
    }, {})

    return (<>
              <div className="member-detail-card">
                <h2 style={{"text-align":"center"}}>회원 정보</h2>
                <img src="https://www.w3schools.com/w3images/team2.jpg"  style={{"width":"100%"}}/>
                <h1>{member.name}</h1>
                    <p className="member-detail-title">CEO & Founder, Example</p>
                    <p>Harvard University</p>
                    <div style={{"margin": "24px 0"}}>
                      <a className="member-detail-a" href="#"><i className="fa fa-dribbble"></i></a> 
                      <a className="member-detail-a" href="#"><i className="fa fa-twitter"></i></a>  
                      <a className="member-detail-a" href="#"><i className="fa fa-linkedin"></i></a>  
                      <a className="member-detail-a" href="#"><i className="fa fa-facebook"></i></a> 
                    </div>
                    <p><button className="member-detail-button">Contact</button></p>
                </div>
      </>)
}

export default MemberDetailComponent
import React,{useState} from 'react'
import 'member/styles/MemberDetail.css'
import { useHistory } from 'react-router'
import { memberModify } from 'api'

const MemberModifyForm = () => {
      const [changedPassword, setChangedPassword] = useState('')
      const history = useHistory()

      const handleSubmit = e => {
        e.preventDefault()
        const member = JSON.parse(localStorage.getItem("loginedMember"))
        alert(changedPassword)
        member.password = changedPassword
        alert(JSON.stringify(member))
        
        memberModify({member})
        .then(res => {
          alert(`비밀번호 수정 완료 : ${res.data.result} `)
          localStorage.setItem("loginedMember", JSON.stringify(member))
          history.push('/member-list')
          
        })
        .catch(err => {
          alert(`비밀번호 수정 실패 : ${err} `)
    
        })
      }
  

    return (<>
    <form method="put" onSubmit={handleSubmit} >
            
                <h2 style={{"text-align":"center"}}>비밀번호 수정</h2>
        <div className="container">
          <label labelFor="psw"><b>변경할 비밀번호</b></label>
          <input type="password" placeholder="Enter Password" onChange={e => {setChangedPassword(e.target.value)}} name="password" required/>
              
          <button type="submit">확 인</button>
         
        </div>

      </form>

       
      </>)
}

export default MemberModifyForm
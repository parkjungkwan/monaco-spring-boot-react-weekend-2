import React,{useState} from 'react'
import '../styles/MemberLogin.css'
import { memberLogin } from 'api'
import { useHistory } from 'react-router'

const MemberLoginForm = () => {
    const history = useHistory()
    const [loginRequest, setLoginRequest] = useState({
      username: '',
      password: ''
    })

    const {username, password} = `loginRequest`

    
  const handleSubmit = e => {
    e.preventDefault()
    memberLogin({...loginRequest})
    .then(res => {
      if(res.data.result === 'PASSWORD-FAIL'){
        alert(`비밀번호가 틀립니다.`)
        document.getElementById("username").value = ""
        document.getElementById("password").value = ""

      }else if(res.data.result === 'USERNAME-FAIL'){
        alert(`아이디가 틀립니다.`)
        document.getElementById("username").value = ""
        document.getElementById("password").value = ""
      }else{
        alert(`로그인 성공 `)
        localStorage.setItem("loginedMember", JSON.stringify(res.data))
        history.push('/member-list')

      }
      
      
    
    })
    .catch(err => {
      alert(`로그인 실패 : ${err} `)

    })
  }


  const handleChange = e => {
    const { name, value } = e.target
    setLoginRequest({
      ...loginRequest,
      [name]: value
    })

  }


    return (<>
      <h2>Login Form</h2>

      <form onSubmit={handleSubmit} method="post" >
          <div className="imgcontainer">
            <img src="https://www.w3schools.com/howto/img_avatar2.png" style={{width: "300px"}} alt="Avatar" className="avatar"/>
          </div>

        <div className="container">
          <label labelFor="username"><b>Username</b></label>
          <input type="text" placeholder="Enter Username" onChange={handleChange} id="username" name="username" value={username} required/>

          <label labelFor="password"><b>Password</b></label>
          <input type="password" placeholder="Enter Password" onChange={handleChange} id="password" name="password" value={password} required/>
              
          <button type="submit">Login</button>
          <label>
            <input type="checkbox" checked="checked" name="remember"/> Remember me
          </label>
        </div>

        <div className="container" style={{backgroundColor: "#f1f1f1"}}>
          <button type="button" className="cancelbtn">Cancel</button>
          <span className="password">Forgot <a href="#">password?</a></span>
        </div>
      </form>
   
    </>)
}

export default MemberLoginForm
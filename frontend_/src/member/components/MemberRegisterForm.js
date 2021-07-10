import React,{useState} from 'react'
import '../styles/MemberRegister.css'
import { memberRegister } from 'api'
import { useHistory } from 'react-router'

const MemberRegisterForm = () => {
  const history = useHistory()
  const [memberInfo, setMemberInfo] = useState({
    username: '',
    password: '',
    name: '',
    email: ''
  })

  const {username, password, name, email} = `memberInfo`


  const handleSubmit = e => {
    e.preventDefault()
    alert(`전송 클릭: ${JSON.stringify({...memberInfo})}`)
    memberRegister({...memberInfo})
    .then(res => {
      alert(`회원가입 완료 : ${res.data.result} `)
      history.push('/member-login')
      
    })
    .catch(err => {
      alert(`회원가입 실패 : ${err} `)

    })



  }

  const handleClick = e => {
    e.preventDefault()
    alert('취소 클릭')
  }

  const handleChange = e => {
    const { name, value } = e.target
    setMemberInfo({
      ...memberInfo,
      [name]: value
    })

  }


    return (<>
    <div className="Signup">
    <form onSubmit={handleSubmit} method="post" style={{border:"1px solid #ccc"}}>
      <div className="container">
        <h1>Sign Up</h1>
        <p>Please fill in this form to create an account.</p>
        <hr/>

        <label for="username"><b>User ID</b></label>
        <input type="text" placeholder="Enter ID" onChange={handleChange}   name="username" value={username}/>

        <label for="password"><b>Password</b></label>
        <input type="password" placeholder="Enter Password" onChange={handleChange}  name="password" value={password}/>

        <label for="name"><b>Name</b></label>
        <input type="text" placeholder="Enter Your Name" onChange={handleChange}  name="name" value={name}/>

        <label for="email"><b>Email</b></label>
        <input type="text" placeholder="Enter Email" onChange={handleChange}  name="email" value={email} />

        <p>By creating an account you agree to our <a href="#" style={{color:"dodgerblue"}}>Terms & Privacy</a>.</p>

        <div class="clearfix">
          <button type="submit" className="signupbtn">Sign Up</button>
          <button type="button" className="cancelbtn" onClick={handleClick}>Cancel</button>
          
        </div>
      </div>
  </form>
</div>
</>)
}

export default MemberRegisterForm
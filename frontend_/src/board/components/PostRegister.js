import React,{useState} from 'react'
import '../styles/PostRegister.css'
import { Button } from '@material-ui/core';

const PostWirte = () => {

    const [post, setPost] = useState({
        title: '',
        content: ''
    })

    const {title, content} = post

    const handleClick = e => {
        e.preventDefault()
    }
    const handleSubmit = e => {
        e.preventDefault()
        
    }
    const handleChange = e => {
        const {name, value} = e.target
        setPost({
            ...post,
            [name] : value
        })
    }

    return (<>
    <div className="Signup">
    <form onSubmit={handleSubmit} method="post" style={{border:"1px solid #ccc"}}>
      <div className="container">
        <h1>게시글 쓰기</h1>
        <p>Please fill in this form to create an account.</p>
        <hr/>
        <label for="title"><b>title</b></label>
        <input type="text" placeholder="Enter title" onChange={handleChange}   name="title" value={title}/>
        <label for="content"><b>content</b></label>
        <input type="text" placeholder="Enter content" onChange={handleChange}  name="content" value={content} />
        <div class="clearfix">
          <button type="submit" className="signupbtn">Sign Up</button>
          <button type="button" className="cancelbtn" onClick={handleClick}>Cancel</button>
          
        </div>
      </div>
  </form>
</div>
</>)
}

export default PostWirte
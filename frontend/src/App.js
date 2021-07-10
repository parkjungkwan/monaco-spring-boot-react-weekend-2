import React from 'react'
import { Redirect, Route } from "react-router-dom"
import { MemberDelete, MemberDetail, MemberList, MemberLogin, MemberModify, MemberRegister } from 'member'
import { Home, Member} from 'templates'
import { BrowserRouter as Router } from 'react-router-dom'

const App = () => {
  return (<div>
    <Router>
   
        <Route exact path='/home' component={Home}/>
        <Route exact path='/member-logout' component={Home}/>
        <Redirect exact from={'/'} to={'/home'}/>
        <Route exact path='/member' component={Member}/>
        
        <Route exact path='/member-login' component={MemberLogin}/>        
       
        
    </Router>
  </div>)
}

export default App
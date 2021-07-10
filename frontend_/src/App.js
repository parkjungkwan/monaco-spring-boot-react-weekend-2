import React from 'react'
import { Redirect, Route } from "react-router-dom"
import { MemberDelete, MemberDetail, MemberList, MemberLogin, MemberModify, MemberRegister } from 'member'
import { PostDetail, PostList, PostModify, PostRegister } from 'board'
import { ItemDetail, ItemList, ItemModify, ItemRegister } from 'item'
import { Home, Member, Item, Board, Stock} from 'templates'
import { BrowserRouter as Router } from 'react-router-dom'

const App = () => {
  return (<div>
    <Router>
   
        <Route exact path='/home' component={Home}/>
        <Route exact path='/member-logout' component={Home}/>
        <Redirect exact from={'/'} to={'/home'}/>
        <Route exact path='/member' component={Member}/>
        <Route exact path='/member-delete' component={MemberDelete}/>
        <Route exact path='/member-detail/:id' component={MemberDetail}/>
        <Route exact path='/member-list' component={MemberList}/>
        <Route exact path='/member-login' component={MemberLogin}/>        
        <Route exact path='/member-modify' component={MemberModify}/>
        <Route exact path='/member-register' component={MemberRegister}/>
        <Route exact path='/item' component={Item}/>
        <Route exact path='/item-detail' component={ItemDetail}/>
        <Route exact path='/item-list' component={ItemList}/>
        <Route exact path='/item-modify' component={ItemModify}/>
        <Route exact path='/item-register' component={ItemRegister}/>
        <Route exact path='/board' component={Board}/>
        <Route exact path='/post-detail' component={PostDetail}/>
        <Route exact path='/post-list' component={PostList}/>
        <Route exact path='/post-modify' component={PostModify}/>
        <Route exact path='/post-register' component={PostRegister}/>
        <Route exact path='/stock' component={Stock}/>
    </Router>
  </div>)
}

export default App
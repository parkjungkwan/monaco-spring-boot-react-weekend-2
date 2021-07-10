import React,{useState} from 'react'
import '../styles/MemberLogin.css'
import { MemberDetailComponent } from 'member'
import { MemberMenu as Menu } from 'common'
import { MemberNav as Nav } from 'member'
const MemberDetail = () => {
    return (<>
    <Nav/>
      <table style={{width: '100%', height: '100%'}}>
          <tr>
              <td style={{width: '20%'}}> <Menu/> </td>
              <td style={{width: '80%'}}> <MemberDetailComponent/> </td>
          </tr>
      </table>
    </>)
}

export default MemberDetail
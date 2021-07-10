import React,{useState} from 'react'
import '../styles/MemberLogin.css'
import { MemberModifyForm } from 'member'
import { MemberMenu as Menu } from 'common'
import { MemberNav as Nav } from 'member'
const MemberModify = () => {
    return (<>
    <Nav/>
      <table style={{width: '100%', height: '100%'}}>
          <tr>
              <td style={{width: '20%'}}> <Menu/> </td>
              <td style={{width: '80%'}}> <MemberModifyForm/> </td>
          </tr>
      </table>
    </>)
}

export default MemberModify
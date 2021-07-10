import React, {useEffect, useState} from 'react'
import axios from 'axios';
import { Button } from '@material-ui/core';
import {MemberMenu as Menu} from '../common'
import { Nav } from 'common'

const Home = ({children}) => { 

    const [connection, setConnection] = useState(false)
    const handleClick = e => {
        e.preventDefault()
        axios({
            method: "get",
            url: "http://127.0.0.1:8000/connection",
            responseType: "json"
        }).then(function (res) {
            setConnection(res.data.connection === 'SUCCESS')
        });
    }
    return (<>
    <Nav/>
        <table style={{width: '100%', height: '100%'}}>
        <tr><td colSpan={2} ><h2 style={{textAlign: 'center'}}>Home</h2></td></tr>
        <tr>
            <td style={{width: '20%'}}><Menu/></td>
            <td style={{width: '80%'}}>
            <Button color="primary" onClick={handleClick}>1. 서버 연결 테스트</Button>
                { connection ?
        '연결상태 입니다.'
         : 
        '연결상태가 아닙니다.' 
         }</td>
        </tr>
        
    </table>
    {children}

</>)}

export default Home





import React, {useEffect, useState} from 'react'
import axios from 'axios';
import { Button } from '@material-ui/core';
import { Nav } from 'common'

const Home = ({children}) => { 

   
    return (<>
    <Nav/>
        <table style={{width: '100%', height: '100%'}}>
        <tr><td colSpan={2} ><h2 style={{textAlign: 'center'}}>Home</h2></td></tr>
        
        
    </table>
    {children}

</>)}

export default Home
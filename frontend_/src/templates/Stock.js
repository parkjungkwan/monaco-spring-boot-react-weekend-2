import React from 'react'
import { StockMenu as Menu } from '../common'
import './styles/table.style.css'

const Stock = ({children}) => (<>
    <h1>Stock</h1>
    <Menu/>
    {children}
</>)

export default Stock
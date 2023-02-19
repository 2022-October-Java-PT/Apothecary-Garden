import { NavLink } from 'react-router-dom';
import React from 'react';
import style from './style.module.scss';

const Header = () => (
    <div className={style.header}>
        <h1>Apothecary's Garden</h1>
        <ul className={style.navList}>
        
        
            <NavLink to='/'>Home</NavLink>
            
            <NavLink to='/contact'>Contact</NavLink>
            <NavLink to='/illness_search'>Ailment</NavLink>
            <NavLink to='/storeHerbs'>Store Herbs</NavLink>
            <NavLink to='/searchHerbs'>Search Herbs</NavLink>
        </ul>
        
    </div>
);

export default Header;
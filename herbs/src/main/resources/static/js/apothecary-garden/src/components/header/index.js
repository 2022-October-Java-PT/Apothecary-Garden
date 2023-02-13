import { NavLink } from 'react-router-dom';
import React from 'react';
import style from './style.module.scss';

const Header = () => (
    <div className={style.header}>
        <h1>ApothyCary's Garden</h1>
        <ul className={style.navList}>
            <NavLink to='/'>Home</NavLink>
            <NavLink to='/contact'>Contact</NavLink>
            <NavLink to='/illness_search'>illness</NavLink>
            <NavLink to='/storeHerbs'>Store Herbs</NavLink>
        </ul>
    </div>
);

export default Header;
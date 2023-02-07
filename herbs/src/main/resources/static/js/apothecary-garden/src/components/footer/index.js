import React from 'react';
import style from './style.module.scss';

const Footer = () => (
    <div className={style.footer}>
        <h3>&copy; Apothycary's Garden 2023</h3>
        <ul className={style.socialList}>
            <li>
                <a href='https://github.com/2022-October-Java-PT/Apothecary-Garden' target='_blank' rel='noopener noreferrer'>Github</a>
            </li>
        </ul>
    </div>
);

export default Footer;

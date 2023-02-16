import { Route, Routes } from 'react-router-dom';
import HomePage from '../../pages/home'
import IllnessSearch from '../../pages/illness_search';
import React from 'react';
import StoreHerbsPages from '../../pages/storeHerbs';
import ContactPage from '../../pages/contact';

const PageSwitch = () => (
    <Routes>
        <Route index element={<HomePage />} />
        <Route exact path='/' element={<HomePage />} />
        <Route exact path='/contact' element={<ContactPage />} />
        <Route exact path='/illness_search' element={<IllnessSearch />} />
        <Route exact path='/storeHerbs' element={<StoreHerbsPages />} />
    </Routes>
);

export default PageSwitch;
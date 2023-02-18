import { Route, Routes } from 'react-router-dom';

import HerbPage from '../../pages/herb'
import Herbs from '../../pages/herbs';
import HerbsList from '../../pages/herbs_search';
import HomePage from '../../pages/home'
import IllnessSearch from '../../pages/illness_search';
import MyApothecaryPage from '../../pages/myApothecary';
import React from 'react';
import StoreHerbsPages from '../../pages/storeHerbs';
import ContactPage from '../../pages/contact';

const PageSwitch = () => (
    <Routes>
        <Route index element={<HomePage />} />
        <Route exact path='/' element={<HomePage />} />
        <Route exact path='/contact' element={<ContactPage />} />
        <Route exact path='/herbs/:name' element={<HerbPage />} />
        <Route exact path='/illness_search' element={<IllnessSearch />} />
        <Route exact path='/storeHerbs' element={<StoreHerbsPages />} />
        <Route exact path='/searchHerbs' element={<HerbsList />} />
        <Route exact path='/myApothecary' element={<MyApothecaryPage />} />
        {/* Comment out the following. Herbs page for demo purposes only */}
        <Route exact path='/herbs' element={<Herbs />} />
    </Routes>
);

export default PageSwitch;
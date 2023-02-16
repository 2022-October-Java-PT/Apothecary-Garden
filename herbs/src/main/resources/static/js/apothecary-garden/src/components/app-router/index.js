import { Route, Routes } from 'react-router-dom';

import HerbPage from '../../pages/herb'
import HomePage from '../../pages/home'
import IllnessSearch from '../../pages/illness_search';
import React from 'react';
import StoreHerbsPages from '../../pages/storeHerbs';
import HerbsList from '../../pages/herbs_search';

const PageSwitch = () => (
    <Routes>
        <Route index element={<HomePage />} />
        <Route exact path='/' element={<HomePage />} />
        <Route exact path='/herbs/:name' element={<HerbPage />} />
        <Route exact path='/illness_search' element={<IllnessSearch />} />
        <Route exact path='/storeHerbs' element={<StoreHerbsPages />} />
        <Route exact path='/searchHerbs' element={<HerbsList />} />

    </Routes>
);

export default PageSwitch;
import React from 'react';
import { Route, Routes } from 'react-router-dom';

import HomePage from '../../pages/home'
import IllnessSearch from '../../pages/illness_search';

const PageSwitch = () => (
    <Routes>
        <Route index element={<HomePage />} />
        <Route exact path='/home' element={<HomePage />} />
        <Route exact path='/illness_search' element={<IllnessSearch />} />
    </Routes>
);

export default PageSwitch;
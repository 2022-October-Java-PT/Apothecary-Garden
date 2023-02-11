import { Route, Routes } from 'react-router-dom';

import HomePage from '../../pages/home'
import IllnessSearch from '../../pages/illness_search';
import React from 'react';

const PageSwitch = () => (
    <Routes>
        <Route index element={<HomePage />} />
        <Route exact path='/' element={<HomePage />} />
        <Route exact path='/illness_search' element={<IllnessSearch />} />
    </Routes>
);

export default PageSwitch;
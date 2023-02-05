import React from 'react';
import { Route, Routes } from 'react-router-dom';

import HomePage from '../../pages/home'

const PageSwitch = () => (
    <Routes>
        <Route index element={<HomePage />} />
        <Route exact path='/home' element={<HomePage />} />
    </Routes>
);

export default PageSwitch;
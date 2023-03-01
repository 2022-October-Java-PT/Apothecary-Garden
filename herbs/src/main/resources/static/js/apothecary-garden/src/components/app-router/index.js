import { Route, Routes } from 'react-router-dom';

import ContactPage from '../../pages/contact';
import FavoritesList from '../../pages/favorites_list/FavoritesList';
import HerbPage from '../../pages/herb'
import Herbs from '../../pages/herbs';
import HerbsList from '../../pages/herbs_search';
import HomePage from '../../pages/home'
import IllnessList from '../../pages/illness_search/illness_searchbar';
import IllnessSearch from '../../pages/illness_search';
import Login from '../../pages/login';
import MyApothecaryPage from '../../pages/myApothecary';
import PortalHome from '../../portal/portal-pages/portal-home';
import React from 'react';
import Signup from '../../pages/signup';
import StoreHerbsPages from '../../pages/storeHerbs';

const PageSwitch = () => (
    <Routes>
        <Route index element={<HomePage />} />
        <Route exact path='/' element={<HomePage />} />
        <Route exact path='/contact' element={<ContactPage />} />
        <Route exact path='/herbs/:name' element={<HerbPage />} />
        <Route exact path='/old_illness_search' element={<IllnessSearch />} />
        <Route exact path='/storeHerbs' element={<StoreHerbsPages />} />
        <Route exact path='/searchHerbs' element={<HerbsList />} />
        <Route exact path='/myApothecary' element={<MyApothecaryPage />} />
        <Route exact path='/herbs' element={<Herbs />} />
        <Route exact path='/illness_search' element={<IllnessList />} />
        <Route exact path='/login' element={<Login />} />
        <Route exact path='/signup' element={<Signup />} />
        <Route exact path='/favorites' element={<FavoritesList />} />
        <Route exact path='/portal' element={<PortalHome />} />
    </Routes>
);

export default PageSwitch;
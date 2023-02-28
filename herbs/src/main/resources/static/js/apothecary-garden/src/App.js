import { BrowserRouter } from 'react-router-dom';
import Footer from './components/footer';
import NavBar from './components/navBar/NavBar'
import PageSwitch from './components/app-router';
import React from 'react';
import style from './style.module.scss';

const App = () => {

  return (
    <BrowserRouter>
    <NavBar />
      <div className={style.page}>
        <PageSwitch />
      </div>
      <Footer className={style.footer} />
    </BrowserRouter>
    
  );
}

export default App;
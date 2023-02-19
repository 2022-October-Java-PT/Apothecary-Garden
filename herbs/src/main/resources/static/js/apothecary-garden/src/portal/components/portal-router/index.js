import { Route, Routes } from 'react-router-dom';
import PortHome from '../../portal-pages/portal-home'
import style from './style.module.scss';

const PortRouter = () => {
    return (
        <div className={style.portRoute}>
        <Routes>
            <Route exact path='/portal' element={<PortHome />} />
        </Routes>
        </div>
    );
}

export default PortRouter;
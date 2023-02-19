import React from "react";
import { BrowserRouter } from 'react-router-dom';
import PortRouter from "./components/portal-router";
// import PortHeader from "../Portal/Port-Components/Port-Header";
// import PortRouter from "./Port-Components/Port-Router";

const Portal = () => {
    return (
        <div>
            <BrowserRouter>
                <PortRouter />
            {/* <PortHeader />
            <PortRouter /> */}
            </BrowserRouter>
        </div>
    );
}

export default Portal;
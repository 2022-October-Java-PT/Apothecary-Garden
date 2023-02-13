import 'reactjs-popup/dist/index.css';

import Disclaimer from "./disclaimer";
import React from "react";
import style from "./style.module.scss";

const HomePage = () => {
    const [open, setOpen] = React.useState(true)
    return(
        <div className={style.homeContent}>
            <h1>This is the Home Page</h1>
            <button className={style.disclaimer_button} onClick={() => setOpen(true)}>Disclaimer</button>
            <Disclaimer setOpen={setOpen} open={open} />
        </div>
    )
    // return (
    //     <div className={style.home}>
    //     <h1>This is the Home Page</h1>
    //         <Popup trigger= position="right center">
    //             <Disclaimer />
    //         </Popup>
    //     </div>
    // ); 
}

export default HomePage;
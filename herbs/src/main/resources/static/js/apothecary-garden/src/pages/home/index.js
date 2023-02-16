import 'reactjs-popup/dist/index.css';

import Disclaimer from "./disclaimer";
import React from "react";
import style from "./style.module.scss";

const HomePage = () => {
    const [open, setOpen] = React.useState(true)
    return(
        <div className={style.homeContent}>
        
            <center>
            <h1>Herbal Medicine History</h1></center>

            <center>
            <h2>
            Archaeological evidence indicates that the use of medicinal plants dates back to the Paleolithic age, approximately 60,000 years ago. Written evidence of herbal remedies dates back over 5,000 years to the Sumerians, who compiled lists of plants.
            </h2>
            </center>

            <center>
                <h1>
                    Search for illnesses here:
                </h1>
            </center>

            
            
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
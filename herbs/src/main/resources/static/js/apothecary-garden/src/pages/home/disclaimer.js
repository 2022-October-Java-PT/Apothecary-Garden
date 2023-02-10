import React from 'react';
import Popup from "reactjs-popup";
import style from './style.module.scss'

export default class Disclaimer extends React.Component {
    render() {
      return(
        <Popup open={this.props.open} modal>
          {() => ( 
            <div className={style.disclaimer_popup}>
                <div className={style.disclaimer_content}>
                    <h1 className={style.disclaimer_header}>DISCLAIMER</h1>
                    <p className={style.disclaimer_body}>This Web site — Information About Herbs, Botanicals and Other Products — is for general health information only. This Web site is not to be used as a substitute for medical advice, diagnosis or treatment of any health condition or problem. Users of this Web site should not rely on information provided on this Web site for their own health problems. Any questions regarding your own health should be addressed to your own physician or other healthcare provider.

                    Apothecary's Garden makes no warranties nor express or implied representations whatsoever regarding the accuracy, completeness, timeliness, comparative or controversial nature, or usefulness of any information contained or referenced on this Web site. Apothecary's Garden does not assume any risk whatsoever for your use of this website or the information contained herein. Health-related information changes frequently and therefore information contained on this Web site may be outdated, incomplete or incorrect. Statements made about products have not been evaluated by the Food and Drug Administration. Use of this Web site does not create an expressed or implied physician-patient relationship.

                    Apothecary's Garden does not record specific website user information and does not contact users of this website. You are hereby advised to consult with a physician or other professional health-care provider prior to making any decisions, or undertaking any actions or not undertaking any actions related to any health care problem or issue you might have at any time, now or in the future. In using this website you agree that neither Apothecary's Garden nor any other party is or will be liable or otherwise responsible for any decision made or any action taken or any action not taken due to your use of any information presented at this website.
                    </p>
                </div>
              <button className={style.closeButton} onClick={() => this.props.setOpen(false)}>
                close
              </button>
            </div>
          )}
        </Popup>
      )
    }
}


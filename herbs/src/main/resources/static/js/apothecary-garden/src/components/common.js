export const getUsername = () => {
    const usernameStr = sessionStorage.getItem("userName");
    if (usernameStr) return JSON.parse(usernameStr);
    else return null;
}

export const setUsernameSession = (username) => {
    sessionStorage.setItem("userName", JSON.stringify(username));
}

export const removeUsernameSession = () => {
    sessionStorage.removeItem("userName");
}
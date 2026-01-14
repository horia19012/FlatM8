export const login = async (username, password) => {
    const loginData = {username, password};

    try {
        const response = await fetch('http://localhost:8080/login',{
            method: 'POST',
            headers: { 'Content-Type': 'application/json' },
            body: JSON.stringify(loginData)
        });
        
        if(!response.ok){
            throw new Error('Login failed!');
        }
        const data = await response.json();
        return data;
    }catch(error){
        throw error
    }
};

export const register = async (username, password, name, email, phone ) => {
    const registerData = {username, password, name, email, phone};
    try{
        const response = await fetch('http://localhost:8080/register',{
            method : 'POST',
            headers : 'Content-Type, application/json',
            body : JSON.stringify(registerData)

        })

    }catch(error){
        throw error
    }
    
}
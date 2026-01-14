import { useState } from 'react';
import './Login.css'
import {login , register} from './services/authService';
import { useNavigate } from 'react-router-dom';

function Login() {
    const [username, setUsername] = useState('');
    const [password, setPassowrd] = useState('');
    const navigate = useNavigate();

    const loginData = { username,password };
    
    const handleSend = async (e) => {
        e.preventDefault();

        try {
            const data = await login(username, password);
            console.log('Login succes:', data);
            window.alert('Login succesful!');
            navigate("/apartments");

        }catch(error){
            console.error('Login error', error)
            window.alert('Login unsuccesful');
        }
    };


    return (
        <div className="Login">
            <form className="LoginForm" onSubmit={handleSend}>
                <h1>LOGIN</h1>
                <input
                    type="text"
                    placeholder="username"
                    value={username}
                    onChange={(e) => setUsername(e.target.value)} >
                </input>
                <input
                    type="password"
                    placeholder="password"
                    value={password}
                    onChange= {(e) => setPassowrd(e.target.value)}>
                </input>
                <button type='submit'>SEND</button>
            </form>
        </div>
    )
}

export default Login;
import { useRef, useState } from 'react'
import { useNavigate } from 'react-router-dom'
function LoginScores(props) {
  const width = useRef(window.innerWidth).current
  const height = useRef(window.innerHeight).current
  const navigate = useNavigate()
  const [username, setUsername] = useState('')
  const [password, setPassword] = useState('')
  const handleLogin = () => {
    if (username === '20066981' && password === '12345678') {
      navigate('/RegisterSource')
    } else {
      alert('Invalid username or password')
    }
  }
  return (
    <div
      style={{
        flex: 1,
        display: 'flex',
        height: height,
        justifyContent: 'center',
        alignItems: 'center',
        flexDirection: 'column',
        backgroundImage:
          'url(https://scontent.fsgn5-10.fna.fbcdn.net/v/t1.6435-9/98019594_939197706511808_4991934582837215232_n.jpg?_nc_cat=107&ccb=1-7&_nc_sid=5f2048&_nc_ohc=K2v3o19Iu0kQ7kNvgGjTunV&_nc_ht=scontent.fsgn5-10.fna&oh=00_AYBu0OpFCofFP7-u7tRmJ5J9qIT0RqMRb3rX1RYpqYeX4w&oe=6677A432)',
        backgroundSize: 'cover',
      }}
    >
      <span
        style={{
          color: '#000',
          fontSize: 25,
          fontWeight: 'bold',
          marginBottom: 20,
          backgroundColor: '#c7f2b5',
          padding: '4px 6px',
          borderRadius: 10,
        }}
      >
        Đăng nhập Đăng kí học phần
      </span>
      <div
        style={{
          height: height * 0.142,
          width: width * 0.228,
          backgroundColor: '#c7f2b5',
          borderRadius: 5,
          display: 'flex',
          justifyContent: 'space-around',
          alignItems: 'center',
          flexDirection: 'column',
          padding: 3,
        }}
      >
        <input
          type="text"
          placeholder={'Nhập mã sinh viên'}
          onChange={(e) => setUsername(e.target.value)}
          style={{
            marginTop: 10,
            backgroundColor: '#385b70',
            color: '#fff',
            border: '1px solid transparent',
            outline: 'none',
            padding: 8,
            width: width * 0.197,
            borderRadius: 5,
            textAlign: 'left',
            justifyContent: 'center',
            paddingLeft: 10,
          }}
        />
        <input
          type="password"
          onChange={(e) => setPassword(e.target.value)}
          placeholder={'Password'}
          color={'#fff'}
          style={{
            marginBottom: 10,
            backgroundColor: '#385b70',
            color: '#ffffff',
            border: '1px solid transparent',
            outline: 'none',
            padding: 8,
            width: width * 0.197,
            borderRadius: 5,
            textAlign: 'left',
            justifyContent: 'center',
            paddingLeft: 10,
          }}
        />
        <style jsx>{`
          input::placeholder {
            color: #ffffff;
          }
        `}</style>
      </div>
      <button
        style={{
          marginTop: 20,
          backgroundColor: '#385b70',
          color: '#ffffff',
          border: '1px solid transparent',
          outline: 'none',
          padding: 8,
          width: width * 0.197,
          borderRadius: 5,
          textAlign: 'center',
          justifyContent: 'center',
        }}
        onClick={handleLogin}
      >
        Đăng nhập
      </button>
    </div>
  )
}
export default LoginScores

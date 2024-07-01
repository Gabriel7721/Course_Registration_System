import { useRef, useState } from 'react'
import { useNavigate } from 'react-router-dom'

function LoginToLookSchedule(props) {
  const width = useRef(window.innerWidth).current
  const height = useRef(window.innerHeight).current
  const navigate = useNavigate()
  const [username, setUsername] = useState('')
  const [password, setPassword] = useState('')
  const handleLogin = () => {
    if (username === '20066981' && password === '12345678') {
      navigate('/InforStudent')
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
          'url(https://vnn-imgs-f.vgcloud.vn/2019/04/10/13/lam-mat-sach-diem-truong-dai-hoc-goi-sinh-vien-le-tu-khai-lai.jpg)',
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
        Đăng nhập vào trang sinh viên
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

export default LoginToLookSchedule

import axios from 'axios'
import { useEffect, useRef, useState } from 'react'
import { useNavigate } from 'react-router-dom'

const InforStudent = (props) => {
  const [student, setStudent] = useState({})

  const navigate = useNavigate()

  const fetchStudent = async () => {
    try {
      const response = await axios
        .get(`http://localhost:8092/api/v1/regist-courses/students/20066981`)
        .then((res) => {
          setStudent(res.data)
        })
    } catch (error) {
      console.log(error)
    }
  }

  useEffect(() => {
    fetchStudent()
  }, [])
  return (
    <div
      style={{
        flex: 1,
        display: 'flex',
        justifyContent: 'center',
        alignItems: 'center',
        flexDirection: 'column',
      }}
    >
      <div
        style={{
          display: 'flex',
          flexDirection: 'row',
          height: 200,
          width: '80%',
          backgroundColor: '#b9f0f7',
          borderRadius: 5,
          marginTop: 20,
        }}
      >
        <div
          style={{
            display: 'flex',
            flexDirection: 'column',
            height: 200,
            width: '30%',
            borderRadius: 5,
            paddingLeft: 10,
          }}
        >
          <h3>Thông tin sinh viên</h3>
          <img
            src="https://zpsocial-f57-org.zadn.vn/eb953a960233e36dba22.jpg"
            alt="User"
            style={{
              marginLeft: 30,
              width: 120,
              height: 120,
              borderRadius: '5%',
            }}
          />
        </div>

        <div
          style={{
            display: 'flex',
            flexDirection: 'column',
            height: 200,
            width: '30%',
            borderRadius: 5,
            paddingLeft: 10,
            justifyContent: 'space-evenly',
            alignItems: 'flex-start',
          }}
        >
          <sp>MSSV: {student.studentId}</sp>
          <sp>Họ tên: {student.name}</sp>
          <sp>Giới tính: Nam</sp>
          <sp>Ngày sinh: 30/11/2002</sp>
          <sp>Nơi sinh: {student.address}</sp>
        </div>
        <div
          style={{
            display: 'flex',
            flexDirection: 'column',
            height: 200,
            width: '30%',
            borderRadius: 5,
            paddingLeft: 10,
            justifyContent: 'space-evenly',
            alignItems: 'flex-start',
          }}
        >
          {student.majors != null ? (
            <sp>Ngành: {student.majors.name}</sp>
          ) : (
            <sp></sp>
          )}

          {student.majors != null ? (
            <sp>Khoa: {student.majors.faculty.name}</sp>
          ) : (
            <sp></sp>
          )}
          <sp>Niêm giám: {student.session}</sp>
          <sp>email: {student.email}</sp>
          <sp>phone: {student.phone}</sp>
        </div>
      </div>

      <div
        style={{
          display: 'flex',
          flexDirection: 'row',
          height: 100,
          width: '80%',
          borderRadius: 5,
          marginTop: 30,
          justifyContent: 'flex-start',
          alignItems: 'center',
        }}
      >
        <div
          style={{
            display: 'flex',
            flexDirection: 'row',
            height: 100,
            width: '20%',
            backgroundColor: '#b960f7',
            borderRadius: 5,
            justifyContent: 'center',
            alignItems: 'center',
            border: '1px solid black',
          }}
          onClick={() => navigate('/SchedulePage')}
        >
          --------------
          <br />
          Xem lịch học
          <br />
          --------------
        </div>
        <div
          style={{
            marginLeft: 10,
            display: 'flex',
            flexDirection: 'row',
            height: 100,
            width: '20%',
            backgroundColor: '#ff9696',
            borderRadius: 5,
            justifyContent: 'center',
            alignItems: 'center',
            border: '1px solid black',
          }}
          // onClick={() => navigate('/LoginToLookSchedule')}
        >
          --------------
          <br />
          Xem điểm
          <br />
          --------------
        </div>
      </div>
    </div>
  )
}

export default InforStudent

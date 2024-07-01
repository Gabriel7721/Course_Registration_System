import axios from 'axios'
import { useEffect, useRef, useState } from 'react'
import { useNavigate } from 'react-router-dom'

const RegisterSource = (props) => {
  const [student, setStudent] = useState({
    name: '',
    sex: 'Nam',
    studentId: '',
  })
  const navigate = useNavigate()

  const [courses, setCourses] = useState([])
  const getAllSubjects = async () => {
    try {
      const response = await axios
        .get(`http://localhost:8092/api/v1/regist-courses/subjects/20066981`)
        .then((res) => {
          setCourses(res.data)
        })
    } catch (error) {
      console.log(error)
    }
  }
  const getStudent = async () => {
    try {
      const response = await axios
        .get(`http://localhost:8092/api/v1/regist-courses/students/20066981`)
        .then((res) => {
          setStudent({
            name: res.data.name,
            studentId: res.data.studentId,
            sex: 'Nam',
          })
        })
    } catch (error) {
      console.log(error)
    }
  }

  const getAllSessionClass = async ({ idSubject }) => {
    try {
      const response = await axios
        .get(
          `http://localhost:8092/api/v1/regist-courses/section-classes/get-all-by-subject-id/${idSubject}`
        )
        .then((res) => {
          setSesionClass(res.data)
        })
    } catch (error) {
      console.log(error)
    }
  }

  const getListRegisted = async () => {
    try {
      const response = await axios
        .get(
          `http://localhost:8092/api/v1/regist-courses/registions/students/20066981`
        )
        .then((res) => {
          setListSubjectRegister(res.data)
        })
    } catch (error) {
      console.log(error)
    }
  }
  useEffect(() => {
    getListRegisted()
    getStudent()
    getAllSubjects()
  }, [])

  const [sesionClass, setSesionClass] = useState([])

  const [subjectRegister, setSubjectRegister] = useState('')

  const [openDialog, setOpenDialog] = useState(false)
  const [openDialog2, setOpenDialog2] = useState(false)

  const handleCloseDialog = () => {
    setOpenDialog(false)
  }

  const [idClassRegistration, setIdClassRegistration] = useState('')
  const [idDeleteSubject, setIdDeleteSubject] = useState('')
  const [listSubjectRegister, setListSubjectRegister] = useState([])

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
          alignItems: 'center',
          backgroundColor: '#e0f7fa',
          padding: 20,
          borderRadius: 8,
          width: '80%',
          margin: '20px 0',
        }}
      >
        <div
          style={{
            backgroundColor: '#29b6f6',
            padding: '20px 40px',
            borderRadius: 8,
            color: 'white',
            display: 'flex',
            flexDirection: 'column',
            alignItems: 'flex-start',
          }}
        >
          <span style={{ marginTop: 10 }}>{student.name}</span>
          <span>Giới tính: {student.sex}</span>
          <span>MSSV: {student.studentId}</span>
          <span>Trạng thái: Đang học</span>
          <button
            style={{
              backgroundColor: '#ff7043',
              color: 'white',
              border: 'none',
              borderRadius: 4,
              padding: '8px 16px',
              marginTop: 20,
              cursor: 'pointer',
            }}
          >
            Đăng xuất
          </button>
        </div>
        <img
          src="https://zpsocial-f57-org.zadn.vn/eb953a960233e36dba22.jpg"
          alt="User"
          style={{
            marginLeft: 30,

            width: 100,
            height: 100,
            borderRadius: '5%',
          }}
        />

        <div style={{ marginLeft: 10, textAlign: 'left' }}>
          <p
            onClick={() => {
              navigate('/LoginToLookSchedule')
            }}
            style={{
              fontSize: '16px',
              color: '#07c6b6',
              textDecoration: 'underline',
            }}
          >
            THÔNG TIN SINH VIÊN
          </p>

          <p
            style={{
              fontSize: '16px',
              color: '#07c6b6',
              textDecoration: 'underline',
            }}
          >
            CHƯƠNG TRÌNH KHUNG
          </p>
        </div>
      </div>

      <span
        style={{
          color: 'black',
          fontSize: 20,
          fontWeight: 'bold',
          marginBottom: 20,
          marginTop: 50,
        }}
      >
        Đăng kí học phần
      </span>
      <div
        style={{
          display: 'flex',
          flexDirection: 'row',
          justifyContent: 'center',
          alignItems: 'center',
        }}
      >
        <div
          style={{
            height: 15,
            borderRadius: 6,
            display: 'flex',
            justifyContent: 'center',
            alignItems: 'center',
            margin: 20,
            padding: 15,
            backgroundColor: '#049660',
            color: 'white',
            boxShadow: '0px 4px 6px rgba(0, 0, 0, 0.1)',
          }}
        >
          <span>Học kì hiện tại: HK3 (2024-2025)</span>
        </div>

        <div
          style={{
            height: 15,
            borderRadius: 6,
            display: 'flex',
            justifyContent: 'center',
            alignItems: 'center',
            margin: 20,
            padding: 15,
            backgroundColor: '#50bfb6',
            color: 'white',
            boxShadow: '0px 4px 6px rgba(0, 0, 0, 0.1)',
          }}
        >
          <span>Tra cứu công nợ</span>
        </div>
      </div>

      <table
        border="1"
        style={{
          width: '80%',
          textAlign: 'center',
          borderCollapse: 'collapse',
        }}
      >
        <thead>
          <tr>
            <th
              style={{
                padding: 10,
                backgroundColor: '#20b56f',
                color: 'white',
                border: '1px solid #ddd',
              }}
            >
              STT
            </th>
            <th
              style={{
                padding: 10,
                backgroundColor: '#20b56f',
                color: 'white',
                border: '1px solid #ddd',
              }}
            >
              Mã học phần
            </th>
            <th
              style={{
                padding: 10,
                backgroundColor: '#20b56f',
                color: 'white',
                border: '1px solid #ddd',
              }}
            >
              Tên môn học
            </th>
            <th
              style={{
                padding: 10,
                backgroundColor: '#20b56f',
                color: 'white',
                border: '1px solid #ddd',
              }}
            >
              TC Lý thuyết
            </th>
            <th
              style={{
                padding: 10,
                backgroundColor: '#20b56f',
                color: 'white',
                border: '1px solid #ddd',
              }}
            >
              TC Thực hành
            </th>
            <th
              style={{
                padding: 10,
                backgroundColor: '#20b56f',
                color: 'white',
                border: '1px solid #ddd',
              }}
            >
              Học phần trước
            </th>
            <th
              style={{
                padding: 10,
                backgroundColor: '#20b56f',
                color: 'white',
                border: '1px solid #ddd',
              }}
            >
              Trạng thái
            </th>
          </tr>
        </thead>
        <tbody>
          {courses.map((course) => (
            <tr
              key={course.subjectId}
              onClick={() => {
                getAllSessionClass({ idSubject: course.subjectId })
                setSubjectRegister(course.name)
              }}
              style={{ cursor: 'pointer' }}
            >
              <td style={{ padding: 10, border: '1px solid #ddd' }}>
                {course.subjectId}
              </td>
              <td style={{ padding: 10, border: '1px solid #ddd' }}>
                MHP{course.subjectId}
              </td>
              <td style={{ padding: 10, border: '1px solid #ddd' }}>
                {course.name}
              </td>
              <td style={{ padding: 10, border: '1px solid #ddd' }}>
                {course.theoryCredit}
              </td>
              <td style={{ padding: 10, border: '1px solid #ddd' }}>
                {course.practiceCredit}
              </td>
              <td style={{ padding: 10, border: '1px solid #ddd' }}>
                {course.prerequisiteIds.map((id, index) => (
                  <span key={id}>
                    {id}
                    <span style={{ color: 'red' }}>(*)</span>
                    {index < course.prerequisiteIds.length - 1 && ', '}
                  </span>
                ))}
              </td>
              <td style={{ padding: 10, border: '1px solid #ddd' }}>
                Bắt buộc
              </td>
            </tr>
          ))}
        </tbody>
      </table>

      <span
        style={{
          marginTop: 20,
          marginBottom: 20,
          color: '#e28956',
          fontSize: 17,
          fontWeight: 'bold',
        }}
      >
        Lớp học phần chờ đăng ký
      </span>
      <table
        border="1"
        style={{
          width: '80%',
          textAlign: 'center',
          borderCollapse: 'collapse',
        }}
      >
        <thead>
          <tr>
            <th
              style={{
                padding: 10,
                backgroundColor: '#20b56f',
                color: 'white',
                border: '1px solid #ddd',
              }}
            >
              STT
            </th>

            <th
              style={{
                padding: 10,
                backgroundColor: '#20b56f',
                color: 'white',
                border: '1px solid #ddd',
              }}
            >
              Tên Lớp học phần
            </th>
            <th
              style={{
                padding: 10,
                backgroundColor: '#20b56f',
                color: 'white',
                border: '1px solid #ddd',
              }}
            >
              Ngày mở
            </th>
            <th
              style={{
                padding: 10,
                backgroundColor: '#20b56f',
                color: 'white',
                border: '1px solid #ddd',
              }}
            >
              Ngày đóng
            </th>
            <th
              style={{
                padding: 10,
                backgroundColor: '#20b56f',
                color: 'white',
                border: '1px solid #ddd',
              }}
            >
              Đã đăng ký
            </th>
            <th
              style={{
                padding: 10,
                backgroundColor: '#20b56f',
                color: 'white',
                border: '1px solid #ddd',
              }}
            >
              Lịch học
            </th>
            <th
              style={{
                padding: 10,
                backgroundColor: '#20b56f',
                color: 'white',
                border: '1px solid #ddd',
              }}
            >
              Trạng thái
            </th>
          </tr>
        </thead>
        <tbody>
          {sesionClass != [] ? (
            sesionClass.map((sesion) => (
              <tr
                key={sesion.sectionClassId}
                onClick={() => {
                  setIdClassRegistration(sesion.sectionClassId)
                  setOpenDialog(true)
                }}
                style={{ cursor: 'pointer' }}
              >
                <td style={{ padding: 10, border: '1px solid #ddd' }}>
                  {sesion.sectionClassId}
                </td>
                <td style={{ padding: 10, border: '1px solid #ddd' }}>
                  {sesion.name}
                </td>
                <td style={{ padding: 10, border: '1px solid #ddd' }}>
                  {sesion.startDate}
                </td>
                <td style={{ padding: 10, border: '1px solid #ddd' }}>
                  {sesion.endDate}
                </td>
                <td style={{ padding: 10, border: '1px solid #ddd' }}>
                  {sesion.studentNumber}/30
                </td>
                <td style={{ padding: 10, border: '1px solid #ddd' }}>
                  Lý thuyết: {sesion.theorySchedule} <br /> Thực hành:
                  {sesion.practiceSchedule}
                </td>
                <td
                  style={{
                    padding: 10,
                    border: '1px solid #ddd',
                    color: 'green',
                  }}
                >
                  Open
                </td>
              </tr>
            ))
          ) : (
            <div></div>
          )}
        </tbody>
      </table>

      <span
        style={{
          marginTop: 120,
          marginBottom: 20,
          color: 'black',
          fontSize: 17,
          fontWeight: 'bold',
        }}
      >
        Môn học đã đăng kí
      </span>
      <table
        border="1"
        style={{
          width: '80%',
          textAlign: 'center',
          borderCollapse: 'collapse',
          boxShadow: '0px 4px 8px rgba(0, 0, 0, 0.1)',
          marginBottom: 50,
        }}
      >
        <thead>
          <tr>
            <th
              style={{
                padding: '10px 20px',
                backgroundColor: '#33af92',
                color: 'white',
                boxShadow: '0px 4px 6px rgba(0, 0, 0, 0.1)',
              }}
            >
              ID
            </th>
            <th
              style={{
                padding: '10px 20px',
                backgroundColor: '#33af92',
                color: 'white',
                boxShadow: '0px 4px 6px rgba(0, 0, 0, 0.1)',
              }}
            >
              Tên môn học
            </th>
            <th
              style={{
                padding: '10px 20px',
                backgroundColor: '#33af92',
                color: 'white',
                boxShadow: '0px 4px 6px rgba(0, 0, 0, 0.1)',
              }}
            >
              Tên lớp
            </th>
            <th
              style={{
                padding: '10px 20px',
                backgroundColor: '#33af92',
                color: 'white',
                boxShadow: '0px 4px 6px rgba(0, 0, 0, 0.1)',
              }}
            >
              Đã đăng kí
            </th>
            <th
              style={{
                padding: '10px 20px',
                backgroundColor: '#33af92',
                color: 'white',
                boxShadow: '0px 4px 6px rgba(0, 0, 0, 0.1)',
              }}
            >
              Tín chỉ
            </th>
            <th
              style={{
                padding: '10px 20px',
                backgroundColor: '#33af92',
                color: 'white',
                boxShadow: '0px 4px 6px rgba(0, 0, 0, 0.1)',
              }}
            >
              Lịch học
            </th>
            <th
              style={{
                padding: '10px 20px',
                backgroundColor: '#33af92',
                color: 'white',
                boxShadow: '0px 4px 6px rgba(0, 0, 0, 0.1)',
              }}
            ></th>
          </tr>
        </thead>
        <tbody>
          {listSubjectRegister != [] &&
            listSubjectRegister.map((course) => (
              <tr key={course.registionId}>
                <td style={{ padding: 10, border: '1px solid #ddd' }}>
                  {course.registionId}
                </td>
                <td style={{ padding: 10, border: '1px solid #ddd' }}>
                  {course.sectionClass.subject.name}
                </td>
                <td style={{ padding: 10, border: '1px solid #ddd' }}>
                  {course.sectionClass.name}
                </td>
                <td style={{ padding: 10, border: '1px solid #ddd' }}>
                  {course.sectionClass.studentNumber}/30
                </td>
                <td style={{ padding: 10, border: '1px solid #ddd' }}>
                  Lý thuyết: {course.sectionClass.subject.theoryCredit} <br />
                  Thực hành: {course.sectionClass.subject.practiceCredit}
                </td>
                <td style={{ padding: 10, border: '1px solid #ddd' }}>
                  Lý thuyết: {course.sectionClass.theorySchedule} <br />
                  Thực hành: {course.sectionClass.practiceSchedule}
                </td>
                <td
                  style={{
                    padding: 10,
                    border: '1px solid #ddd',
                    cursor: 'pointer',
                    color: '#33af92',
                  }}
                  onClick={() => {
                    setOpenDialog2(true)
                    setIdDeleteSubject(course.registionId)
                  }}
                >
                  Hủy
                </td>
              </tr>
            ))}
        </tbody>
      </table>

      {openDialog == true && (
        <div
          style={{
            position: 'fixed',
            top: '50%',
            left: '50%',
            transform: 'translate(-50%, -50%)',
            backgroundColor: '#e0fff9',
            padding: 20,
            borderRadius: 10,
            boxShadow: '5px 5px 10px rgba(0, 0, 0, 0.5)',
            justifyContent: 'center',
            alignItems: 'center',
          }}
        >
          <p>Bạn muốn đăng kí môn học: {subjectRegister}?</p>
          <div
            style={{
              display: 'flex',
              justifyContent: 'space-evenly',
              alignItems: 'center',
              flexDirection: 'row',
            }}
          >
            <button
              onClick={async () => {
                try {
                  const response = await axios
                    .post(
                      `http://localhost:8092/api/v1/regist-courses/registions`,
                      {
                        studentId: '20066981',
                        sectionClassId: idClassRegistration,
                      }
                    )
                    .then((res) => {
                      alert(`Đăng kí thành công môn ${subjectRegister}`)
                      setOpenDialog(false)
                    })
                } catch (error) {
                  if (error.response.status === 400) {
                    alert(`Lỗi: Bạn phải đăng kí môn học tiên quyết`)
                  }
                  alert(`Lỗi ${error}`)
                  console.log(error)
                }
              }}
              style={{
                backgroundColor: '#33af92',
                color: 'white',
                borderRadius: 5,
                padding: '5px 10px',
              }}
            >
              Đăng kí
            </button>
            <button
              onClick={handleCloseDialog}
              style={{
                backgroundColor: 'white',
                color: 'black',
                borderRadius: 5,
                padding: '5px 10px',
              }}
            >
              Hủy
            </button>
          </div>
        </div>
      )}

      {openDialog2 == true && (
        <div
          style={{
            position: 'fixed',
            top: '50%',
            left: '50%',
            transform: 'translate(-50%, -50%)',
            backgroundColor: '#ff4949',
            padding: 20,
            borderRadius: 10,
            boxShadow: '5px 5px 10px rgba(0, 0, 0, 0.5)',
            justifyContent: 'center',
            alignItems: 'center',
          }}
        >
          <p>Bạn muốn hủy môn này ?</p>
          <div
            style={{
              display: 'flex',
              justifyContent: 'space-evenly',
              alignItems: 'center',
              flexDirection: 'row',
            }}
          >
            <button
              onClick={async () => {
                try {
                  const response = await axios
                    .delete(
                      `http://localhost:8092/api/v1/regist-courses/registions/${idDeleteSubject}`
                    )
                    .then((res) => {
                      alert(`Đăng Hủy đăng kí thành công`)
                      setOpenDialog2(false)
                    })
                } catch (error) {
                  alert(`Lỗi ${error}`)
                  console.log(error)
                }
              }}
              style={{
                backgroundColor: '#ff4949',
                color: 'white',
                borderRadius: 5,
                padding: '5px 10px',
              }}
            >
              Đăng kí
            </button>
            <button
              onClick={() => {
                setOpenDialog2(false)
              }}
              style={{
                backgroundColor: 'white',
                color: 'black',
                borderRadius: 5,
                padding: '5px 10px',
              }}
            >
              Hủy
            </button>
          </div>
        </div>
      )}
    </div>
  )
}

export default RegisterSource

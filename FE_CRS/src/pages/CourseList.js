import React from 'react'

const CourseList = ({ courses, registered }) => {
  return (
    <table>
      <thead>
        <tr>
          <th>STT</th>
          <th>Mã MH</th>
          <th>Mã HP</th>
          <th>Tên môn học</th>
          <th>TC</th>
          {registered ? (
            <>
              <th>Lớp học dự kiến</th>
              <th>Nhóm TH</th>
              <th>Phòng TH</th>
              <th>Học phí</th>
              <th>Ngày ĐK</th>
              <th>Trạng thái</th>
            </>
          ) : (
            <th>Bắt buộc</th>
          )}
        </tr>
      </thead>
      <tbody>
        {courses.map((course, index) => (
          <tr key={course.id}>
            <td>{index + 1}</td>
            <td>{course.code}</td>
            <td>{course.hpCode}</td>
            <td>{course.name}</td>
            <td>{course.credits}</td>
            {registered ? (
              <>
                <td>{course.classCode}</td>
                <td>{course.group}</td>
                <td>{course.room}</td>
                <td>{course.fee}</td>
                <td>{course.date}</td>
                <td>{course.status}</td>
              </>
            ) : (
              <td>{course.prerequisites}</td>
            )}
          </tr>
        ))}
      </tbody>
    </table>
  )
}

export default CourseList

import { useEffect, useRef, useState } from 'react'

const SchedulePage = (props) => {
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
          height: 30,
          width: '80%',
          backgroundColor: '#b9f0f7',
          borderRadius: 5,
          marginTop: 20,
          justifyContent: 'center',
          alignItems: 'center',
        }}
      >
        <h3>Lịch học theo tuần</h3>
      </div>
      <div
        style={{
          display: 'flex',
          flexDirection: 'column',
          height: 20,
          width: '80%',
          marginTop: 10,
          justifyContent: 'center',
          alignItems: 'flex-end',
        }}
      >
        <h5>Nguyễn Đức Chiến</h5>
        <sp>20066981</sp>
      </div>
    </div>
  )
}

export default SchedulePage

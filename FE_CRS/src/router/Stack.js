import { Route, Routes } from 'react-router-dom'

import {
  LoginScores,
  RegisterSource,
  LoginToLookSchedule,
  InforStudent,
  SchedulePage,
} from '../pages'

function Stack() {
  return (
    <Routes>
      <Route path="/" element={<LoginScores />} />
      <Route path="/LoginScores" element={<LoginScores />} />
      <Route path="/RegisterSource" element={<RegisterSource />} />
      <Route path="/LoginToLookSchedule" element={<LoginToLookSchedule />} />
      <Route path="/InforStudent" element={<InforStudent />} />
      <Route path="/SchedulePage" element={<SchedulePage />} />
    </Routes>
  )
}

export default Stack

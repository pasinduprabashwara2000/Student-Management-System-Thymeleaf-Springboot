import Sidebar from "./components/Sidebar";
import {Route, Routes} from "react-router-dom";
import ManageStudents from "./pages/ManageStudents";
import ManageLectures from "./pages/ManageLectures";
import ManageSubjects from "./pages/ManageSubjects";
import ManageClasses from "./pages/ManageClasses";
import ManageCourses from "./pages/ManageCourses";

function App() {
    return (
        <>
            <div className="container-fluid">
                <div className="row">
                    <div className="col-md-3 col-lg-2 p-0">
                        <Sidebar />
                    </div>

                    <div className="col-md-9 col-lg-10 p-3">
                        <Routes>
                            <Route path="/" element={<h2>Welcome to Main Menu</h2>} />
                            <Route path="/manageStudents" element={<ManageStudents />} />
                            <Route path="/manageLectures" element={<ManageLectures/>} />
                            <Route path={"/manageSubjects"} element={<ManageSubjects/>} />
                            <Route path={"/manageCourses"} element={<ManageCourses/>} />
                            <Route path={"/manageClasses"} element={<ManageClasses/>} />
                        </Routes>
                    </div>
                </div>
            </div>
            </>
    );
}

export default App;

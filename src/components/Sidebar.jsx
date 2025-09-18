import React from "react";
import { Link } from "react-router-dom";
import "./Sidebar.css";

const Sidebar = () => {
    return (
        <div className="sidebar">
            <Link to="/" className="main-title">
                Main Menu
            </Link>
            <div className="menu">
                <Link to="/ManageStudents" className="menu-btn">
                    Manage Students
                </Link>
                <Link to="/manageLectures" className="menu-btn">
                    Manage Lectures
                </Link>
                <Link to="/manageSubjects" className="menu-btn">
                    Manage Subjects
                </Link>
                <Link to="/manageCourses" className="menu-btn">
                    Manage Courses
                </Link>
                <Link to="/manageClasses" className="menu-btn">
                    Manage Classes
                </Link>
                <Link to="/manageEnroll" className="menu-btn">
                    Manage Enroll
                </Link>
                <Link to="/manageAttendance" className="menu-btn">
                    Manage Attendance
                </Link>
                <Link to="/attendanceReports" className="menu-btn">
                    Attendance Reports
                </Link>
                <button className="menu-btn logout-btn">Log Out</button>
            </div>
        </div>
    );
};

export default Sidebar;

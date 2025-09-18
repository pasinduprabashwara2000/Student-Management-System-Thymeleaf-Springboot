import React, { useRef } from "react";
import axios from "axios";
import { Container, Row, Col, Form, Button, Table } from "react-bootstrap";

function ManageStudents() {
    const idRef = useRef();
    const nameRef = useRef();
    const contactRef = useRef();

    const handleSave = () => {
        const studentData = {
            StudentId: idRef.current.value,
            StudentName: nameRef.current.value,
            StudentContact: contactRef.current.value
        };
        axios.post("http://localhost:8080/api/students", studentData)
            .then(() => alert("Saved"))
            .catch(() => alert("Failed"));
    };

    return (
        <Container className="my-4">
            <h2 className="mb-4 text-left">Student Management System</h2>
            <Form>
                <Row className="mb-3">
                    <Col><Form.Group><Form.Label>Student ID</Form.Label><Form.Control type="text" ref={idRef} placeholder="Enter Student ID"/></Form.Group></Col>
                    <Col><Form.Group><Form.Label>Student Name</Form.Label><Form.Control type="text" ref={nameRef} placeholder="Enter Student Name"/></Form.Group></Col>
                    <Col><Form.Group><Form.Label>Contact Number</Form.Label><Form.Control type="text" ref={contactRef} placeholder="Enter Contact Number"/></Form.Group></Col>
                </Row>
                <div className="d-flex gap-2 mb-4">
                    <Button variant="primary" onClick={handleSave}>Save</Button>
                    <Button variant="info">Update</Button>
                    <Button variant="danger">Delete</Button>
                    <Button variant="secondary" type="reset">Reset</Button>
                </div>
            </Form>
            <Table striped bordered hover><thead><tr><th>Student ID</th><th>Student Name</th><th>Contact Number</th></tr></thead><tbody></tbody></Table>
        </Container>
    );
}

export default ManageStudents;

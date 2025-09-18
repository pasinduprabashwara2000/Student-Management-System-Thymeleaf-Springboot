import React, { useRef } from "react";
import { Button, Col, Container, Form, Row, Table } from "react-bootstrap";

function ManageClasses() {
    const classIDRef = useRef();
    const courseIDRef = useRef();
    const subjectIDRef = useRef();
    const lectureIDRef = useRef();
    const dateRef = useRef();

    return (
        <Container className="my-4">
            <h2 className="mb-4 text-left">Classes Management System</h2>
            <Form>
                <Row className="mb-3">
                    <Form.Group as={Col} controlId="classID">
                        <Form.Label>Class ID</Form.Label>
                        <Form.Control type="text" ref={classIDRef} placeholder="Enter Class ID" />
                    </Form.Group>

                    <Form.Group as={Col} controlId="courseID">
                        <Form.Label>Course ID</Form.Label>
                        <Form.Control type="text" ref={courseIDRef} placeholder="Enter Course ID" />
                    </Form.Group>

                    <Form.Group as={Col} controlId="subjectID">
                        <Form.Label>Subject ID</Form.Label>
                        <Form.Control type="text" ref={subjectIDRef} placeholder="Enter Subject ID" />
                    </Form.Group>
                </Row>

                <Row className="mb-3">
                    <Form.Group as={Col} controlId="lectureID">
                        <Form.Label>Lecture ID</Form.Label>
                        <Form.Control type="text" ref={lectureIDRef} placeholder="Enter Lecture ID" />
                    </Form.Group>

                    <Form.Group as={Col} controlId="date">
                        <Form.Label>Date</Form.Label>
                        <Form.Control type="date" ref={dateRef} />
                    </Form.Group>

                    <Col></Col>

                </Row>

                <Row className="mb-4">
                    <Col className="d-flex gap-2">
                        <Button variant="primary" type="button">Save</Button>
                        <Button variant="info" type="button">Update</Button>
                        <Button variant="danger" type="button">Delete</Button>
                        <Button variant="secondary" type="reset">Reset</Button>
                    </Col>
                </Row>
            </Form>

            <div className="table-responsive">
                <Table striped bordered hover>
                    <thead className="table-dark">
                    <tr>
                        <th>Class ID</th>
                        <th>Course ID</th>
                        <th>Subject ID</th>
                        <th>Lecture ID</th>
                        <th>Date</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr></tr>
                    </tbody>
                </Table>
            </div>
        </Container>
    );
}

export default ManageClasses;

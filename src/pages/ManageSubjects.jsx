import React, {useRef} from "react";
import axios from "axios";
import {Button, Col, Container, Form, Row, Table} from "react-bootstrap";

function ManageSubjects(){
    const subIDRef = useRef();
    const nameRef = useRef();
    const courseIDRef = useRef();

    const handleSave = () => {

    }

    return(
        <Container className="my-4">
            <h2 className="mb-4 text-left">Subject Management System</h2>
            <Form>
                <Row className="mb-3">
                    <Col><Form.Group><Form.Label>Subject ID</Form.Label><Form.Control type="text" ref={subIDRef} placeholder="Enter Subject ID"/></Form.Group></Col>
                    <Col><Form.Group><Form.Label>Subject Name</Form.Label><Form.Control type="text" ref={nameRef} placeholder="Enter Subject Name"/></Form.Group></Col>
                    <Col><Form.Group><Form.Label>Course ID</Form.Label><Form.Control type="text" ref={courseIDRef} placeholder="Enter Course ID"/></Form.Group></Col>
                </Row>
                <div className="d-flex gap-2 mb-4">
                    <Button variant="primary" onClick={handleSave}>Save</Button>
                    <Button variant="info">Update</Button>
                    <Button variant="danger">Delete</Button>
                    <Button variant="secondary" type="reset">Reset</Button>
                </div>
            </Form>
            <Table striped bordered hover>
                <thead>
            <tr>
                <th>Subject ID</th>
                <th>Subject Name</th>
                <th>Course ID</th>
            </tr>
                </thead>
                <tbody>
                </tbody>
            </Table>
        </Container>
    );
}

export default ManageSubjects;
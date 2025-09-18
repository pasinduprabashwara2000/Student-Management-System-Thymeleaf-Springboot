import React, {useRef} from "react";
import Axios from "axios";
import {Button, Col, Container, Form, Row, Table} from "react-bootstrap";

function ManageCourses(){
    const idRef = useRef();
    const nameRef = useRef();

    return (
        <Container className="my-4">
            <h2 className="mb-4 text-left">Course Management System</h2>
            <Form>
                <Row className="mb-3">
                    <Col><Form.Group><Form.Label>Course ID</Form.Label><Form.Control type="text" ref={idRef} placeholder="Enter Course ID" /></Form.Group></Col>
                    <Col><Form.Group><Form.Label>Course Name</Form.Label><Form.Control type="text" ref={nameRef} placeholder="Enter Course Name" /></Form.Group></Col>
                </Row>
                <Row>
                    <Col className="d-flex gap-2 mb-4">
                        <Button variant="primary" type="button">Save</Button>
                        <Button variant="info" type="button">Update</Button>
                        <Button variant="danger" type="button">Delete</Button>
                        <Button variant="secondary" type="reset">Reset</Button>
                    </Col>
                </Row>
            </Form>
            <div className="table-responsive">
                <Table striped bordered hover>
                    <thead className="table-dark"><tr><th>Course ID</th><th>Course Name</th></tr></thead>
                    <tbody>
                    <tr></tr>
                    </tbody>
                </Table>
            </div>
        </Container>
    );
}

export default ManageCourses;
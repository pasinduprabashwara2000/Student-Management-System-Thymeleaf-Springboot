import React, { useRef } from "react";
import { Container, Row, Col, Form, Button, Table } from "react-bootstrap";

function ManageLectures() {
    const idRef = useRef();
    const nameRef = useRef();
    const contactRef = useRef();

    return (
        <Container className="my-4">
            <h2 className="mb-4 text-left">Lecture Management System</h2>
            <Form>
                <Row className="mb-3">
                    <Col><Form.Group><Form.Label>Lecture ID</Form.Label><Form.Control type="text" ref={idRef} placeholder="Enter Lecture ID" /></Form.Group></Col>
                            <Col><Form.Group><Form.Label>Lecture Name</Form.Label><Form.Control type="text" ref={nameRef} placeholder="Enter Lecture Name" /></Form.Group></Col>
                            <Col><Form.Group><Form.Label>Contact Number</Form.Label><Form.Control type="text" ref={contactRef} placeholder="Enter Contact Number" /></Form.Group></Col>
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
                    <thead className="table-dark"><tr><th>Lecture ID</th><th>Lecture Name</th><th>Contact Number</th></tr></thead>
                    <tbody>
                    <tr><td>L001</td><td>John Smith</td><td>0771234567</td></tr>
                    <tr><td>L002</td><td>Jane Doe</td><td>0719876543</td></tr>
                    </tbody>
                </Table>
            </div>
        </Container>
    );
}

export default ManageLectures;

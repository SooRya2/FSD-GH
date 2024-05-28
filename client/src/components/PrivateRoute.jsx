import React from 'react';
import { Navigate } from 'react-router-dom';

const PrivateRoute = ({ authToken, children }) => {
  return authToken ? children : <Navigate to="/login" />;
};

export default PrivateRoute;

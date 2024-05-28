import React from 'react';

const ProtectedComponent = () => {
  return (
    <div>
      <h1>Protected Component</h1>
      <p>This content is only accessible to authenticated users.</p>
    </div>
  );
};

export default ProtectedComponent;

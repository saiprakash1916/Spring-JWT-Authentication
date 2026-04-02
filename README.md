# JWT Authentication & Authorization API (Spring Boot)

This project is a Spring Boot REST API implementing JWT-based authentication and role-based authorization.

## Features
→ User Registration & Role Management

→ JWT Authentication (Access Token & Refresh Token)

→ Role-based Authorization (USER, ADMIN, etc.)

→ Spring Security (Stateless)

→ MySQL Database with JPA/Hibernate

## APIs

### Login
```
POST /api/login
```

#### Body (form-data):
```
username=john
password=1234
```

### Get Users
```
GET /api/users 
```
   
### Save User
```
POST /api/user/save
```

#### Body:
```
{
    "name": "John",
    "username": "john",
    "password": "1234"
}
```

### Save Role
```
POST /api/role/save
```
    
### Add Role to User
```
POST /api/role/addtouser
```

#### Body:
```
{
    "username": "john",
    "roleName": "ROLE_ADMIN"
}
```

### Refresh Token
```
POST /api/token/refresh
```

#### Headers:
```
Authorization: Bearer <access token>
```

## Tables
### user
1. id
2. name
3. username
4. password
### role
1. id
2. name
### user_roles
1. user_id
2. role_id
